package test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class APIProgram {
	public static void main(String[] args) throws IOException {
//		System.out ��� ��Ʈ�� ��ü
		
		//System.out.write('H');  // code ���� �ִ´�. �⺻������� �ڵ尪
		FileInputStream fin = new FileInputStream("src/res/data.txt");
		FileOutputStream fos = new FileOutputStream("src/res/api-out.txt");
		PrintStream fout = new PrintStream(fos); // ����� ���� ���밴ü
		
		int b = System.in.read();
		System.out.println(b);
		
		int b1 = fin.read(); //read �� 1����Ʈ�� ���´�.
		fout.println(b1);
		
//		int kor = 90;
//		int eng = 80;
		
		
//		System.out.println("Hello");
//		System.out.printf("kor : %d , eng : %d\n" ,kor,eng);
//		System.out.print("\r\n");
//		System.out.print("end");
				
		
		
		
//		fout.write('H');  '' �� �����ָ� ���ڶ�� ��; 
		
		
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
