package test2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
		// 1. ���� �Է� ��Ʈ�� fin ��ü�� ������ ��.
		
//		FileInputStream fin = new FileInputStream("src/res/test.bmp");
		// ������ ��������
		// ����� ������

		// 2. ���Ͽ��� ù ��° 1����Ʈ�� �о ��� �� ��.
//		int value = fin.read();
		
//		System.out.println(value);
		
		//3. ���� �Է� ��Ʈ���� ���� ��.
//		fin.close();
		
		FileOutputStream fout = new FileOutputStream("src/res/test.txt"); // �ƿ�ǲ��Ʈ���� ������ ������ ����� ���
		
		fout.write(12); // write -> ��� ���ۿ� ��ƶ�
		fout.write('2');
		fout.flush(); // ���ۿ� ������ ���
		

		fout.close();
		System.out.println("�۾� ����");
		
		
	}
}
