package controller;

import model.Direction;
import model.ILightcycle;
import model.IModel;
import view.IView;

class TronController {
	static private int		width		= 400;
	static private int		height		= 600;
	private static int		TIME_SLEEP	= 50;
	private final IModel	model;
	private IView			view;
	private final boolean	isGameOver	= false;

	public TronController(final IModel model) {
		this.model = model;
	}

	public void checkCollision() {

	}

	private void gameLoop() {
		while (!this.isGameOver) {
			try {
				Thread.sleep(TronController.TIME_SLEEP);
			} catch (final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}

	public void orderPerform(final IUserOrder userOrder) {
		if (userOrder != null) {
			final ILightcycle lightcycle = this.model.getMobileByPlayer(userOrder.getPlayer());
			if (lightcycle != null) {
				int direction;
				switch (userOrder.getOrder()) {
				case RIGHT:
					direction = (Direction.RIGHT.ordinal() + 1) % 4;
					break;
				case LEFT:
					direction = (Direction.LEFT.ordinal() - 1) % 4;
					break;
				case NOTHING:
				default:
					direction = this.model.getMobileByPlayer(userOrder.getPlayer()).getDirection();
					break;

				}
				lightcycle.setDirection(direction);

			}

		}
	}

	public void play() {
		this.gameLoop();
		this.view.displayMessage("Game Over !");
		this.view.closeAll();
	}

}