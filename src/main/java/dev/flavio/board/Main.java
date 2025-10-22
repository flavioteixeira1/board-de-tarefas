package dev.flavio.board;

import static dev.flavio.board.persistence.config.ConnectionConfig.getConnection;

import java.sql.SQLException;

import dev.flavio.board.persistence.migration.MigrationStrategy;
import dev.flavio.board.ui.MainMenu;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
