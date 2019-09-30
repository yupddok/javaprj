package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class PuzzleCanvas extends Canvas {
	private int[] pos = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

	public PuzzleCanvas() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int p1 = rand.nextInt(9);
			int p2 = rand.nextInt(9);

			// �ӽú��� ����
			int x;
			// [1]��° ���� ���� �ӽú����� �ű��
			x = pos[p1];
			// [3]��° ���� ���� [1]��° �濡 �ű��
			pos[p1] = pos[p2];
			// �ӽú����� ���� [3]��° �濡 �ű��
			pos[p2] = x;

			System.out.printf("p1:%d, p2:%d\n", p1, p2);
		}
		for (int i = 0; i < 9; i++) {
			System.out.printf("[%d]", pos[i]);
		}
	}

	@Override
	public void paint(Graphics g) {

		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("src/res/Image.jpg");

		for (int i = 0; i < 9; i++) {
			int x = (i % 3) * 200;
			int y = (i / 3) * 200;
			int w = 200;
			int h = 200;

			int sx = (pos[i] % 3) * 200;
			int sy = (pos[i] / 3) * 200;

			g.drawImage(img, x, y, x + w, y + h, // ȭ��
							sx, sy, sx + w, sy + h, // �̹���
						
							
							this);

		}
	}

}
