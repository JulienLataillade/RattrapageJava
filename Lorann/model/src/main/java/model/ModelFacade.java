package model;

import java.util.ArrayList;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {

	/**
	 * Instantiates a new model facade.
	 */
	public ModelFacade() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getAllExamples()
	 */
	/*
	 * @Override public List<Example> getAllExamples() throws SQLException { return
	 * ExampleDAO.getAllExamples(); }
	 * 
	 * 
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getExampleById(int)
	 */

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<ILightcycle> getLightcycle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMotionLess getMatrixXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public Example getExampleById(final int id) throws SQLException { return
	 * ExampleDAO.getExampleById(id); }
	 * 
	 * 
	 * (non-Javadoc)
	 *
	 * @see model.IModel#getExampleByName(java.lang.String)
	 * 
	 * @Override public Example getExampleByName(final String name) throws
	 * SQLException { return ExampleDAO.getExampleByName(name); }
	 */
	@Override
	public ILightcycle getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMatrixXY(IMotionLess motionless, int x, int y) {
		// TODO Auto-generated method stub

	}

}
