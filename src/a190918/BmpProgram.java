package a190918;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BmpProgram {
	public static void main(String[] args) throws IOException {
		
		// ========== 로드 ==========================
		FileInputStream fin = new FileInputStream("src/res/image.bmp");
		
		byte[] buf = new byte[10];
		
		fin.read(buf);
		
		fin.close();
		
		// ========== 파일 크기 =======================
		int size = ((int)buf[2] & 0xff) << 0  |  //shift 연산은 제일 앞자리를 따라간다. 1001 이면 1111이 되고 0111이면 0000이 된다.
				   ((int)buf[3] & 0xff) << 8  |
				   ((int)buf[4] & 0xff) << 16 |
				   ((int)buf[5] & 0xff) << 24 ;
		
		// ========== 파일 크기 출력 =======================
		System.out.println("size : " + size);
	}
}