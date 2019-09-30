package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Puzzle {
	private static Image img;

	static {
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("src/res/Image.jpg");
		
	}

	public Puzzle(int index) {

	}

	public void paint(Graphics g) {
			int i = 0;
			int x = (i % 3) * 200;
			int y = (i / 3) * 200;
			int w = 200;
			int h = 200;

			int sx = (i % 3) * 200;
			int sy = (i / 3) * 200;

			g.drawImage(img, x, y, x + w, y + h, // ȭ��
					sx, sy, sx + w, sy + h, // �̹���
					PuzzleContext.getCanvas());

		

	}

}
