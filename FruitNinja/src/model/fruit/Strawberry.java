package model.fruit;

import model.Element;

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

	@Override
	public Element gameQueue() {
		// TODO Auto-generated method stub
		return null;
	}
}
