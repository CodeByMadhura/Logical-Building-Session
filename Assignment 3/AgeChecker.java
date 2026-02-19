import java.util.*;

class CheckAge{

 String checkAgeCategory(int age){

  String result;

  if(age < 18){
   result = "You are a minor.";
}else if(age >= 18 && age <= 60){

  result = "You are an adult.";
}else{
   result = "You are senior citizen.";
}


return result;


}


}

public class AgeChecker{

 public static void main(String args[]){


 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the age : ");
 int age = sc.nextInt();

 CheckAge obj = new CheckAge();
 String result = obj.checkAgeCategory(age);

System.out.println(result);





}








}