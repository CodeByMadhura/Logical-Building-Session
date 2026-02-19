import java.util.*;

class PrintEvenNumbers {

    void printEvenNumbers(int low, int up) {

        int i = low;

        while (i <= up) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

public class PrintNumbers {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit : ");
        int low = sc.nextInt();

        System.out.print("Enter the upper limit : ");
        int up = sc.nextInt();

        PrintEvenNumbers obj = new PrintEvenNumbers();
        obj.printEvenNumbers(low, up);
    }
}
