package a190918;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		
		// ========== �ε� ==========================
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		
		byte[] buf = new byte[10];
		
		fin.read(buf);
		
		fin.close();
		
		// ========== ���� ũ�� =======================
		int size = ((int)buf[2] & 0xff) << 0  |  //shift ������ ���� ���ڸ��� ���󰣴�. 1001 �̸� 1111�� �ǰ� 0111�̸� 0000�� �ȴ�.
				   ((int)buf[3] & 0xff) << 8  |
				   ((int)buf[4] & 0xff) << 16 |
				   ((int)buf[5] & 0xff) << 24 ;
		
		// ========== ���� ũ�� ��� =======================
		System.out.println("size : " + size);
	}
}