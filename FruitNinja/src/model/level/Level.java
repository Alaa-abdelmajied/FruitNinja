package model.level;

import java.util.Queue;

import model.Element;

public class Level {
	
	LevelStrategy strategy;
	
	
	public Level (LevelStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public Queue<Element> gameQueue() {
		Queue<Element> queue= this.strategy.gameQueue();
		return queue;
	}

}
