package a190918;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {

		// �迭�� ���� ����
		int com[] = new int[7];
		int user2[] = new int[6];
		int user3[] = new int[6];
		int user4[] = new int[6];
		int user5[] = new int[6];
		int user6[] = new int[6];
		int user7[] = new int[6];
		int user8[] = new int[6];
		int user9[] = new int[6];
		int user10[] = new int[6];
		int user11[] = new int[6];

		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		int count11 = 0;

		int bonus2 = 0;
		int bonus3 = 0;
		int bonus4 = 0;
		int bonus5 = 0;
		int bonus6 = 0;
		int bonus7 = 0;
		int bonus8 = 0;
		int bonus9 = 0;
		int bonus10 = 0;
		int bonus11 = 0;

		int temp = 0;

		// �迭�� ���ֱ�
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
				} else if (com[i] == 0) {
					i--;
				}
			}
		}

		for (int i = 0; i < user2.length; i++) {
			user2[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user2[i] == user2[j]) {
					i--;
				} else if (user2[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user3.length; i++) {
			user3[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user3[i] == user3[j]) {
					i--;
				} else if (user3[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user4.length; i++) {
			user4[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user4[i] == user4[j]) {
					i--;
				} else if (user4[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user5.length; i++) {
			user5[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user5[i] == user5[j]) {
					i--;
				} else if (user5[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user6.length; i++) {
			user6[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user6[i] == user6[j]) {
					i--;
				} else if (user6[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user7.length; i++) {
			user7[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user7[i] == user7[j]) {
					i--;
				} else if (user7[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user8.length; i++) {
			user8[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user8[i] == user8[j]) {
					i--;
				} else if (user8[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user9.length; i++) {
			user9[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user9[i] == user9[j]) {
					i--;
				} else if (user9[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user10.length; i++) {
			user10[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user10[i] == user10[j]) {
					i--;
				} else if (user10[i] == 0) {
					i--;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			user11[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (user11[i] == user11[j]) {
					i--;
				} else if (user11[i] == 0) {
					i--;
				}
			}
		}

		// ������������ ����
		for (int i = 0; i < com.length - 1; i++) {
			for (int j = 1; j < com.length - i - 1; j++) {
				if (com[j] < com[j - 1]) {
					temp = com[j - 1];
					com[j - 1] = com[j];
					com[j] = temp;
				}
			}
		}

		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user2[j] < user2[j - 1]) {
					temp = user2[j - 1];
					user2[j - 1] = user2[j];
					user2[j] = temp;
				}
			}
		}

		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user3[j] < user3[j - 1]) {
					temp = user3[j - 1];
					user3[j - 1] = user3[j];
					user3[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user4[j] < user4[j - 1]) {
					temp = user4[j - 1];
					user4[j - 1] = user4[j];
					user4[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user5[j] < user5[j - 1]) {
					temp = user5[j - 1];
					user5[j - 1] = user5[j];
					user5[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user6[j] < user6[j - 1]) {
					temp = user6[j - 1];
					user6[j - 1] = user6[j];
					user6[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user7[j] < user7[j - 1]) {
					temp = user7[j - 1];
					user7[j - 1] = user7[j];
					user7[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user8[j] < user8[j - 1]) {
					temp = user8[j - 1];
					user8[j - 1] = user8[j];
					user8[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user9[j] < user9[j - 1]) {
					temp = user9[j - 1];
					user9[j - 1] = user9[j];
					user9[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user10[j] < user10[j - 1]) {
					temp = user10[j - 1];
					user10[j - 1] = user10[j];
					user10[j] = temp;
				}
			}
		}
		for (int i = 0; i < user11.length; i++) {
			for (int j = 1; j < user11.length - i; j++) {
				if (user11[j] < user11[j - 1]) {
					temp = user11[j - 1];
					user11[j - 1] = user11[j];
					user11[j] = temp;
				}
			}
		}

		// ��ȣ Ȯ��
		for (int i = 0; i < com.length - 1; i++) {
			for (int j = 0; j < user2.length; j++) {
				if (com[i] == user2[j]) {
					count2++;
				} else if (com[i] == user3[j]) {
					count3++;
				} else if (com[i] == user4[j]) {
					count4++;
				} else if (com[i] == user5[j]) {
					count5++;
				} else if (com[i] == user6[j]) {
					count6++;
				} else if (com[i] == user7[j]) {
					count7++;
				} else if (com[i] == user8[j]) {
					count8++;
				} else if (com[i] == user9[j]) {
					count9++;
				} else if (com[i] == user10[j]) {
					count10++;
				} else if (com[i] == user11[j]) {
					count11++;
				}
			}
		}

		for (int i = 0; i < user11.length; i++) {
			if (com[6] == user2[i])
				bonus2++;
			else if (com[6] == user3[i])
				bonus3++;
			else if (com[6] == user4[i])
				bonus4++;
			else if (com[6] == user5[i])
				bonus5++;
			else if (com[6] == user6[i])
				bonus6++;
			else if (com[6] == user7[i])
				bonus7++;
			else if (com[6] == user8[i])
				bonus8++;
			else if (com[6] == user9[i])
				bonus9++;
			else if (com[6] == user10[i])
				bonus10++;
			else if (com[6] == user11[i])
				bonus11++;
		}

		System.out.println("��÷��ȣ : " + Arrays.toString(com));
		System.out.println("----------------------------------------------");

		if (count2 == 6)
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user2) + "�� 1���Դϴ�!");
		else if (count2 == 5 && bonus2 == 1)
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user2) + "�� 2���Դϴ�!");
		else if (count2 == 5)
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user2) + "�� 3���Դϴ�!");
		else if (count2 == 4)
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user2) + "�� 4���Դϴ�!");
		else if (count2 == 3)
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user2) + "�� 5���Դϴ�!");
		else
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user2) + "�� ���Դϴ�!");

		if (count3 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user3) + "�� 1���Դϴ�!");
		} else if (count3 == 5 && bonus3 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user3) + "�� 2���Դϴ�!");
		} else if (count3 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user3) + "�� 3���Դϴ�!");
		} else if (count3 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user3) + "�� 4���Դϴ�!");
		} else if (count3 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user3) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user3) + "�� ���Դϴ�!");
		}

		if (count4 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user4) + "�� 1���Դϴ�!");
		} else if (count4 == 5 && bonus4 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user4) + "�� 2���Դϴ�!");
		} else if (count4 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user4) + "�� 3���Դϴ�!");
		} else if (count4 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user4) + "�� 4���Դϴ�!");
		} else if (count4 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user4) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user4) + "�� ���Դϴ�!");
		}
		if (count5 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user5) + "�� 1���Դϴ�!");
		} else if (count5 == 5 && bonus5 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user5) + "�� 2���Դϴ�!");
		} else if (count5 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user5) + "�� 3���Դϴ�!");
		} else if (count5 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user5) + "�� 4���Դϴ�!");
		} else if (count5 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user5) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user5) + "�� ���Դϴ�!");
		}
		if (count6 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user6) + "�� 1���Դϴ�!");
		} else if (count6 == 5 && bonus6 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user6) + "�� 2���Դϴ�!");
		} else if (count6 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user6) + "�� 3���Դϴ�!");
		} else if (count6 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user6) + "�� 4���Դϴ�!");
		} else if (count6 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user6) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user6) + "�� ���Դϴ�!");
		}
		if (count7 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user7) + "�� 1���Դϴ�!");
		} else if (count7 == 5 && bonus7 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user7) + "�� 2���Դϴ�!");
		} else if (count7 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user7) + "�� 3���Դϴ�!");
		} else if (count7 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user7) + "�� 4���Դϴ�!");
		} else if (count7 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user7) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user7) + "�� ���Դϴ�!");
		}
		if (count8 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user8) + "�� 1���Դϴ�!");
		} else if (count8 == 5 && bonus8 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user8) + "�� 2���Դϴ�!");
		} else if (count8 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user8) + "�� 3���Դϴ�!");
		} else if (count8 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user8) + "�� 4���Դϴ�!");
		} else if (count8 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user8) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user8) + "�� ���Դϴ�!");
		}
		if (count9 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user9) + "�� 1���Դϴ�!");
		} else if (count9 == 5 && bonus9 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user9) + "�� 2���Դϴ�!");
		} else if (count9 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user9) + "�� 3���Դϴ�!");
		} else if (count9 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user9) + "�� 4���Դϴ�!");
		} else if (count9 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user9) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user9) + "�� ���Դϴ�!");
		}
		if (count10 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user10) + "�� 1���Դϴ�!");
		} else if (count10 == 5 && bonus10 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user10) + "�� 2���Դϴ�!");
		} else if (count10 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user10) + "�� 3���Դϴ�!");
		} else if (count10 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user10) + "�� 4���Դϴ�!");
		} else if (count10 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user10) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user10) + "�� ���Դϴ�!");
		}
		if (count11 == 6) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user11) + "�� 1���Դϴ�!");
		} else if (count11 == 5 && bonus11 == 1) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user11) + "�� 2���Դϴ�!");
		} else if (count11 == 5) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user11) + "�� 3���Դϴ�!");
		} else if (count11 == 4) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user11) + "�� 4���Դϴ�!");
		} else if (count11 == 3) {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user11) + "�� 5���Դϴ�!");
		} else {
			System.out.println("�ڵ���ȣ : " + Arrays.toString(user11) + "�� ���Դϴ�!");
		}
	}
}
