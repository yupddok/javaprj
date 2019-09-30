package 가변배열;

public class GList<명훈>{
	private 명훈[] data;
	private int index;
	private int max;
	
	public GList() {
		max = 3;
		data = (명훈[]) new Object[max];
		index = 0;
	}

	public int size() {
		return index;
	}

	public void add(명훈 value) {
		if(index>=max) {
			// 1. 이주할  Object형식의 배열을 max+5 크기의 temp로 생성
			명훈[] temp = (명훈[]) new Object[max+5];
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

	public 명훈 get(int index) {
		return data[index];
	}

}