package model;

import java.util.ArrayList;
import java.util.Observable;

import view.ElementGrid;

public class Grid extends Observable implements IModel {

	public int								width;
	public int								height;
	private IMotionLess[][]					matrix;
	private final ArrayList<ILightcycle>	lightcycle;

	public Grid(final int width, final int height) {
		this.width = width;
		this.height = height;
		this.lightcycle = new ArrayList<ILightcycle>();
	}

	public void createWall() {
		this.matrix[this.lightcycle.getPosition().getX()][this.lightcycle.getPosition().getY()] = this.setMatrixXY(
				ElementGrid.WALLBLUE, this.lightcycle.getPosition().getX, this.lightcycle.getPosition().getY);
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public ArrayList<ILightcycle> getLightcycle() {
		return this.lightcycle;
	}

	@Override
	public IMotionLess getMatrixXY(final int x, final int y) {
		return this.matrix[x][y];
	}

	@Override
	public ILightcycle getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setMatrixXY(final IMotionLess motionless, final int x, final int y) {
		this.matrix[x][y] = motionless;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
