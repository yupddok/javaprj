package game.shooting;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	 int x, y;
	 int vx,vy,dx,dy;
	 float w,h,d;
	 Image img;
	 String url;
	Fighter(){
		x=100;
		y=100;
		url = "src/res/fighter.png";
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage(url);
	}
	Fighter(int x,int y,String url){
		this.x=x;
		this.y=y;
		this.url = url;
		Toolkit tk = Toolkit.getDefaultToolkit();
		this.img = tk.getImage(this.url);
	}
	public void draw(Graphics g,ShootingCanvas canvas) {
		g.drawImage(img, x, y, canvas);
	}
	public void move(int x2, int y2) {
		this.dx=x2;
		this.dy=y2;
		w = (dx-x);
		h = (dy-y);
		d = (float)Math.sqrt(w*w+h*h);
		vx = (int)(w/d*10);
		vy = (int)(h/d*10);
	}
	public void update() {
		x += vx;
		y += vy;
		if(vx <= 0  && vy <= 0) {
			vx = 0;
			vy = 0;
		}
	}
}
