package homework;
import java.util.Date;

public class hw93 {
	public static void main(String args[]) {
		for(long i= 10000;i<=100000000000L;i = i*10)
			show_time(i);
	}
	
	static void show_time(long t) {
		java.util.Date date = new java.util.Date();
		date.setTime(t);
		System.out.println(date.toString());
	}
}

