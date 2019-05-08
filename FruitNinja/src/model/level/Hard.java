package model.level;

import model.fruit.Fruit;

public class Hard implements LevelStrategy{

	@Override
	public double maxHeight() {
		return 3;
	}

	@Override
	public double getInitialVelocity() {
		return 10;
	}

	@Override
	public double getFallingVelocity() {
		return 10;
	}

	@Override
	public Fruit gameQueue() {
		return null;
	}

}
