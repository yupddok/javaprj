package game.role;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Kid {
	private int x;
	private int y;
	
	private int sx;
	private int sy;
	
	private int vx;
	private int vy;
	
	private int w;
	private int h;
	
	private static final int OFFSET_LEFT;
	private final static int OFFSET_TOP;
	
	private Image img;
	private int imgIndex;
	
	private int timeForReady = 0;
	
	static {
		OFFSET_LEFT = 32;
		OFFSET_TOP = 32;
	}
	
	
	public Kid() {
		x = 180;
		y = 600;
		w = h = 64;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("src/res/fighter.png");
		imgIndex = 3;
	}
	
	public void update() {
		x += vx;
		y += vy;
		if(timeForReady > 0)
			timeForReady--;
	}

	public void draw(Graphics g, RoleCanavas roleCanavas) {
		int sx = w*imgIndex;
		int sy = 0;
		g.drawImage(img, x-OFFSET_LEFT
					   , y-OFFSET_TOP
					   , x+w-OFFSET_LEFT
					   , y+h-OFFSET_TOP
				       , sx,sy,sx+w ,sy+h  
				       , roleCanavas);
	}

	public void move(Direction direction) {
		switch(direction) {
		// case direction.LEFT; 
		case LEFT:
			imgIndex--;
			if(imgIndex<0) imgIndex=0;
			x -= 5;
			break;
		case RIGHT:
			imgIndex++;
			if(imgIndex>6) imgIndex=6;
			x += 5;
			break;
		}
		
	}
	
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public Missile fire() {
		
		if(timeForReady == 0) {
			Missile m = new Missile(x, y);
			timeForReady = 30;
			return m;
		}
		return null;
		 
	}
	
	

}
