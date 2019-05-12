package model.gameEngine;

public class bestScoreCommand implements Command {

	GameEngine gameEngine;
	int score; 
	int level;

	public bestScoreCommand(GameEngine gameEngine , int score, int level) {

		this.gameEngine = gameEngine;
		this.score = score;
		this.level = level;

	}

	@Override
	public void excute() {
		
		gameEngine.bestScore(score, level);

	}
}