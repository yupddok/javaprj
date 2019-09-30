package test2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		// 1. 파일 입력 스트림 fin 객체를 생성할 것.
		
//		FileInputStream fin = new FileInputStream("src/res/test.bmp");
		// 절대경로 역슬래쉬
		// 상대경로 슬래쉬

		// 2. 파일에서 첫 번째 1바이트를 읽어서 출력 할 것.
//		int value = fin.read();
		
//		System.out.println(value);
		
		//3. 파일 입력 스트림을 닫을 것.
//		fin.close();
		
		FileOutputStream fout = new FileOutputStream("src/res/test.txt"); // 아웃풋스트림은 파일이 없으면 만들어 사용
		
		fout.write(12); // write -> 출력 버퍼에 담아라
		fout.write('2');
		fout.flush(); // 버퍼에 담은걸 출력
		

		fout.close();
		System.out.println("작업 종료");
		
		
	}
}
