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
	private ArrayList<Integer> scores = new ArrayList<Integer>();
	

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

	public void slicedBomb(Bombs bomb) {
		int reduceLive = bomb.loseLife();
		if(reduceLive == 1){
			reduceLive();
		}
		else if(reduceLive == 3) {
			reduceLive();
			reduceLive();
			reduceLive();
		}
	}
	
	public void reduceLive() {

		lives -= 1;
	}

	public void slice(int elementNumber) {

		if (elements.get(elementNumber) instanceof Fruit) {

			Fruit fruit = (Fruit) elements.get(elementNumber);
			fruit.setSliced(true);
			score(fruit);
		} else if (elements.get(elementNumber) instanceof Bombs) {

			Bombs bomb = (Bombs) elements.get(elementNumber);
			bomb.setSliced(true);
			slicedBomb(bomb);

		}

	}

	public int getBestScore(int level) {
		scores = FileReaderUtils.read();
		return scores.get(level);
	}
	
	public void setBestScore(int score,int level) {
		scores.set(level, score);
		FileWriterUtils.write(scores);
	}
	
	public int getLives() {
		return lives;
	}

	public int getGameScore() {
		return gameScore;
	}
	
	


}
