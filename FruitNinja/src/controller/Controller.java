package controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import model.Element;
import model.bomb.Bombs;
import model.bomb.Dangerous;
import model.bomb.Fatal;
import model.fruit.Apple;
import model.fruit.Fruit;
import model.fruit.Orange;
import model.fruit.Pear;
import model.fruit.SpecialApple;
import model.fruit.SpecialGrape;
import model.fruit.Strawberry;
import model.gameEngine.Command;
import model.gameEngine.GameEngine;
import model.gameEngine.Invoker;
import model.gameEngine.bestScoreCommand;
import model.gameEngine.newGameCommand;
import model.gameEngine.resetCommand;
import model.level.Arcade;
import model.level.Easy;
import model.level.Hard;
import model.level.LevelStrategy;
import model.level.Normal;
import view.Level1;
import view.Level2;
import view.Level3;
import view.Main;
import view.MainMenu;

public class Controller {

	GameEngine gameEngine = new GameEngine();
	Invoker invoker = new Invoker();
	LevelStrategy level;
	private ArrayList<Element> elements = new ArrayList<Element>();
	private int levelNumber;
	
	public ArrayList<Element> getElements() {
		return elements;
	}


	public void play(int levelNumber) {
		
		this.levelNumber = levelNumber;
		
		if (this.levelNumber == 1) {
			level = new Easy();
			elements = level.elementThrow();
			System.out.println("play test" + elements.get(0));
		} else if (this.levelNumber == 2) {
			level = new Normal();
			elements = level.elementThrow();
		} else if (this.levelNumber == 3) {
			level = new Hard();
			elements = level.elementThrow();
		} else if (this.levelNumber == 4) {
			level = new Arcade();
			elements = level.elementThrow();
			System.out.println("Arcade");
		}
//		gameEngine.newGame(level);
		commandNewGame(level);
		//elementThrower();
	}
	
	public ArrayList<Element> updateElements(){
		elements = level.elementThrow();
		return elements;
	}
	

//	public void elementThrower() {
//		int elementNumber;
//		int z = 25;
//
//		while (z > 0) {
//			z--;
//			System.out.println("test element thrower "+gameQueue.poll());
//			for (int i = 0; i < 20; i++) {
//				if (gameQueue.peek() instanceof Fruit) {
//					if (gameQueue.peek() instanceof Apple) {
//						elementNumber = 1;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)
//					}
//					else if (gameQueue.peek() instanceof Orange) {
//						elementNumber = 2;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)
//					}
//					else if (gameQueue.peek() instanceof Pear) {
//						elementNumber = 3;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)
//					}
//					else if (gameQueue.peek() instanceof Strawberry) {
//						elementNumber = 4;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)					
//						}
//					else if (gameQueue.peek() instanceof SpecialApple) {
//						elementNumber = 5;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)
//					}
//					else if (gameQueue.peek() instanceof SpecialGrape) {
//						elementNumber = 6;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)
//					}
//				}
//
//				else if (gameQueue.peek() instanceof Bombs) {
//
//					if (gameQueue.peek() instanceof Fatal) {
//						elementNumber = 7;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)
//					}
//					else if (gameQueue.peek() instanceof Dangerous) {
//						elementNumber = 8;
//						if(this.levelNumber == 1)
//							level1.convert(elementNumber, gameQueue.poll());
////						else if(this.levelNumber == 2)
////						else if(this.levelNumber == 3)
////						else if(this.levelNumber == 4)
//					}
//
//				}
//			}
//		}
//	}

	public void commandNewGame(LevelStrategy strategy) {

		Command newGame = new newGameCommand(gameEngine, strategy);
		invoker.setCommand(newGame);
		invoker.pressButton();

	}

	public void commandResetGame() {

		Command resetGame = new resetCommand(gameEngine);
		invoker.setCommand(resetGame);
		invoker.pressButton();

	}

	public void commandBestScore(int score, int level) {

		Command bestScore = new bestScoreCommand(gameEngine, score, level);
		invoker.setCommand(bestScore);
		invoker.pressButton();

	}

}
