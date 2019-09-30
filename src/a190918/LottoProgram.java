package a190918;

import java.util.Arrays;
import java.util.Scanner;

public class LottoProgram {
	public static void main(String[] args) {

		int lotto[] = new int[6];
		int com[] = new int[6];
		int count = 0;

		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j])
					i--;
			}
		}

		printMenu();

		switch (inputMenu()) {
		case 1:
			inputLottoManual(lotto);
			break;
		case 2:
			genLottoAuto(lotto);
			break;
		case 3:
			exitProgram();
		default:
			errorMessage();
		}

		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < com.length; j++) {
				if (com[i] == lotto[j])
					count++;
			}
		}
		System.out.println("��÷��ȣ : " + Arrays.toString(com));
		System.out.println("---------------------------------");
		if (count == 6)
			System.out.println("������ȣ : " + Arrays.toString(lotto) + " 1���Դϴ�!");
		else if (count == 5)
			System.out.println("������ȣ : " + Arrays.toString(lotto) + " 2���Դϴ�!");
		else if (count == 4)
			System.out.println("������ȣ : " + Arrays.toString(lotto) + " 3���Դϴ�!");
		else if (count == 3)
			System.out.println("������ȣ : " + Arrays.toString(lotto) + " 4���Դϴ�!");
		else
			System.out.println("������ȣ : " + Arrays.toString(lotto) + " ���Դϴ�!");
	}

	public static void printMenu() {
		System.out.println("����������������������������������������������");
		System.out.println("��        �ζ�                       ��");
		System.out.println("����������������������������������������������");
		System.out.println(" 1 .   ����");
		System.out.println(" 2 .   �ڵ�");
		System.out.println(" 3 .   ����");
	}

	public static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		return menu;
	}

	public static int[] inputLottoManual(int lotto[]) {
		System.out.print("��ȣ�� �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
		}
		return lotto;
	}
	public static int[] genLottoAuto(int lotto[]) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
		}
		return lotto;
	}
	public static void exitProgram() {
		System.exit(0);
	}
	public static void errorMessage() {
	}
}