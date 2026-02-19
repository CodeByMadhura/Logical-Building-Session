import java.util.*;

class AskForPositiveNumber {

    void askForPositiveNumber() {

        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.print("Enter a positive number:");
            a = sc.nextInt();
        } while (a <= 0);

        System.out.println("You entered a positive number: " + a);
    }
}

public class PositiveNumber {

    public static void main(String args[]) {

        AskForPositiveNumber obj = new AskForPositiveNumber();
        obj.askForPositiveNumber();
    }
}
