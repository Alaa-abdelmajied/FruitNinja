package model.bomb;


public class Fatal implements Bombs {

	private boolean sliced = false;
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
		return 3;

	}

	@Override
	public boolean isSliced() {
		return sliced;
	}
	
	@Override
	public void setSliced(boolean sliced) {
		this.sliced = sliced;
	}

}
