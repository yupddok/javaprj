package game.role;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import 가변배열.ObjectList;

public class RoleCanavas extends Canvas implements MouseListener, KeyListener {
	
	private Kid kid;
	private Background bg;
//	private Missile[] missiles;
	private List<Missile> missiles;
//	int cnt;
	private Enemy enemy;
	
	public RoleCanavas() {
		
		kid = new Kid();
		bg = new Background();
//		missiles = new Missile[100]
//		missiles = new ArrayList<Missile>();
		missiles = new ArrayList<>();
		
		addMouseListener(this);
		addKeyListener(this);
		
		new Thread(() -> {
			while (true) {
				try {
					kid.update();
					bg.update();
					
//						for (int i = 0; i < missiles.length; i++) {
//							if(missiles[i] != null)
//								missiles[i].update();
//						}
					
//					for(Object o : missiles) {
//						Missile m = (Missile)o;
//						m.update();
//					}
//					for(Missile m : missiles) {
//						m.update();
//					}
					
					for (int i = 0; i < missiles.size(); i++) {
//						((Missile)missiles.get(i)).update();
						missiles.get(i).update();
					}
	
					Thread.sleep(5);
					repaint();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}
	
	@Override
	public void paint(Graphics g) {
		
		Image bufImage = createImage(this.getWidth(), this.getHeight());
		
		Graphics g2 = bufImage.getGraphics();
		bg.draw(g2, this);
		
//		for (int i = 0; i < missiles.length; i++) {
//			if(missiles[i] != null)
//				missiles[i].draw(g2, this);
//		}
		
//		for(Object o : missiles) {
//			((Missile)o).draw(g2, this);
//		}
		
		for (int i = 0; i < missiles.size(); i++) {
//			((Missile)missiles.get(i)).draw(g2, this);
			missiles.get(i).draw(g2, this);
		}
		
		kid.draw(g2, this);
		
		g.drawImage(bufImage, 0, 0, this);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT : 
			kid.move(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT : 
			kid.move(Direction.RIGHT);
			break;
		case KeyEvent.VK_UP : 
			break;
		case KeyEvent.VK_DOWN :
			break;
		case KeyEvent.VK_SPACE :
//			missiles[cnt] = kid.fire();
//			cnt++;
			Missile m = kid.fire();
			if(m!=null)
				missiles.add(m);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	

}
