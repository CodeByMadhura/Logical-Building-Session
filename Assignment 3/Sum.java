import java.util.*;

class SumOfTwoNumbers{


int sumOfTwoNumbers(int a, int b){
  
  int sum = a + b;
  return sum;

}


}


public class Sum{


 public static void main(String args[]){


 Scanner sc = new Scanner(System.in);
 System.out.print("Enter First Number : ");
 int a = sc.nextInt();
 System.out.print("Enter Second Number : ");
 int b = sc.nextInt();

 SumOfTwoNumbers result = new SumOfTwoNumbers();
 int sum = result.sumOfTwoNumbers(a,b);

System.out.println("The sum of " + a + " and " + b + " is " + sum);

 




}





}