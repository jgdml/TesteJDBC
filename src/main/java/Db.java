import java.sql.*;

public class Db {

    private String ip;
    private String user;
    private String pass;

    private Connection conn;
    private Statement st;


    Db(String ip, String user, String pass){
        this.ip = ip;
        this.user = user;
        this.pass = pass;

        this.conectar(ip, user, pass);
    }


    private void conectar(String ip, String user, String pass){

        try {
            this.conn = DriverManager.getConnection(ip, user, pass);
            this.st = this.conn.createStatement();
        }
        catch (SQLException err) {
            System.out.println("\nOcorreu um erro ao se conectar com o banco\n\n" + err);
        }
    }

    
    public void listarUsuarios(){

        try{

            ResultSet rs = this.st.executeQuery("SELECT id, nome, idade FROM usuario");

            System.out.println("ID\t\tNome\t\t\tIdade");

            while(rs.next()){

                System.out.print(String.format("%d.", rs.getInt("id")));

                System.out.print("\t\t");
                System.out.print(rs.getString("nome"));

                System.out.print("\t\t\t\t");
                System.out.print(rs.getString("idade"));

                System.out.println();
            }
        }
        catch (SQLException err) {
            System.out.println("\nOcorreu um erro ao realizar a busca\n\n" + err);
        }
    }


    public void cadastrarUsuario(Usuario user){
        try{
            String query = String.format("INSERT INTO usuario (nome, idade) VALUES('%s', '%s');", user.getNome(), user.getIdade());

            this.st.executeUpdate(query);
        }
        catch(SQLException err) {
            System.out.println("\nOcorreu um erro ao realizar o cadastro\n\n" + err);
        }
    }

    public void excluirUsuario(Integer id){
        try {
            String query = String.format("DELETE FROM usuario WHERE id = %d", id+1);

            this.st.executeUpdate(query);
        }
        catch(SQLException err) {
            System.out.println("\nOcorreu um erro ao excluir o usuario\n\n" + err);
        }
    }

    public void editarUsuario(int id, String nome){
        try {
            String query = String.format("UPDATE usuario SET nome = '%s' WHERE id = %d", nome, id+1);

            this.st.executeUpdate(query);
        }
        catch(SQLException err) {
            System.out.println("\nOcorreu um erro ao editar o usuario\n\n" + err);
        }
    }
}
