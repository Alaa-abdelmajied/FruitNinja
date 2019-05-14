package model.fruit;

public class FruitFactory {

	public Fruit getFruit(String fruitName) {

		if (fruitName == null)
			return null;
		if (fruitName.equals("SpecialApple"))
			return new SpecialApple();
		if (fruitName.equals("SpecialGrape"))
			return new SpecialGrape();
		if (fruitName.equals("Orange"))
			return new Orange();
		if (fruitName.equals("Pear"))
			return new Pear();
		if (fruitName.equals("Strawberry"))
			return new Strawberry();
		if (fruitName.equals("Apple"))
			return new Apple();

		return null;

	}

}