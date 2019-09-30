package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	public static void main(String[] args) {
		// �÷��� : �迭�� ��ü�� 
		// �����͸� �ĺ��ϴ� ����� ���̸� �ΰ� �ִ� �迭��
		// 1. �����Ͱ� �� �ĺ��ڴ� => Set �迭
		// ���� ���� ��� �����ȵ� (�ߺ�����)
		Set set = new HashSet(); 
		set.add("hello");
		set.add(37);
		set.add("ȣȣȣ");
		set.add(37);
		set.add("ȣȣȣ");
		
		for(Object obj : set)
			System.out.println(obj);
		
		System.out.println("------");
		
		// 2. �������� ������ �� �ĺ��ڴ� => List �迭
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add("ȣȣȣ");
		list.add(37);
		list.add("ȣȣȣ");
		
//		for (int i = 0; i < list.size(); i++) 
//			System.out.println(list.get(i));
		
		// �÷��� ��ü���
		// for each�� <-�����ϴ� ���� ������ �ִ� ��ü 
		for(Object obj : list)
			System.out.println(obj);
		System.out.println("------");
		
		
		// 3. �������� �ĺ��ڰ� ���� �ִ� => Map �迭
		// �ӽ� ������ ������ ȿ���� 
		Map map = new HashMap();
		map.put("�̸�", "ȫ�浿");
		map.put("����", "17");
		map.put("�ּ�", "�Ѿ�");
		
		System.out.println(map.get("�ּ�"));
		
		for(Object k : map.keySet()) 
			System.out.printf("key:%s, value:%s\n", k, map.get(k));
		
		// ���� �ݷ��� 
		// Generic : ��� �������ε� ���� �� �ִ� ? 
		
		
		
			
	}

}