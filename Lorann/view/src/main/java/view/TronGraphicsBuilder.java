package view;

import java.awt.Graphics;

import controller.IUserOrder;
import model.IModel;

public class TronGraphicsBuilder implements ITronGraphicsBuilder {
	private final IModel grid;

	public TronGraphicsBuilder(final IModel grid) {
		this.grid = grid;
	}

	public void applyModelToGraphic(final Graphics graphics) {
		this.clearGraphics(graphics);
	}

	private void clearGraphics(final Graphics graphics) {
		graphics.clearRect(0, 0, this.grid.getWidth() * EasyFrame.ZOOM, this.grid.getHeight() * EasyFrame.ZOOM);
	}

	public void orderPerform(final IUserOrder userorder) {

	}

}