import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            String sql = "update city set population=100000,district='Turkey' where id= ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            statement.executeUpdate();
            System.out.println("Kayıt Güncellendi");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }


    }
}
