package fine;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
	//	List<Student> Student_list = new ArrayList<>();
		//List<Payment> Payment_list = new ArrayList<>();
		StudentService s_service = new StudentServiceImpl();
		PaymentService p_service = new PaymentServiceImpl(s_service);
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter your opt 1:Student 2:Admin 3.exit");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println("Enter 1 to view fine\n" + "Enter 2 to pay fine");
			int opt = sc.nextInt();
			switch(opt) {
			    case 1:{
				   s_service.viewfine(sc);
				   break;
			    }
			    case 2:{
	              s_service.payFine(sc);
		       }
		   }
		}
		else if(n==2){
			while(true) {
			System.out.println("Enter 1 to proceed:\n" +"Enter 2 to exit:");
			int opt = sc.nextInt();if(opt==2){System.out.println("Thank You");break;}
			System.out.println("Enter 1 to add Student\n"
					+ "Enter 2 to add payment\n"
					+ "Enter 3 to view all fine list\n"+"Enter 4 to display Student with highest fine\n"
					+ "Enter 5 to delete payment");
			int ad = sc.nextInt();
			switch(ad) {
			   case 1:{
				     s_service.addStudent(sc);
				   break;
			    }
			   case 2:{
				    p_service.addPayment(sc);break;
			   }
			   case 3:{
				    p_service.viewPending();
				   break;
			   }
			   case 4:{
				   p_service.maxPending();break;    
			   }
			   case 5:{
                    p_service.deletePayment(sc);
				    break;
			    }
			}
			
		}
	}else {
		System.out.println("Thank you");break;
	}
	}
	}
}

