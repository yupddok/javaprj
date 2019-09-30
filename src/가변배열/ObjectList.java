package 가변배열;

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
			// 1. 이주할  Object형식의 배열을 max+5 크기의 temp로 생성
			Object[] temp = new Object[max+5];
			// 2. data배열의 값들을 temp배열로 옮긴다 
			for (int i = 0; i < max; i++) {
				temp[i] = data[i];
			}
			// 3. temp 배열의 이름을 data라는 이름으로 변경한다 
			data = temp;
			// 4. max의 값을 5증가 
			max += 5;
		}
		data[index] = value;
		index++;
	}

	public Object get(int index) {
		return data[index];
	}

}