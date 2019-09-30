package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameCanvas extends Canvas {
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("src/res/image.jpg");
		
		{
		int x = 0;
		int y = 0;
		int w = 200;
		int h = 200;
		
		g.drawImage(img, x, y, x+w, y+h, // 화면 
						 0, 0, 200, 200, // 이미지 
						 this);
		}
		
		{
		int x = 200;
		int y = 0;
		int w = 200;
		int h = 200;
		
		g.drawImage(img, x, y, x+w, y+h,
						 0, 200, 200, 400, 
						 this);
		}
		
		{
		int x = 0;
		int y = 200;
		int w = 200;
		int h = 200;
			
		g.drawImage(img, x, y, x+w, y+h,
						 200, 0, 400, 200, 
						 this);
			}
		{
		int x = 200;
		int y = 200;
		int w = 200;
		int h = 200;
			
		g.drawImage(img, x, y, x+w, y+h,
						 200, 200, 400, 400, 
						 this);
			}
		
		
		
	}

}
