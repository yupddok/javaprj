package ����;
// ���� ���α׷�
public class Program {
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
			int sum = Calculator.add(10004, 3);
			System.out.printf("sum:%d\n", sum);
		} 
		catch (�ʹ�Ŀ����ȯ�Ҽ����¿��� e) {
			System.out.println("aaa"+e.getMessage());
			// ������ �ݾƾ��ϴ� �ڵ� 
		}
		catch(Exception aaa) {
			System.out.println("�˼��մϴ� ����ġ �ʰ� ������ �߻��Ͽ����ϴ�");
			// ������ �ݾƾ��ϴ� �ڵ� 
		}
		// ��� ���ܰ� �߻��ϵ� ���İ� 
		finally {
			System.out.println("finally");
		}
		System.out.println("����?");
	}
}
