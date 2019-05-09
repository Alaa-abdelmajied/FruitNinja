package model.bomb;

import model.Element;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int loseLife() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Element gameQueue() {
		// TODO Auto-generated method stub
		return null;
	}

}
