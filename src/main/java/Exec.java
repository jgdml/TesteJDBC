public class Exec{

    public static void main(String[] args){

        Inputs input = new Inputs();
        Db banco = new Db("jdbc:mysql://localhost:3306/jdbc?useTimezone=true&serverTimezone=UTC", "root", "password");


        Menu menu = new Menu(input, banco);

        menu.mainLoop();
    }
}
