package ����;
//API
public class Calculator {
	public static int add(int x , int y) throws �ʹ�Ŀ����ȯ�Ҽ����¿��� {
		int result = x+y;
		if(result > 10000)
			throw new �ʹ�Ŀ����ȯ�Ҽ����¿���();
		return result;
	}
	
	public static int sub(int x , int y) {
		int result = x-y;
		return result;
	}
	
	public static int div(int x , int y) {
		int result = x/y;
		return result;
	}	
}
