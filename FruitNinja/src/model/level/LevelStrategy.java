package model.level;

import model.fruit.Fruit;

public interface LevelStrategy{
	
	public double maxHeight();
	
	public double getInitialVelocity();
	
	public double getFallingVelocity();

	public Fruit gameQueue();
}