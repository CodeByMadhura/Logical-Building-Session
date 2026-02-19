class EmployeeInfo{

    int emp_id;
    String emp_name;
    double salary;
    String department;
    static String batch="Feb26";


    void work(){
      System.out.println("Doing my work.... ");
}

}


class Employee{



   public static void main(String args[]){


   EmployeeInfo e1 = new EmployeeInfo();

   System.out.println(e1.emp_id);
   System.out.println(e1.emp_name);
   System.out.println(e1.salary);
   System.out.println(e1.department);

        e1.batch = "I am working.";
	System.out.println(e1.batch);
	System.out.println(e1.batch);



}





}