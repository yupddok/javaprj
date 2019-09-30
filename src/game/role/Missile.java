package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Missile {
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	private int w;
	
	private static final int OFFSET_LEFT;
	private Image img;
	
	static {
		OFFSET_LEFT = 10;
	}
	
	public Missile() {
		this(0,0);
		
	}
	
	public Missile(int x, int y) {
		w = 20;
		this.x = x;
		this.y = y;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("src/res/missile.png");
	}
	
	public void update() {
		//x += vx;
		//y += vy;
		y--;
	}

	public void draw(Graphics g, RoleCanavas roleCanavas) {
		g.drawImage(img, x-OFFSET_LEFT, y, roleCanavas);
		
	}

}
