package iNterface;

import model.Ship;
import java.sql.*;
import dbConnection.DbConnection;

public class IShipImpl implements IShip {

	private static Connection connection;

	private PreparedStatement preparedStatement;

	@Override
	public void addShip(Ship Ship) {

		try {
			connection = DbConnection.getDBConnection();

			preparedStatement = connection.prepareStatement("insert into Ship values(?,?,?,?,?)");
			connection.setAutoCommit(false);

			preparedStatement.setInt(1, Ship.getS_id());
			preparedStatement.setString(2, Ship.getS_Name());
			preparedStatement.setInt(3, Ship.getS_Type());
			preparedStatement.setString(4, Ship.getS_Captain_Name());
			preparedStatement.setInt(4, Ship.getS_Capacity());

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
	public Ship viewShip(int S_id) {
		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("select * from user where uid='?'");
			preparedStatement.setInt(1, S_id);
			
			ResultSet resultSet = preparedStatement.executeQuery();

			Ship SH = new Ship();
			SH .setS_id(resultSet.getInt(1));
			SH .setS_Name(resultSet.getString(2));
			SH .setS_Type(resultSet.getInt(3));
			SH .setS_Captain_Name(resultSet.getString(4));
			SH .setS_Capacity(resultSet.getInt(5));
				
				System.out.println("Ship ID :"+ SH.getS_id());
				System.out.println("Ship Name :"+ SH.getS_Name());
				System.out.println("Ship Type :"+ SH.getS_Type());
				System.out.println("Ship Captain name :"+ SH.getS_Captain_Name());
				System.out.println("Ship Capacity :"+ SH.getS_Capacity());
			

			

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
	public void removeShip(int S_Id) {

		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement("delete * from Ship where uid='?' ");
			preparedStatement.setInt(1, S_Id);
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
	public Ship editShip(int S_Id, Ship Ship) {
		try {
			connection = DbConnection.getDBConnection();
			preparedStatement = connection.prepareStatement(
					"update Ship set S_Name='?' , S_Type='?' , S_Captain_Name='? S_Capacity= '?' ");
			preparedStatement.setString(2, Ship.getS_Name());
			preparedStatement.setString(4, Ship.getS_Captain_Name());
			preparedStatement.setInt(3, Ship.getS_Type());
			preparedStatement.setInt(1, Ship.getS_id());
			preparedStatement.setInt(5, Ship.getS_Capacity());
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
