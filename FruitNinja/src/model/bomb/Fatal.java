package model.bomb;


public class Fatal implements Bombs {

	private static Fatal instance;

	private Fatal() {

	}

	public static Fatal getInstance() {
		if (instance == null) {
			instance = new Fatal();
		}
		return instance;
	}

	@Override
	public boolean endGame() {
		return true;
	}

	@Override
	public int loseLife() {
		return 0;

	}

}
