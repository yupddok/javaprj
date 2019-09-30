package test1.함수;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class APIProgram {
	public static void main(String[] args) throws IOException {
//		System.out 출력 스트림 객체
		
		//System.out.write('H');  // code 값을 넣는다. 기본입출력은 코드값
		FileInputStream fin = new FileInputStream("src/res/data.txt");
		FileOutputStream fos = new FileOutputStream("src/res/api-out.txt");
		PrintStream fout = new PrintStream(fos); // 출력을 위한 응용객체
		
		int b = System.in.read();
		System.out.println(b);
		
		int b1 = fin.read(); //read 는 1바이트를 얻어온다.
		fout.println(b1);
		
//		int kor = 90;
//		int eng = 80;
		
		
//		System.out.println("Hello");
//		System.out.printf("kor : %d , eng : %d\n" ,kor,eng);
//		System.out.print("\r\n");
//		System.out.print("end");
				
		
		
		
//		fout.write('H');  '' 로 감싸주면 문자라는 뜻; 
		
		
//		fout.println("Hello");
//		fout.printf("kor : %d , eng : %d " ,kor,eng);
//		fout.print("\r \n");
//		fout.print("end");
//		
		fin.close();
		fout.close();
		fos.close();
		
	}
}
