package test1;

public class Boxing {
	public static void main(String[] args) {
	// Wrapper class
	int x =3;
	float y = 3.5f;
	char c = 'a';
	double d = 4.7;
	Exam r = new Exam();
	
	Object[] data = new Object[5];
	//data[0] = new Integer(x);
	data[0] = Integer.valueOf(x);
	data[1] = y;
	data[2] = new Character(c);
	data[3] = d;
	data[4] = r;
	
	for (int i = 0; i < data.length; i++) {
		System.out.println(data[i]);
	}
	
	// String class
	int s = new String("hello").length();
	int s2 = "hello".length();
	String s3 = "hello"+3;
	
	String s4 = "hello";
	String s5 = "okay";
	String s6 = s4+s5;
	
	// Wrapper Ŭ������ �̿��� ���� ��ȯ
	// ���ڿ��� �� ������ ��ȯ 
	int n = 3;
	String s7 = Integer.toString(n);
	//String s7 = String.valueOf(n);
	
	String s8 = "35";
	int m = s;
	int x1 = Integer.parseInt(s8);
	
	
	
	}
}
