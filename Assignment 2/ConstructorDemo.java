class Employee{

     int emp_id;
     String emp_name;
     String department;
     double salary;
     static String company_name="ABC";



Employee(){
  System.out.println("In Constructor Block....");
}

static{
   System.out.println("In Static Block...");
}

{
   System.out.println("In Instance Block...");
}

}



public class ConstructorDemo{

   public static void main(String args[]){

   Employee e = new Employee();

}


}