package controller;

import java.util.LinkedList;
import java.util.Queue;

import model.Element;
import model.bomb.Bombs;
import model.bomb.Dangerous;
import model.bomb.Fatal;
import model.fruit.Apple;
import model.fruit.Fruit;
import model.fruit.Orange;
import model.fruit.Pear;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;
import model.gameEngine.Command;
import model.gameEngine.GameEngine;
import model.gameEngine.Invoker;
import model.gameEngine.bestScoreCommand;
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
	Queue<Element> gameQueue = new LinkedList<>();

	public void play(int levelNumber) {
		if (levelNumber == 1) {
			level = new Easy();
			gameQueue = level.gameQueue();
		} else if (levelNumber == 2) {
			level = new Normal();
			gameQueue = level.gameQueue();
		} else if (levelNumber == 3) {
			level = new Hard();
			gameQueue = level.gameQueue();
		} else if (levelNumber == 4) {
			level = new Arcade();
			gameQueue = level.gameQueue();
		}
		gameEngine.newGame(level);
		elementThrower();
	}

	public void elementThrower() {
		int elementNumber;
		while (gameEngine.getLives() > 0) {
			gameQueue = level.gameQueue();
			for (int i = 0; i < 20; i++) {
				if (gameQueue.peek() instanceof Fruit) {
					if (gameQueue.peek() instanceof Apple)
						elementNumber = 1;
					else if (gameQueue.peek() instanceof Orange)
						elementNumber = 2;
					else if (gameQueue.peek() instanceof Pear)
						elementNumber = 3;
					else if (gameQueue.peek() instanceof Strawberry)
						elementNumber = 4;
					else if (gameQueue.peek() instanceof SpecialApple)
						elementNumber = 5;
					else if (gameQueue.peek() instanceof SpecialGrape)
						elementNumber = 6;
				}

				else if (gameQueue.peek() instanceof Bombs) {

					if (gameQueue.peek() instanceof Fatal)
						elementNumber = 7;
					else if (gameQueue.peek() instanceof Dangerous)
						elementNumber = 8;

				}
			}
		}
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

	public void commandBestScore(int score, int level) {

		Command bestScore = new bestScoreCommand(gameEngine, score, level);
		invoker.setCommand(bestScore);
		invoker.pressButton();

	}

}
