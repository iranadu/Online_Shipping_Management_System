package iNterface;

import model.Employee;

import java.sql.*;
import dbConnection.DbConnection;


public class IEmployeeImpl implements IEmployee {

	private static Connection connection;
	private PreparedStatement  preparedStatement;

	@Override
	public void addEmployee(Employee employee) {

		try {
			connection = DbConnection.getDBConnection();

			preparedStatement = connection.prepareStatement("insert into Employee values(?,?,?,?,?)");
			connection.setAutoCommit(false);

			preparedStatement.setInt(3, employee.getEmp_id());
			preparedStatement.setString(1, employee.getEmp_Name());
			preparedStatement.setInt(4, employee.getEmp_Telephone());
			preparedStatement.setString(2, employee.getEmp_Address());
			preparedStatement.setInt(5, employee.getEmp_Salary());

			
			System.out.println(employee.getEmp_id());
			preparedStatement.execute();
			connection.commit();

		}catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection !=null) {
					connection.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override

	public Employee viewEmployee(int Emp_id) {
		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("select * from Employee where Emp_id='?'");
			preparedStatement.setInt(3, Emp_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			Employee Emp = new Employee();
			Emp.setEmp_id(resultSet.getInt(3));
			Emp.setEmp_Name(resultSet.getString(1));
			Emp.setEmp_Telephone(resultSet.getInt(4));
			Emp.setEmp_Address(resultSet.getString(2));
			Emp.setEmp_Salary(resultSet.getInt(5));

			System.out.println("Employee Emp ID :"+ Emp.getEmp_id());
			System.out.println("Employee Name :"+ Emp.getEmp_Name());
			System.out.println("Employee Telephone :"+ Emp.getEmp_Telephone());
			System.out.println("Employee Address :"+ Emp.getEmp_Address());
			System.out.println("Employee Address :"+ Emp.getEmp_Salary());

		}catch (SQLException  | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public void removeEmployee(int Emp_Id) {

		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("delete * from Employee where Emp_id='?' ");
			preparedStatement.setInt(1, Emp_Id);
			preparedStatement.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public Employee editEmployee(int Emp_Id, Employee Employee) {
		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("update Employee set Emp_Name='?' , Emp_Telephone='?' , Emp_Address='?, Emp_Salary='?', where Emp_id= '?' ");
			preparedStatement.setString(1, Employee.getEmp_Name());
			preparedStatement.setInt(4, Employee.getEmp_Telephone());
			preparedStatement.setString(2, Employee.getEmp_Address());
			preparedStatement.setInt(5, Employee.getEmp_Salary());
			preparedStatement.setInt(3, Employee.getEmp_id());
			preparedStatement.executeUpdate();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}



}
