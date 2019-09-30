package game.role;

import java.awt.Frame;

public class Program {
	public static void main(String[] args) {
		Frame frame = new GameFrame();
		
//		Thread th = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				printList();
//			}
//		});
//		th.start();
		
//		Thread th = new Thread(()->printList());
//		th.start();
		
		
	}
	private static void printList() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("sub: %d\n",i+1);
		}
	}
}
