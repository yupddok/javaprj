package �����迭;

public class GList<����>{
	private ����[] data;
	private int index;
	private int max;
	
	public GList() {
		max = 3;
		data = (����[]) new Object[max];
		index = 0;
	}

	public int size() {
		return index;
	}

	public void add(���� value) {
		if(index>=max) {
			// 1. ������  Object������ �迭�� max+5 ũ���� temp�� ����
			����[] temp = (����[]) new Object[max+5];
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

	public ���� get(int index) {
		return data[index];
	}

}