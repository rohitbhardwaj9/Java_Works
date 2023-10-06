package dao_class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model_class.Flight;
import utility_class.ConnectionProvider;

public class FlightManagementSystem {

	public ArrayList<Flight> viewFlightBySourceDestination(String source, String destination) {


		ArrayList<Flight> flightDetails = new ArrayList<Flight>();
		Connection connection = ConnectionProvider.getConnection();
		
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM flight WHERE source = ? AND destination = ?")) {
            preparedStatement.setString(1, source);
            preparedStatement.setString(2, destination);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int flightId = resultSet.getInt("flightId");
                    int noOfSeats = resultSet.getInt("noofseats");
                    double flightFare = resultSet.getDouble("flightfare");

                    Flight flight = new Flight(flightId, source, destination, noOfSeats, flightFare);
                    flightDetails.add(flight);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

		return flightDetails;
	}
}