public class Exec{

    public static void main(String[] args){

        Db banco = new Db("jdbc:mysql://localhost:3306/jdbc?useTimezone=true&serverTimezone=UTC", "root", "password");


        Menu menu = new Menu(banco);

        menu.mainLoop();
    }
}
