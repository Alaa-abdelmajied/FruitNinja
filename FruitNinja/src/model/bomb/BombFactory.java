package model.bomb;

public class BombFactory {

	public Bombs getBomb(String bombType) {

		if (bombType == null)
			return null;
		if (bombType.equals("Fatal"))
			return Fatal.getInstance();
		if (bombType.equals("Dangerous"))
			return new Dangerous();

		return null;
	}
}
