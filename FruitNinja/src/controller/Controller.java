package controller;

import model.gameEngine.Command;
import model.gameEngine.GameEngine;
import model.gameEngine.Invoker;
import model.gameEngine.bestScoreCommand;
import model.gameEngine.newGameCommand;
import model.gameEngine.resetCommand;
import model.level.LevelStrategy;

public class Controller {
	
	GameEngine gameEngine = new GameEngine();
	Invoker invoker = new Invoker();

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
