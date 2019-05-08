package model.level;

import model.fruit.Fruit;

public class Hard implements Levels{

	@Override
	public double maxHeight() {
		return 0;
	}

	@Override
	public double getInitialVelocity() {
		return 0;
	}

	@Override
	public double getFallingVelocity() {
		return 0;
	}

	@Override
	public Fruit gameQueue() {
		return null;
	}

}
