package test3;

public class ExamProgram {

	public static void main(String[] args) {

		Exam exam = new Exam(); // Exam��ü�� ������ ������ �̸�ǥ a��� �����

//		exam.kor =3; // ĸ��ȭ �Ȱ����� �ٸ� ������ ���� �ϸ� ������ ����. --> ĸ���� ������.

		// 1. ������ �Է�
		Exam.input(exam); // ���� �Է� ������ �ش�~
		
		exam.input();

		Exam.print(exam); // ���� ���
		
		exam.print();
		
	}
}


