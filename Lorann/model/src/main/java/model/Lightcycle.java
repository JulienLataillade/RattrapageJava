package model;

import java.awt.Color;

public class Lightcycle implements ILightcycle {

	private final Grid		grid;
	private Boolean			alive;
	private final Color		color;
	private final IPosition	position;
	private int				direction;
	private final int		player;

	public Lightcycle(final Grid grid, IPosition position, final Color color, final int player) {
		this.grid = grid;
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

	public Grid getGrid() {
		return this.grid;
	}

	public boolean isAlive() {
		return this.alive;
	}

	public boolean isPlayer(final int player) {
		return this.player == player;
	}

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

	public void moveDown() {
		this.position.setY(this.position.getY() - 1);
	}

	public void moveLeft() {
		this.position.setX(this.position.getX() - 1);
	}

	public void moveRight() {
		this.position.setX(this.position.getX() + 1);
	}

	public void moveUp() {
		this.position.setY(this.position.getY() + 1);
	}

	@Override
	public void setDirection(int direction) {

	}
}