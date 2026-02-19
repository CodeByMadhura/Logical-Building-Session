import java.util.*;

class AssignmentMenu{

// Grade Evaluation System

void gradeEvaluation(){

Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90){

 System.out.println("Grade: A");
}else if (marks >= 75){
System.out.println("Grade: B");
}else if (marks >= 60){

 System.out.println("Grade: C");
}else if (marks >= 40){
      System.out.println("Grade: D");

}else{
  System.out.println("Grade: F");

}


}


// Leap Year

void leapYear(){

   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a year : ");
   long year = sc.nextLong();
  
   if(year % 4 == 0 && year % 100 != 0){
    System.out.println(year + " is a leap year");
   } else if(year % 400 == 0){
 System.out.println(year + " is a leap year");
  } else{
 System.out.println(year + " is not a leap year");
}




}


// Day of the week

void dayOfWeek(){


Scanner sc = new Scanner(System.in);
System.out.print("Day Number : ");
int n = sc.nextInt();

switch(n){
 case 1 : System.out.println("The day is Monday.");
          break;
 case 2 : System.out.println("The day is Tuesday.");
          break;
 case 3 : System.out.println("The day is Wednesday.");
          break;
 case 4 : System.out.println("The day is Thursday.");
          break;
 case 5 : System.out.println("The day is Friday.");
          break;
 case 6 : System.out.println("The day is Saturday.");
          break;
 case 7 : System.out.println("The day is Sunday.");
          break;
 default: System.out.println("Invalid day number.");
          break;

}

}


// Identify default values

void defaultValues(){

 byte a;
 short b;
 int c;
 long d;
 float e;
 double f;
 char g;
 boolean h;

System.out.println("byte a : 0");
System.out.println("short b : 0");
System.out.println("int c : 0");
System.out.println("long d : 0");
System.out.println("float e : 0.0");
System.out.println("double f : 0.0");
System.out.println("char g :  ");
System.out.println("boolean h : false");




}



}









public class MainProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AssignmentMenu obj = new AssignmentMenu();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.gradeEvaluation();
                    break;

                case 2:
                    obj.leapYear();
                    break;

                case 3:
                    obj.dayOfWeek();
                    break;

                case 4:
                    obj.defaultValues();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }
}

