package fourthtest;

import java.time.LocalDate;
import java.time.Month;

public class Array {

//	
//	public static void main(String[] args) {
//		int arr[]= {1,2,3};
//		int[] brr = arr.clone();
//		
//		System.out.println(arr==brr);
//		System.out.println("arr>>"+arr);
//		System.out.println("brr>>"+brr);
//	}
	
	
	public static void main(String args[]) {
	      //Getting the current date value
	      LocalDate currentdate = LocalDate.now();
	      System.out.println("Current date: "+currentdate);
	      //Getting the current day
	      int currentDay = currentdate.getDayOfMonth();
	      System.out.println("Current day: "+currentDay);
	      //Getting the current month
	      Month currentMonth = currentdate.getMonth();
	      System.out.println("Current month: "+currentMonth);
	      //getting the current year
	      int currentYear = currentdate.getYear();
	      System.out.println("Current year: "+currentYear);
	   }
}
