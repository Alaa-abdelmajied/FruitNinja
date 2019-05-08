package model.level;

import model.fruit.Fruit;

public interface Levels{
	
	public double maxHeight();
	
	public double getInitialVelocity();
	
	public double getFallingVelocity();

	public Fruit gameQueue();
}
