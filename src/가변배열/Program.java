package �����迭;

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
		// ��� ���� ��� ���� ������ �� �ִ� 
		// ���� �Լ��� ����Ϸ��� ������ ��ȯ�ؾ��Ѵ�
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
////			input(data/*��������*/, index/*������*/);
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