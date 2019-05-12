package model.gameEngine;

public class resetCommand implements Command {
	
	GameEngine gameEngine;
	
	public resetCommand (GameEngine gameEngine) {
		
		this.gameEngine = gameEngine;
		
	}

	@Override
	public void excute() {
		gameEngine.resetGame();
	}
	
	

}
