package 예외;

public class 너무커서반환할수없는예외 extends Exception {
	@Override
	public String getMessage() {
		//화이팅해요- sy ?? 왜 안나오지
		return "10000이 넘는 값이 반환 되어서는 안되는 오류가 발생하였습니다.";
	}

}
