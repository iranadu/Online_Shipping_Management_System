/**
 * 
 */
package iNterface;

/**
 * @author Sanka
 *
 */
import model.Employee;
public interface IEmployee {

	public void addEmployee(Employee employee);
	public Employee viewEmployee(int Emp_Id);
	public void removeEmployee(int Emp_Id);
	public Employee editEmployee(int Emp_Id, Employee employee);

}
