package model.level;

import java.util.Queue;

import model.Element;
import model.bomb.Bombs;
import model.bomb.Dangerous;
import model.bomb.Fatal;
import model.fruit.Fruit;
import model.fruit.Orange;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;

public interface LevelStrategy{
	

	public Queue<Element> gameQueue();

}