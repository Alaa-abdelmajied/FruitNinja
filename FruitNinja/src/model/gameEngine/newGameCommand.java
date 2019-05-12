package model.gameEngine;

import model.level.LevelStrategy;

public class newGameCommand implements Command{

	GameEngine gameEngine;
	LevelStrategy strategy;
	
	public newGameCommand(GameEngine gameEngine , LevelStrategy strategy) {
		
		this.gameEngine = gameEngine;
		this.strategy = strategy;
		
	}

	@Override
	public void excute() {
		gameEngine.newGame(strategy);
	}
	
}
