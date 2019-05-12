package model.gameEngine;

import java.util.ArrayList;
import model.level.LevelStrategy;
import model.save.FileReaderUtils;
import model.save.FileWriterUtils;

public class GameEngine {
	

	public void newGame(LevelStrategy strategy) {
		
	}
	
	public void resetGame() {
		
	}
	
	public void score() {
		
	}
	
	public void bestScore(int score , int level) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores = FileReaderUtils.read();
		if(score > scores.get(level)) {
			scores.set(level, score);
		}
		FileWriterUtils.write(scores);
	}

	
	public int getXlocation​() {
		return 0;
	}
	
	public int getYlocation​() {
		return 0;
	}
	
	public void slice​() {
		
	}
	
	public void move(double time) {
		
	}
	
	public void updateObjectsLocations​() {
		
	}
	
	public void sliceObjects() {
		
	}
	

	
}
