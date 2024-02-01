package it.team3.bw.DAOs;


import it.team3.bw.biglietto.classi.Tessera;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesseraDAO {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // Method to save a new Tessera
    public void saveTessera(Tessera tessera) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "INSERT INTO tessera (idTessera, idUtente, dataEmissioneTessera, dataScadenzaTessera, stato) " +
                    "VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setLong(1, tessera.getIdTessera());
                preparedStatement.setLong(2, tessera.getIdUtente());
                preparedStatement.setDate(3, Date.valueOf(tessera.getDataEmissioneTessera()));
                preparedStatement.setDate(4, Date.valueOf(tessera.getDataScadenzaTessera()));
                preparedStatement.setBoolean(5, tessera.isStato());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve a Tessera by its ID
    public Tessera getTesseraById(long idTessera) {
        Tessera tessera = null;
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM tessera WHERE idTessera = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setLong(1, idTessera);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        tessera = mapResultSetToTessera(resultSet);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tessera;
    }

    // Method to retrieve all Tessera objects
    public List<Tessera> getAllTessere() {
        List<Tessera> tessere = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM tessera";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                while (resultSet.next()) {
                    Tessera tessera = mapResultSetToTessera(resultSet);
                    tessere.add(tessera);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tessere;
    }

    // Method to update a Tessera
    public void updateTessera(Tessera tessera) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "UPDATE tessera SET idUtente = ?, dataEmissioneTessera = ?, " +
                    "dataScadenzaTessera = ?, stato = ? WHERE idTessera = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setLong(1, tessera.getIdUtente());
                preparedStatement.setDate(2, Date.valueOf(tessera.getDataEmissioneTessera()));
                preparedStatement.setDate(3, Date.valueOf(tessera.getDataScadenzaTessera()));
                preparedStatement.setBoolean(4, tessera.isStato());
                preparedStatement.setLong(5, tessera.getIdTessera());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete a Tessera by its ID
    public void deleteTessera(long idTessera) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "DELETE FROM tessera WHERE idTessera = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setLong(1, idTessera);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to map ResultSet to Tessera object
    private Tessera mapResultSetToTessera(ResultSet resultSet) throws SQLException {
        long idTessera = resultSet.getLong("idTessera");
        long idUtente = resultSet.getLong("idUtente");
        LocalDate dataEmissioneTessera = resultSet.getDate("dataEmissioneTessera").toLocalDate();
        LocalDate dataScadenzaTessera = resultSet.getDate("dataScadenzaTessera").toLocalDate();
        boolean stato = resultSet.getBoolean("stato");
        return new Tessera(idTessera, idUtente, dataEmissioneTessera, dataScadenzaTessera, stato);
    }
}
