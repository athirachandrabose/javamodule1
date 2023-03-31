package javaenums;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek today = DayOfWeek.SATURDAY;
		System.out.println("Today is"+" " + today.getName());
	
	switch(today) {
	
	
	case MONDAY:
		     System.out.println("work hard");
		     break;
	
	case TUESDAY:
		   System.out.println("work little more");
	       break;
	case WEDNESDAY:
		   System.out.println("work work little more");
		   break;
	case THURSDAY:
		System.out.println("work work more,weekend is around");
		break;
	case FRIDAY:
		System.out.println("weekend is here");
		break;
	case SATURDAY:
		System.out.println("yaay...its weekend");
		 break;
	case SUNDAY:
		System.out.println("sleeeeep......");
	
	}
	} 
}
