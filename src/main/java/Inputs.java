import java.util.Scanner;


public class Inputs {

    Scanner scan;
    
    Inputs(){
        this.scan = new Scanner(System.in);
    }

    String getInput(String msg){

        System.out.println(msg);
        return this.scan.nextLine();
    }

    int getInputInt(String msg){

        System.out.println(msg);
        return Integer.parseInt(this.scan.nextLine());
    }
}
