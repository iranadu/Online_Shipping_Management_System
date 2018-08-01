/**
 * 
 */
package iNterface;

import model.Warehouse;

/**
 * @author Sanka
 *
 */
public interface IWarehouse {

	public void addWarehouse(Warehouse Warehouse);
	public Warehouse viewWarehouse(int WH_Id);
	public void removeWarehouse(int WH_Id);
	public Warehouse editWarehouse(int WH_Id, Warehouse Warehouse);

}
