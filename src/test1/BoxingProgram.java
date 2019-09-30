package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	public static void main(String[] args) {
		// 컬렉션 : 배열의 대체제 
		// 데이터를 식별하는 방법에 차이를 두고 있는 계열들
		// 1. 데이터가 곧 식별자다 => Set 계열
		// 같은 값일 경우 누적안됨 (중복제거)
		Set set = new HashSet(); 
		set.add("hello");
		set.add(37);
		set.add("호호호");
		set.add(37);
		set.add("호호호");
		
		for(Object obj : set)
			System.out.println(obj);
		
		System.out.println("------");
		
		// 2. 데이터의 순서가 곧 식별자다 => List 계열
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add("호호호");
		list.add(37);
		list.add("호호호");
		
//		for (int i = 0; i < list.size(); i++) 
//			System.out.println(list.get(i));
		
		// 컬렉션 전체출력
		// for each문 <-열거하는 서비스 가지고 있는 객체 
		for(Object obj : list)
			System.out.println(obj);
		System.out.println("------");
		
		
		// 3. 데이터의 식별자가 따로 있다 => Map 계열
		// 임시 데이터 구조로 효과적 
		Map map = new HashMap();
		map.put("이름", "홍길동");
		map.put("나이", "17");
		map.put("주소", "한양");
		
		System.out.println(map.get("주소"));
		
		for(Object k : map.keySet()) 
			System.out.printf("key:%s, value:%s\n", k, map.get(k));
		
		// 범용 콜렉션 
		// Generic : 어떠한 형식으로도 변할 수 있는 ? 
		
		
		
			
	}

}