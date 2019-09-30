package �����迭;

public class ObjectList {
	private Object[] data;
	private int index;
	private int max;
	
	public ObjectList() {
		max = 3;
		data = new Object[max];
		index = 0;
	}

	public int size() {
		return index;
	}

	public void add(Object value) {
		if(index>=max) {
			// 1. ������  Object������ �迭�� max+5 ũ���� temp�� ����
			Object[] temp = new Object[max+5];
			// 2. data�迭�� ������ temp�迭�� �ű�� 
			for (int i = 0; i < max; i++) {
				temp[i] = data[i];
			}
			// 3. temp �迭�� �̸��� data��� �̸����� �����Ѵ� 
			data = temp;
			// 4. max�� ���� 5���� 
			max += 5;
		}
		data[index] = value;
		index++;
	}

	public Object get(int index) {
		return data[index];
	}

}