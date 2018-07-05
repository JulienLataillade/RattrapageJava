package model;

import java.util.ArrayList;
import java.util.Observable;

import view.ElementGrid;

public class Grid extends Observable implements IModel {

	public int								width;
	public int								height;
	private IMotionLess[][]					matrix;
	private final ArrayList<ILightcycle>	lightcycles;

	public Grid(final int width, final int height) {
		this.width = width;
		this.height = height;
		this.lightcycles = new ArrayList<ILightcycle>();
	}

	public void addLightcycle(final ILightcycle lightcycle) {
		this.lightcycles.add(lightcycle);
		lightcycle.setGrid(this);
	}

	@Override
	public void createWall(final int player) {
		this.setMatrixXY(ElementGrid.getElementGridByPlayer(player),
				this.getLightcycleByPlayer(player).getPosition().getX(),
				this.getLightcycleByPlayer(player).getPosition().getY());

	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public ArrayList<ILightcycle> getLightcycle() {
		return this.lightcycles;
	}

	@Override
	public ILightcycle getLightcycleByPlayer(final int player) {
		for (final ILightcycle lightcycle : this.lightcycles) {
			if (lightcycle.isPlayer(player)) {
				return lightcycle;
			}
		}

		return null;
	}

	@Override
	public IMotionLess getMatrixXY(final int x, final int y) {
		return this.matrix[x][y];
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setLightcyclesHaveMoved() {
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public void setMatrixXY(final IMotionLess motionless, final int x, final int y) {
		this.matrix[x][y] = motionless;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
