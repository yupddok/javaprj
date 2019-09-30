package 가변배열;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		GList list = new GList(); 
		list.add("Hello");
		list.add(30);
		list.add(new Exam());
		
		((Exam)list.get(2)).input();
		//list.get(2).input();
		
		//ObjectList list = new ObjectList(); 
		// 모든 것을 담는 것은 단점일 수 있다 
		// 서비스 함수를 사용하려면 형식을 변환해야한다
		//((Exam)list.get(2)).input();
		
//		Object[] data = new Object[3];
//		int index = 0;
		
//		int exit = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		
		
		
//		do {
//			input(list);
//			print(list);
////			input(data/*참조전달*/, index/*값전달*/);
////			print(data, index);
//			System.out.print("go?(1 or 0) :");
//			exit = scan.nextInt();
//		} while(exit != 1);
//	}
//
//	private static void input(ObjectList list) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("kor:");
//		list.add(scan.nextInt());
////		data[index] = scan.nextInt();
////		index++; 
//	}
//	
//	private static void print(ObjectList list) {
//		for (int i = 0; i < list.size(); i++) {
//			System.out.printf("kor:%d", list.get(i));
//		}
		
	}

	

}