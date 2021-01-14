import java.sql.*;

public class Bd_test {

    private Connection conn;

    Bd_test() {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String pass = "password";

            this.conn = DriverManager.getConnection(url, user, pass);
        }
        catch (SQLException err) {
            System.out.println("\nOcorreu um erro ao se conectar com o banco\n\n" + err);
        }
    }

    public void select(String select){

        try{
            Statement stmt = this.conn.createStatement();

            ResultSet rs = stmt.executeQuery(select);

            while(rs.next()){
                System.out.println(rs.getString("nome"));
            }
        }
        catch (SQLException err) {
            System.out.println("\nOcorreu um erro ao realizar a busca\n\n" + err);
        }

    }

}