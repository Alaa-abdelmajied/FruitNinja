package model.level;

import model.fruit.Fruit;

public class Medium implements LevelStrategy{

	@Override
	public double maxHeight() {
		return 4;
	}

	@Override
	public double getInitialVelocity() {
		return 7;
	}

	@Override
	public double getFallingVelocity() {
		return 7;
	}

	@Override
	public Fruit gameQueue() {
		return null;
	}

}
