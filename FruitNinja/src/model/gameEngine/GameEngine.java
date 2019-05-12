package model.gameEngine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import model.Element;
import model.level.Level;
import model.level.LevelStrategy;
import model.save.FileReaderUtils;
import model.save.FileWriterUtils;
import model.fruit.*;
import model.bomb.*;

public class GameEngine {

	Level level;
	LevelStrategy strategy;
	Queue<Element> gameQueue = new LinkedList<>();
	int gameScore;
	int lives;
	

	public void newGame(LevelStrategy strategy) {

		this.strategy = strategy;
		level = new Level(strategy);
		gameQueue = level.gameQueue();
		gameScore = 0;
		lives = 3;

	}

	public void resetGame() {
		
		newGame(strategy);
	}

	public int score(Fruit fruit) {

		
		gameScore += fruit.increaseScore();

		return gameScore;
	}

	public void reduceLive(Bombs bomb) {

		
		lives -= bomb.loseLife();
		if (lives <= 0) {

			// toDofunction
			// bestScore(score, level);

		}

	}

	public void slice​() {

		if (gameQueue.peek() instanceof Fruit) {

			Fruit fruit = (Fruit) gameQueue.peek();
			score(fruit);
		} else if (gameQueue.peek() instanceof Bombs) {

			Bombs bomb = (Bombs) gameQueue.peek();
			reduceLive(bomb);

		}

	}

	public void bestScore(int score, int level) {
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores = FileReaderUtils.read();
		if (score > scores.get(level)) {
			scores.set(level, score);
		}
		FileWriterUtils.write(scores);
	}

	/*
	 * public int getXlocation​() { return 0; }
	 * 
	 * public int getYlocation​() { return 0; }
	 */

	/*
	 * public void updateObjectsLocations​() {
	 * 
	 * } public void sliceObjects() {
	 * 
	 * }
	 */

}
