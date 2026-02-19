import java.util.*;

public class CountNumbers{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int[] numbers = new int[6];

System.out.println("Enter 6 integers : ");

for(int i = 0; i < 6 ; i++){

numbers[i] = sc.nextInt();

}

int countPositive = 0;
int countNegative = 0;


for(int number : numbers){

if(number > 0){

countPositive = countPositive + 1;

} else if (number < 0) {

countNegative = countNegative + 1;

}



}

System.out.println("Positive Numbers : " + countPositive);
System.out.println("Negative Numbers : " + countNegative);




}







}