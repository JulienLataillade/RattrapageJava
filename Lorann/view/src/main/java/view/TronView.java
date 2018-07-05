package view;

import java.io.IOException;
import java.util.Observable;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import model.IModel;

public class TronView implements Runnable, IView {
	private final TronGraphicsBuilder	tronGraphicsBuilder;
	private final EventPerformer		eventPerformer;
	private final Observable			observable;
	private IModel						grid;
	private EasyFrame					easyFrame;

	public TronView(final IOrderPerformer orderPerformer, final IModel grid, final Observable observable) {
		this.observable = observable;
		this.tronGraphicsBuilder = new TronGraphicsBuilder(grid);
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.grid = grid;
		SwingUtilities.invokeLater(this);

	}

	@Override
	public void closeAll() {
		this.easyFrame.dispose();
	}

	@Override
	public void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public IModel getGrid() {
		return this.grid;
	}

	@Override
	public void run() {
		this.easyFrame = new EasyFrame("Tron", this.eventPerformer, this.tronGraphicsBuilder, null, this.observable);

	}

	public void setGrid(final IModel grid) throws IOException {
		this.grid = grid;
		for (int x = 0; x < this.getGrid().getWidth(); x++) {
			for (int y = 0; y < this.getGrid().getHeight(); y++) {
				if ((x == 0) || (x == 399) || (y == 0) || (y == 599)) {
					this.getGrid().setMatrixXY(ElementGrid.WALL, x, y);
				}
				this.getGrid().setMatrixXY(ElementGrid.GROUND, x, y);
			}
		}
	}

}