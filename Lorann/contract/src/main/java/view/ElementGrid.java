package view;

import model.IMotionLess;

public enum ElementGrid implements IMotionLess {
	WALL, WALLRED, WALLBLUE, GROUND;

	public static IMotionLess getElementGridByPlayer(int player) {
		if (player == 1) {
			return ElementGrid.WALLBLUE;
		} else {
			return ElementGrid.WALLRED;
		}
	}

}
