package test3;

public class ExamProgram {

	public static void main(String[] args) {

		Exam exam = new Exam(); // Exam객체로 생성될 공간의 이름표 a라는 만들기

//		exam.kor =3; // 캡슐화 된곳에서 다른 변수로 정의 하면 에러가 난다. --> 캡슐이 깨진다.

		// 1. 성적을 입력
		Exam.input(exam); // 점수 입력 참조를 준다~
		
		exam.input();

		Exam.print(exam); // 점수 출력
		
		exam.print();
		
	}
}


