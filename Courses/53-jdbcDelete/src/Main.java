import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            String sql = "delete from city where id=?";
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4082);
            statement.executeUpdate();
            System.out.println("Kayıt Silindi");


        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }


    }
}
