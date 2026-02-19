import java.util.*;



public class Average{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

int[] numbers = new int[5];

System.out.print("Enter 5 integers : ");

for(int i = 0; i<5; i++){

numbers[i] = sc.nextInt();

}

int sum = 0;

for(int number : numbers){

sum = sum + number ;

}

double avg = sum / 5 ;

System.out.println("The average of the numbers is " + avg);


}




}