package fine;

import java.util.Map;
import java.util.Scanner;

public class PaymentServiceImpl implements PaymentService{
	 StudentService stu = new StudentServiceImpl(); 
	  PaymentServiceImpl(StudentService ss){
		  this.stu = ss;
	  }
      @Override
      public void addPayment(Scanner sc) {
    	  System.out.println("Enter name of the Student:");
    	  String name = sc.next();
    	  System.out.println("Enter fee in digits:");
    	  int fee = sc.nextInt();
    	  Student st = stu.Student_List.get(name);
    	  Payment_List.put(name,new Payment(st,fee));
      }

	  @Override
	  public void viewPending() {
		  System.out.println("Student with pending fine are:");
		   for(Map.Entry<String,Payment> entry:Payment_List.entrySet()) {
			 if(entry.getValue().isPending()) {
			 System.out.println("Student name: " + entry.getKey() + " Pending amnt: "+entry.getValue().getFee());
		       }
	   	   }		 
	  }

	  @Override
	  public void maxPending() {
		 int max =0;
		 String name ="";
		 for(Map.Entry<String,Payment> entry:Payment_List.entrySet()) {
			 if(entry.getValue().isPending() && entry.getValue().getFee()>max) {
				  max = entry.getValue().getFee();
				  name = entry.getKey();
			 }
		 }
		 System.out.println("Student with Max pending is: " + name + " with amount(in rupees):" + max);
		
	  }

	  @Override
	  public void deletePayment(Scanner sc) {
		  System.out.println("Enter Student name:");
		   Payment_List.get(sc.next()).setPending(false);
		   System.out.println("Payment deleted successfully!!");
		
	  }
}
