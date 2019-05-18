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
	private ArrayList<Element> elements = new ArrayList<Element>();
	private int gameScore;
	private int lives;
	

	public void newGame(LevelStrategy strategy) {

		this.strategy = strategy;
		level = new Level(strategy);
		elements = level.elementThrow();
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

	public void slice​(int elementNumber) {

		if (elements.get(elementNumber) instanceof Fruit) {

			Fruit fruit = (Fruit) elements.get(elementNumber);
			fruit.setSliced(true);
			System.out.println(score(fruit));
		} else if (elements.get(elementNumber) instanceof Bombs) {

			Bombs bomb = (Bombs) elements.get(elementNumber);
			bomb.setSliced(true);
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

	public int getLives() {
		return lives;
	}

	public int getGameScore() {
		return gameScore;
	}
	
	


}
