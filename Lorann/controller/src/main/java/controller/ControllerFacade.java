package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller
 * component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController {

	/** The view. */
	private final IView		view;

	/** The model. */
	private final IModel	model;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public ControllerFacade(final IView view, final IModel model) {
		super();
		this.view = view;
		this.model = model;
	}

	@Override
	public void checkCollision() {
		// TODO Auto-generated method stub

	}

	@Override
	public void gameLoop() {
		// TODO Auto-generated method stub

	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
		return this.model;
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IView getView() {
		return this.view;
	}

	@Override
	public void orderPerform(IUserOrder userOrder) {
		// TODO Auto-generated method stub

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setView(IView view) {
		// TODO Auto-generated method stub

	}

	/**
	 * Start.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
	public void start() throws SQLException {
		// this.getView().displayMessage(this.getModel().getExampleById(1).toString());

		// this.getView().displayMessage(this.getModel().getExampleByName("Example
		// 2").toString());

		// final List<Example> examples = this.getModel().getAllExamples();
		// final StringBuilder message = new StringBuilder();
		// for (final Example example : examples) {
		// message.append(example);
		// .append('\n');
		// }
		// this.getView().displayMessage(message.toString());
	}
}
