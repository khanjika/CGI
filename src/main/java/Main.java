import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userInput;

        Action action = new Action ();

        System.out.println (" Please choose of the following options : " + "\n" + "1 - Change the fan speed" + "\n" + "2 - Change the direction" + "\n" + "3 - Exit  ");
        Scanner sc = new Scanner (System.in);

        do {
            System.out.println ("Please enter your option :");
            userInput = sc.nextInt ();
            switch (userInput) {
                case 1:
                    action.speedChange ();
                    System.out.println (action.output ());
                    break;
                case 2:
                    action.directionChange ();
                    System.out.println (action.output ());
                    break;
                case 3:
                    System.out.println ("Have a great day");
                    break;
                default:
                    System.out.println ("Not a valid option");
            }
        } while (userInput != 3);
    }
}
