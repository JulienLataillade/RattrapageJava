package model;

public interface ILightcycle {

	int getDirection();

	public IModel getGrid();

	public IPosition getPosition();

	public boolean isPlayer(final int player);

	public void move();

	void setDirection(int direction);

	public void setGrid(IModel grid);

	public void setPosition(IPosition position);

}
