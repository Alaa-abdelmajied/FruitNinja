package model.level;

import java.util.ArrayList;
import java.util.Queue;

import model.Element;

public class Level {
	
	LevelStrategy strategy;
	
	
	public Level (LevelStrategy strategy)
	{
		this.strategy = strategy;
	}
	
	public ArrayList<Element> elementThrow() {
		ArrayList<Element> elements = this.strategy.elementThrow();
		return elements;
	}

}
