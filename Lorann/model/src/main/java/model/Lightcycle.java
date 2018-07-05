package model;

import java.awt.Color;

public class Lightcycle implements ILightcycle {

	private Boolean		alive;
	private final Color	color;
	private IPosition	position;
	private final int	direction;
	private final int	player;
	private IModel		grid;

	public Lightcycle(IPosition position, int direction, final Color color, final int player) {
		this.direction = direction;
		this.alive = true;
		this.color = color;
		this.position = position;
		this.player = player;
	}

	public void die() {
		this.alive = false;
	}

	public Color getColor() {
		return this.color;
	}

	@Override
	public int getDirection() {
		return this.direction;
	}

	@Override
	public IModel getGrid() {
		return this.grid;
	}

	@Override
	public IPosition getPosition() {
		return this.position;
	}

	public boolean isAlive() {
		return this.alive;
	}

	@Override
	public boolean isPlayer(final int player) {
		return this.player == player;
	}

	@Override
	public void move() {
		switch (this.direction) {
		case 0:
			this.moveUp();
			break;
		case 1:
			this.moveRight();
			break;
		case 2:
			this.moveDown();
			break;
		case 3:
			this.moveLeft();
			break;
		}
	}

	private void moveDown() {
		this.position.setY(this.position.getY() - 1);
	}

	private void moveLeft() {
		this.position.setX(this.position.getX() - 1);
	}

	private void moveRight() {
		this.position.setX(this.position.getX() + 1);
	}

	private void moveUp() {
		this.position.setY(this.position.getY() + 1);
	}

	@Override
	public void setDirection(int direction) {

	}

	@Override
	public void setGrid(IModel grid) {
		this.grid = grid;
	}

	@Override
	public void setPosition(IPosition position) {
		this.position = position;
	}
}