/**
 * 
 */
package iNterface;

import model.Ship;

/**
 * @author Sanka
 *
 */
public interface IShip {

	public void addShip(Ship Ship);
	public Ship viewShip(int S_Id);
	public void removeShip(int S_Id);
	public Ship editShip(int S_Id, Ship Ship);
}
