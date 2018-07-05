package main;

import java.awt.Color;

import controller.TronController;
import model.Grid;
import model.Lightcycle;
import model.Position;
import view.TronView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {
		final Grid grid = new Grid(400, 600);
		grid.addLightcycle(new Lightcycle(new Position(200, 200), 1, Color.BLUE, 0));
		grid.addLightcycle(new Lightcycle(new Position(200, 400), 3, Color.RED, 1));
		final TronController controller = new TronController(grid);
		controller.setView(new TronView(controller, grid, grid));
		controller.play();
	}

}
