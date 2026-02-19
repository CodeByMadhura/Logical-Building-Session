class Employee{

   int emp_id;
   String emp_name;
   String department;
   double salary;
   static String company_name = "ABC";

   Employee(){
   emp_id = 100;
   emp_name = "Madhura";
   department = "IT";
   salary = 50000;
}


  Employee(int a){
   System.out.println("This is one parameterized constructor.");
   System.out.println(a);
  }


  Employee(int emp_id, String emp_name, String department, double salary){
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.department = department;
	this.salary = salary;
}

 void work(){
   System.out.println("Doing Work....");
 }

 void work(String s){
   System.out.println("Doing Work...." + s);
}

 void work(int i){
  System.out.println(i); 
}

 int workHours(){
	int hrs = 16;
	return 	hrs;
}


}

class ConstructorDemo2{
	public static void main(String args[]){

Employee e1 = new Employee(10,"Madhura","Development", 50000);
		System.out.println(e1.department);
Employee e2 = new Employee(20,"Vanshita","HR",100000);
		System.out.println(e2.department);
	Employee e3;
	e3=new Employee();
	System.out.println(e3.department);


	}
}