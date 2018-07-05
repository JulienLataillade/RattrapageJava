package model;

import java.util.ArrayList;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	public void createWall(final int player);

	public int getHeight();

	public ArrayList<ILightcycle> getLightcycle();

	ILightcycle getLightcycleByPlayer(int player);

	public IMotionLess getMatrixXY(final int x, final int y);

	public int getWidth();

	public void setLightcyclesHaveMoved();

	public void setMatrixXY(final IMotionLess motionless, final int x, final int y);
}
