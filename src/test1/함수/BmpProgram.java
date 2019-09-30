package test1.함수;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		
		byte[] buf = new byte[10];
		
		fin.read(buf);
		
		int size = (int)buf[2] >> 0  |  //shift 연산은 제일 앞자리를 따라간다. 1001 이면 1111이 되고 0111이면 0000이 된다.
				   (int)buf[3] >> 8  |
				   (int)buf[4] >> 16 |
				   (int)buf[5] >> 24 ;
				   
		System.out.println("size : " + size);
		
		fin.close();
		
		
		
		
	}
}
