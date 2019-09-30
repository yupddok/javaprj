package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("src/res/data.txt");
		Scanner scan = new Scanner(fin);

		int nums[] = new int[100]; // 배열을 사용할때 일괄 처리에 유리하다. 파일이 오래동안 열려있는것을 방지할수있다.
		int i = 0;

//		while(scan.hasNext()) {
//			nums[i] = scan.nextInt();
//			i++;
//		}

		for (int j = 0; scan.hasNext(); j++) {
			nums[j] = scan.nextInt();
			nums[j + 1] = -1;
		}

		fin.close();

		// ==데이터 개수 ========================================
		int count = 0;
		for (int j = 0; nums[j] != -1; j++)
			count++;

		// ==데이터 합 =========================================
		int sum = 0;
		for (int j = 0; nums[j] != -1; j++)
			sum += nums[j];

		printSumAndAvg(sum, count);
	}
	
	public static void printSumAndAvg(int sum,int count) {
		float avg = (float) sum / (float) count ;
		System.out.printf("합계 : %d \n평균 : %f " ,sum,avg);
	}
	
}