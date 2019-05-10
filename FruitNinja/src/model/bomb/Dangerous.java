package model.bomb;


public class Dangerous implements Bombs {

	@Override
	public boolean endGame() {
		return false;
	}

	@Override
	public int loseLife() {
		return 0;
	}

}
