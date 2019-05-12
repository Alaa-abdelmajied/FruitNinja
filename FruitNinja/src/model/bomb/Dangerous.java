package model.bomb;


public class Dangerous implements Bombs {

	private boolean sliced = false;
	
	@Override
	public boolean endGame() {
		return false;
	}

	@Override
	public int loseLife() {
		return 1;
	}

	@Override
	public boolean isSliced() {
		return sliced;
	}
	
	@Override
	public void setSliced(boolean sliced){
		this.sliced = sliced;
	}

}
