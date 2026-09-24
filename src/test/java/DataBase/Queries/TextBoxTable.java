package DataBase.Queries;

import ObjectData.TextBoxObject;

import java.sql.SQLException;
import java.sql.Statement;

public class TextBoxTable extends CommonTable{

    public TextBoxTable() throws SQLException {
    }

    public synchronized void insertTableRow(TextBoxObject data) throws SQLException {
        Statement statement = dbConnection.getConnection().createStatement();
        String query = "insert into Users(fullname, email, current_address, permanent_address) " +
                "values ('" + data.getUserName() + "'" + "," +
                "'" + data.getUserEmail() + "'" + "," +
                "'" + data.getCurrentAdress() + "'" + "," +
                "'" + data.getPermanentAdress() + "'" + ");";
        statement.execute(query);
    }

}
