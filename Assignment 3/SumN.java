import java.util.*;


class SumOfNumbers{

void calculateSum(int n){
 
int sum = 0;


for(int i = 1; i <= n ; i++){

sum = sum + i;

}

System.out.println("The sum of numbers from 1 to " + n + " is " + sum);

 
}

}


public class SumN{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();

SumOfNumbers obj = new SumOfNumbers();
obj.calculateSum(n);



}




}