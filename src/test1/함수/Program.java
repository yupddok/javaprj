package test1.�Լ�;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {

		int[] nums = new int[10]; // [] �� �������� �����ִ� �ȿ� ���굵 ���� ������ ����

		FileInputStream fin = new FileInputStream("C:\\eclipse\\workspace\\basic\\src\\res\\data.txt");
		Scanner fscan = new Scanner(fin);

		int num = 0;
		int sum = 0;
		double avg = 0.f;

//		for (int i = 0; i < 7; i++) {
//			num = fscan.nextInt();
//			System.out.println(num);
			
//			fscan.hasNext() // hasNext �������ֳ� �ϰ� ����� �Լ�
//		}
		
		int count = 0;
		
		while(fscan.hasNext()) {
			num = fscan.nextInt();
			sum += num;
			count++;

		}
		avg = (double)sum / (double)count;
		
		System.out.println(sum);
		System.out.println(avg);
		
//		System.out.println(sum);
//		
		fscan.close();
		fin.close();
		// next �� ������ ���������� �д´�.
	}
}
