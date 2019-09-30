package game.shooting;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameFrame extends Frame implements WindowListener{
	private Canvas canvas;
	public GameFrame() {
		setBounds(100, 100, 800, 800);
		//setBackground(Color.black);
		setVisible(true);
		canvas = new ShootingCanvas(); // ������ ������ �� ��ȭ�� ����
		add(canvas); // ĵ���� ���� ��ü �����쿡 ���̱� �۾�
		
		canvas.setFocusable(true);
		canvas.requestFocus();
		
		addWindowListener(this);
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
