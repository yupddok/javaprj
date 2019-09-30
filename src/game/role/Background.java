package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Background {
	private int x;
	private int y;
	private Image img;
	
	public Background() {
		x = 0;
		y = 0;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("src/res/space.jpg");		
	}
	
	public void draw(Graphics g, RoleCanavas roleCanvas) {
		g.drawImage(img, x, y-1200, roleCanvas);
		g.drawImage(img, x, y, roleCanvas);
	}

	public void update() {
		y++;
//		if(y==1066) y=0;
		if(y >= 1200) y=0;
	}
	

}
