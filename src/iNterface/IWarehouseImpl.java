package iNterface;

import model.Warehouse;

import java.sql.*;
import dbConnection.DbConnection;

public class IWarehouseImpl implements IWarehouse {

	private static Connection connection;

	private PreparedStatement preparedStatement;

	@Override
	public void addWarehouse(Warehouse Warehouse) {

		try {
			connection = DbConnection.getDBConnection();

			preparedStatement = connection.prepareStatement("insert into Warehouse values(?,?,?,?)");
			connection.setAutoCommit(false);

			preparedStatement.setInt(1, Warehouse.getWH_id());
			preparedStatement.setString(2, Warehouse.getWH_Address());
			preparedStatement.setString(3, Warehouse.getWH_MANAGER_NAME());
			preparedStatement.setInt(4, Warehouse.getWH_Free_Slot());

			preparedStatement.execute();
			connection.commit();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			/*
			 * Close prepared statement and database connectivity at the end of transaction
			 */
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
	public Warehouse viewWarehouse(int WH_Id) {
		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("select * from user where uid='?'");
			preparedStatement.setInt(1, WH_Id);
			
			ResultSet resultSet = preparedStatement.executeQuery();

			Warehouse WH = new Warehouse();
				WH.setWH_id(resultSet.getInt(1));
				WH.setWH_Address(resultSet.getString(2));
				WH.setWH_MANAGER_NAME(resultSet.getString(3));
				WH.setWH_Free_Slot(resultSet.getInt(4));
				
				System.out.println("Ware House ID :"+ WH.getWH_id());
				System.out.println("Ware House Address :"+ WH.getWH_Address());
				System.out.println("Ware House Manager Name :"+ WH.getWH_MANAGER_NAME());
				System.out.println("Ware House Free slots :"+ WH.getWH_Free_Slot());
			

		} catch (SQLException  | ClassNotFoundException e) {
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

	@Override
	public void removeWarehouse(int WH_Id) {

		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("delete * from Warehouse where uid='?' ");
			preparedStatement.setInt(1, WH_Id);
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
	public Warehouse editWarehouse(int WH_Id, Warehouse Warehouse) {
		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement(
					"update Warehouse set WH_Address='?' , WH_MANAGER_NAME='?' , WH_Free_Slot='? where WH_Id= '?' ");
			preparedStatement.setString(2, Warehouse.getWH_Address());
			preparedStatement.setString(3, Warehouse.getWH_MANAGER_NAME());
			preparedStatement.setInt(4, Warehouse.getWH_Free_Slot());
			preparedStatement.setInt(1, Warehouse.getWH_id());
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
