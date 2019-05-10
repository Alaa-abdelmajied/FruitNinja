package model.level;

import model.Element;

public class Level {
	
	LevelStrategy strategy;
	
	
	public Level (LevelStrategy strategy)
	{
		this.strategy = strategy;
	}
	
    
	public double maxHeight() {
		double maxheight= this.strategy.maxHeight();
		return maxheight;
    	
    }
	
	
	public double getInitialVelocity() {
		double initialVelocity = this.strategy.getInitialVelocity();
		return initialVelocity;
	}
	
	
	public double getFallingVelocity() {
		double fallingVelocity = this.strategy.getFallingVelocity();
		return fallingVelocity;
	}

	
	public Element gameQueue() {
		Element element= this.strategy.gameQueue();
		return element;
	}

}
