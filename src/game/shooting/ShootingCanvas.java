package game.shooting;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ShootingCanvas extends Canvas implements MouseListener,KeyListener{
		Fighter fighter;
		Fighter enemy;		
		
		public ShootingCanvas() {
			addMouseListener(this);
			addKeyListener(this);
			fighter = new Fighter(500,500,"src/res/fighter.png");
			enemy = new Fighter(200,150,"src/res/enemy.png");
//			Toolkit tk = Toolkit.getDefaultToolkit();// static �Լ�~
//			fighter.img = tk.getImage("src/res/fighter.png");
			
//			Toolkit tk2 = Toolkit.getDefaultToolkit();// static �Լ�~
//			fighter2.img = tk2.getImage("src/res/fighter.png");
			new Thread(()->{
				while(true) {
					try {
						fighter.update();
						Thread.sleep(17);//17ms���� ��� ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}
			}).start();
		}
		@Override
		public void paint(Graphics g) {
			fighter.draw(g,this);
			enemy.draw(g,this);
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			fighter.move(e.getX(),e.getY());
			enemy.move(e.getX(),e.getY()-200);
			repaint();
		}
		@Override
		public void mousePressed(MouseEvent e) {
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		@Override
		public void keyTyped(KeyEvent e) {
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case 37: 
				fighter.x -= 3;
				enemy.x += 3;
				break;
			case 38: fighter.y -= 3;enemy.y += 3;
				break;
			case 39:fighter.x += 3;enemy.x -= 3;
				break;
			case 40:fighter.y += 3;enemy.y -= 3;
				break;

			default:
				break;
			}
			repaint();
		}
		@Override
		public void keyReleased(KeyEvent e) {
			
		}
}
