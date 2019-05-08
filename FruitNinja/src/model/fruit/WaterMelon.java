package model.fruit;

public class WaterMelon implements Fruit{

	private boolean sliced = false;
	
	@Override
	public boolean isSliced() {
		return sliced;
	}

	@Override
	public int increaseScore() {
		return 1;
	}
	
	@Override
	public void setSliced(boolean sliced) {
		this.sliced = sliced;
	}
}
