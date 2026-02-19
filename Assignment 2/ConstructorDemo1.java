class Employee{

     int emp_id;
     String emp_name;
     String department;
     double salary;
     static String company_name="ABC";



Employee(){
  //System.out.println("In Constructor Block....");
  company_name = "XYZ";
}

static{
  // System.out.println("In Static Block...");
   company_name = "TCS";
}

{
  // System.out.println("In Instance Block...");
company_name = "Wipro";
emp_id = 15;
}

}





public class ConstructorDemo1{

   public static void main(String args[]){

   Employee e = new Employee();
   System.out.println(e.company_name);
   System.out.println(e.emp_id);

}


}