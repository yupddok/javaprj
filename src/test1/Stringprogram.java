package test1;

public class Stringprogram {
	public static void main(String[] args) {
		String kor_ = "40";
		String math_ = "50";
		String eng_ = "60";
		
		int kor = Integer.parseInt(kor_);
		int math = Integer.parseInt(math_);
		int eng = Integer.parseInt(eng_);
		
		int total = kor + math + eng;
		
		System.out.printf("total:%d\n", total);
		
		String name1 = "������";
		String name2 = new String("������");
		
		// ��ü�� 
		System.out.println(name1 == name2);  
		// ���ں�
		System.out.println(name1.equals(name2)); 
		System.out.println(name1 == "������"); 
		
		
		String fileName = "photo.jpg";
		
		// ���ڿ��� ���� ���
		System.out.println(fileName.length());
		// ���ڿ��� ��ġ ���°���� 
		System.out.println(fileName.indexOf("."));
		// biginIndex�������� endIndex���� ���
		System.out.println(fileName.substring(0,3));
		
		System.out.println(fileName.substring(0,fileName.indexOf(".")));
		
		String str = fileName.replace('o', 't');
		System.out.println(str);
	}
	

}