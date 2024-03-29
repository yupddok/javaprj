package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class PuzzleCanvas2 extends Canvas {

	private Puzzle puzzle;

	public PuzzleCanvas2() {
		// 퍼즐에 사용할 재료 준비
		PuzzleContext.setCanvas(this);
		// 퍼즐 생성 
		puzzle = new Puzzle(2);
	}

	@Override
	public void paint(Graphics g) {
		puzzle.paint(g);
	}

}