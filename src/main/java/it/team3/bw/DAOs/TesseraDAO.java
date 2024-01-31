package it.team3.bw.biglietto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import it.team3.bw.biglietto.classi.Tessera;

public class TesseraDAO {

    // Nuova tessera
    public void inserisciTessera(Tessera tessera) {
        String query = "INSERT INTO tessere (id_tessera, id_utente, data_emissione, data_scadenza, stato) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setLong(1, tessera.getIdTessera());
            statement.setLong(2, tessera.getIdUtente());
            statement.setDate(3, java.sql.Date.valueOf(tessera.getDataEmissioneTessera()));
            statement.setDate(4, java.sql.Date.valueOf(tessera.getDataScadenzaTessera()));
            statement.setBoolean(5, tessera.isStato());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Recupero tessera
    public Tessera getTesseraById(Long idTessera) {
        Tessera tessera = null;
        String query = "SELECT * FROM tessere WHERE id_tessera = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setLong(1, idTessera);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    tessera = mapToTessera(resultSet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

        return tessera;
    }

    // Recupero tutto
    public List<Tessera> getAllTessere() {
        List<Tessera> tessere = new ArrayList<>();
        String query = "SELECT * FROM tessere";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Tessera tessera = mapToTessera(resultSet);
                tessere.add(tessera);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tessere;
    }

    private Tessera mapToTessera(ResultSet resultSet) throws SQLException {
        Long idTessera = resultSet.getLong("id_tessera");
        Long idUtente = resultSet.getLong("id_utente");
        LocalDate dataEmissione = resultSet.getDate("data_emissione").toLocalDate();
        LocalDate dataScadenza = resultSet.getDate("data_scadenza").toLocalDate();
        boolean stato = resultSet.getBoolean("stato");

        return new Tessera(idTessera, idUtente, dataEmissione, dataScadenza, stato);
    }
}
