package model.fruit;


public class Strawberry implements Fruit {

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

	/*@Override
	public final boolean isSpecial() {
		return false;
	}
*/
}
