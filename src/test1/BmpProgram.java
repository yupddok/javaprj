package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		
		byte[] buf = new byte[10];
		
		fin.read(buf);
		
		int size = (int)buf[2] >> 0  |  //shift ������ ���� ���ڸ��� ���󰣴�. 1001 �̸� 1111�� �ǰ� 0111�̸� 0000�� �ȴ�.
				   (int)buf[3] >> 8  |
				   (int)buf[4] >> 16 |
				   (int)buf[5] >> 24 ;
				   
		System.out.println("size : " + size);
		
		fin.close();
		
		
		
		
	}
}
