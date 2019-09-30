package 가변배열;

import java.util.Scanner;

public class Exam { // class는 구조를 정의

	private int kor;
	int eng;
	int math; // 구조를 정의 하는 역할 / 함수밖에서 연산은 절대 불가능
	// static int a=3; static은 전역 변수를 만들어준다.

	public static void input(Exam exam) { // 캡슐
		System.out.print("국어 : ");
		Scanner sc = new Scanner(System.in);
		exam.kor = sc.nextInt();
	}
	
	public void input() { 
		System.out.print("국어 : ");
		Scanner sc = new Scanner(System.in);
		this.kor = sc.nextInt();
	}

	public static void print(Exam exam) {  // static 함수 --> 나 instance 함수 아니야~ 함수지향
		System.out.printf("국어 : %d", exam.kor); 
	}
	
	public void print() { // instance 함수 객체를 이용하는 함수 객체지향
		System.out.printf("국어 : %d" , this.kor);
	}
}
