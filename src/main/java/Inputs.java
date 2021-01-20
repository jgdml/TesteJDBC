import java.util.Scanner;


public class Inputs {

    public static Scanner scan = new Scanner(System.in);

    public static String getInput(String msg){

        System.out.println(msg);
        return scan.nextLine();
    }

    public static int getInputInt(String msg){

        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }
}
