import java.util.*;

public class IndexOfElement {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        
        Arrays.sort(numbers);

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

       
        int index = Arrays.binarySearch(numbers, search);

        if(index >= 0) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
