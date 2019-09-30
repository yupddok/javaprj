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
		
		String name1 = "아이유";
		String name2 = new String("아이유");
		
		// 객체비교 
		System.out.println(name1 == name2);  
		// 문자비교
		System.out.println(name1.equals(name2)); 
		System.out.println(name1 == "아이유"); 
		
		
		String fileName = "photo.jpg";
		
		// 문자열의 길이 출력
		System.out.println(fileName.length());
		// 문자열의 위치 몇번째인지 
		System.out.println(fileName.indexOf("."));
		// biginIndex에서부터 endIndex까지 출력
		System.out.println(fileName.substring(0,3));
		
		System.out.println(fileName.substring(0,fileName.indexOf(".")));
		
		String str = fileName.replace('o', 't');
		System.out.println(str);
	}
	

}