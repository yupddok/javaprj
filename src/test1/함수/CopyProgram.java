package test1.�Լ�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("src/res/image.bmp");

		FileOutputStream fos = new FileOutputStream("src/res/image_Copy.bmp");
		

		byte[] buf = new byte[1024]; 
		int size = 0;
		
		while ((size = fin.read(buf)) != -1)
			fos.write(buf,0,size);

		fin.close();
		fos.close();

		System.out.println("����Ϸ�");
	}
}
