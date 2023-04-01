import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
        String sql = "insert into City (Name,CountryCode,District,Population) " +
                "values(?,?,?,?)";

        try {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce 2");
            statement.setString(2, "TUR");
            statement.setString(3, "Düzce");
            statement.setInt(4, 70000);

            int row = statement.executeUpdate();
            System.out.println("Kayıt Eklendi");
            System.out.println(row + " satır etkilendi");

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }


    }
}
