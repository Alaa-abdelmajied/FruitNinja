package model.gameEngine;

import java.util.ArrayList;

import model.Element.Element;
import model.Element.Heart;
import model.bomb.Bombs;
import model.fruit.Banana;
import model.fruit.Fruit;
import model.fruit.Pineapple;
import model.level.Level;
import model.level.LevelStrategy;
import model.save.FileReaderUtils;
import model.save.FileWriterUtils;

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

	public void score(Fruit fruit) {

		gameScore += fruit.increase();

	}

	public void reduceScore (Fruit fruit) {
		gameScore -=fruit.increase();
		if (gameScore < 0)
		gameScore = 0;
	}
	
	
	public void scorePowrUp(Fruit fruit) {
		gameScore *= fruit.increase();
	}

	public void lifePowerUp(Heart heart) {
		if (lives < 3) {
			lives += heart.increase();
		}
	}
	
	public int increaseTime(int elementNumber) {
		Fruit fruit = (Fruit) elements.get(elementNumber);
		return fruit.increase();
	}

	public void slicedBomb(Bombs bomb) {
		int reduceLive = bomb.loseLife();
		if (reduceLive == 1) {
			reduceLive();
		} else if (reduceLive == 3) {
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
			if(fruit instanceof Pineapple)
				scorePowrUp(fruit);
			else if (fruit instanceof Banana)
				reduceScore(fruit);
			else
				score(fruit);
		} else if (elements.get(elementNumber) instanceof Bombs) {

			Bombs bomb = (Bombs) elements.get(elementNumber);
			slicedBomb(bomb);

		}
		else if(elements.get(elementNumber) instanceof Heart) {
			Heart heart = (Heart) elements.get(elementNumber);
			lifePowerUp(heart);	
		}

	}

	public int getBestScore(int level) {
		scores = FileReaderUtils.read();
		return scores.get(level);
	}

	public void setBestScore(int score, int level) {
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
