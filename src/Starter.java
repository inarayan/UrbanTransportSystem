

import java.util.Date;

import com.carpool.logic.BookingSystem;
import com.carpool.model.Customer;

public class Starter {

	
	public static void main(String [] args) throws InterruptedException{
		
		String bookingStatus1 =  BookingSystem.bookATrip("cs1", "Delhi", "Luckhnow", new Date(), new Date()); 
		System.out.println(bookingStatus1);
		Thread t = new Thread();
		//t.sleep(10);
		String bookingStatus2 =  BookingSystem.bookATrip("cs2", "Delhi", "Luckhnow", new Date(), new Date()); 
		System.out.println(bookingStatus2);
		Thread t1 = new Thread();
		//t1.sleep(10);
		String bookingStatus3 =  BookingSystem.bookATrip("cs3", "Delhi", "Luckhnow", new Date(), new Date()); 
		System.out.println(bookingStatus3);
		Thread t2 = new Thread();
		//t2.sleep(10);
		String bookingStatus4 =  BookingSystem.bookATrip("cs4", "Delhi", "Luckhnow", new Date(), new Date()); 
		System.out.println(bookingStatus4);
		Thread t3 = new Thread();
		t3.sleep(10);
		
	
		
		
	}
}
