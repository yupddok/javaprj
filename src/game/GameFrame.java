package game;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Robot;

import game.role.RoleCanavas;

public class GameFrame extends Frame {
	
	private Canvas canvas;
	
	public GameFrame() {
		setBounds(0, 0, 600, 600);
		// canvas = new GameCanvas();
		// canvas = new PuzzleCanvas();
		// canvas = new PuzzleCanvas2();
//		 canvas = new LottoCanvas();
		 //canvas = new RoleCanavas();
		
		add(canvas);
		
		setVisible(true);
	}
	
	
}



 