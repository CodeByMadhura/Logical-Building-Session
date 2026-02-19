import java.time.LocalTime;

public class Message{

   public static void main(String args[]){

  LocalTime now = LocalTime.now();
 // int hour = now.getHour(); 
int hour = 10;

   if(hour >= 5 && hour < 13){
     System.out.println("Good Morning !! ");
   }
   else {
     System.out.println("Good Afternoon !! ");
}

}

}