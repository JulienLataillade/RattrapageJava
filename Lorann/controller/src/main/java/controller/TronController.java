package controller;

import java.util.ArrayList;

import model.Direction;
import model.ILightcycle;
import model.IModel;
import view.IView;

public class TronController implements IController, IOrderPerformer {
	static private int		width		= 400;
	static private int		height		= 600;
	private static int		TIME_SLEEP	= 50;
	private final IModel	grid;
	private IView			view;
	private final boolean	isGameOver	= false;

	public TronController(final IModel grid) {
		this.grid = grid;
	}

	@Override
	public void checkCollision() {

	}

	@Override
	public void gameLoop() {
		while (!this.isGameOver) {
			try {
				Thread.sleep(TronController.TIME_SLEEP);
			} catch (final InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			final ArrayList<ILightcycle> initialLightcycles = new ArrayList<ILightcycle>();
			for (final ILightcycle lightcycle : this.grid.getLightcycle()) {
				initialLightcycles.add(lightcycle);
				this.grid.createWall(0);
				this.grid.createWall(1);
			}
			for (final ILightcycle lightcycle : initialLightcycles) {
				lightcycle.move();
			}
			this.grid.setLightcyclesHaveMoved();
		}

	}

	@Override
	public void orderPerform(final IUserOrder userOrder) {
		if (userOrder != null) {
			final ILightcycle lightcycle = this.grid.getLightcycleByPlayer(userOrder.getPlayer());
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
					direction = this.grid.getLightcycleByPlayer(userOrder.getPlayer()).getDirection();
					break;

				}
				lightcycle.setDirection(direction);

			}

		}
	}

	@Override
	public void play() {
		this.gameLoop();
		this.view.displayMessage("Game Over !");
		this.view.closeAll();
	}

	@Override
	public void setView(final IView view) {
		this.view = view;
	}
}