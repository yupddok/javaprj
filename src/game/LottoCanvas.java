package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class LottoCanvas extends Canvas{
	private int[] lotto = {1,3,5,9,10,12};
	
	public LottoCanvas() {
		
	}
	
	@Override
	public void paint(Graphics g) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("src/res/cards.png");
		{
		for(int i=0; i<6; i++) {
		int x = i*61;
		int y = 0;
		int w = 61;
		int h = 80;
		
		int sx = (lotto[i]-1)*61;
		int sy = 0;
		
		g.drawImage(img, x, y, x+w, y+h, 
						sx, sy, sx+w, sy+h
						,this);
		
		}
		}
	}

}
