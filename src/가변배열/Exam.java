package �����迭;

import java.util.Scanner;

public class Exam { // class�� ������ ����

	private int kor;
	int eng;
	int math; // ������ ���� �ϴ� ���� / �Լ��ۿ��� ������ ���� �Ұ���
	// static int a=3; static�� ���� ������ ������ش�.

	public static void input(Exam exam) { // ĸ��
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		exam.kor = sc.nextInt();
	}
	
	public void input() { 
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		this.kor = sc.nextInt();
	}

	public static void print(Exam exam) {  // static �Լ� --> �� instance �Լ� �ƴϾ�~ �Լ�����
		System.out.printf("���� : %d", exam.kor); 
	}
	
	public void print() { // instance �Լ� ��ü�� �̿��ϴ� �Լ� ��ü����
		System.out.printf("���� : %d" , this.kor);
	}
}
