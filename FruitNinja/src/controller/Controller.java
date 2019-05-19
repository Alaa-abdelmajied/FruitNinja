package controller;

import java.util.ArrayList;

import model.Element.Element;
import model.Element.Heart;
import model.gameEngine.Command;
import model.gameEngine.GameEngine;
import model.gameEngine.Invoker;
import model.gameEngine.newGameCommand;
import model.gameEngine.resetCommand;
import model.level.Arcade;
import model.level.Easy;
import model.level.Hard;
import model.level.LevelStrategy;
import model.level.Normal;

public class Controller {

	GameEngine gameEngine = new GameEngine();
	Invoker invoker = new Invoker();
	LevelStrategy level;
	private ArrayList<Element> elements = new ArrayList<Element>();
	private int levelNumber;

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void play(int levelNumber) {

		this.levelNumber = levelNumber;

		if (this.levelNumber == 1) {
			level = new Easy();
			elements = level.elementThrow();
		} else if (this.levelNumber == 2) {
			level = new Normal();
			elements = level.elementThrow();
		} else if (this.levelNumber == 3) {
			level = new Hard();
			elements = level.elementThrow();
		} else if (this.levelNumber == 4) {
			level = new Arcade();
			elements = level.elementThrow();
		}
		commandNewGame(level);

	}

	public ArrayList<Element> updateElements() {
		elements = level.elementThrow();
		return elements;
	}

	public void slice(int elementNumber) {
		gameEngine.slice(elementNumber);
		
	}
	
	public Heart sliceLifePowerUp() {
		Heart heart = new Heart();
		return heart;
	}
	
	public void fallenFruit() {
		gameEngine.reduceLive();
	}

	public int remaingLives() {
		return gameEngine.getLives();
	}

	public int score() {
		return gameEngine.getGameScore();
	}
	
	
	public int getBestScore() {
		return gameEngine.getBestScore(levelNumber);
	}
	
	public void setBestScore() {
		if(score() > gameEngine.getBestScore(levelNumber))
			gameEngine.setBestScore(score(),levelNumber);
	}
	
	public void undoBestScore(int score) {
		gameEngine.setBestScore(score,levelNumber);
	}
	


	public void commandNewGame(LevelStrategy strategy) {

		Command newGame = new newGameCommand(gameEngine, strategy);
		invoker.setCommand(newGame);
		invoker.pressButton();

	}

	public void commandResetGame() {

		Command resetGame = new resetCommand(gameEngine);
		invoker.setCommand(resetGame);
		invoker.pressButton();

	}

}
