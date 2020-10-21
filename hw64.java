package homework;
import java.util.*;

public class hw64 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		
		reverse(num);
	}
	
	public static void reverse(int number) {
		int n = 0;
		System.out.print("它的反序数为：");
		while(number != 0) {
			n = number % 10;    //求number的末尾数
			System.out.print(n);    
			number = number / 10;
		}
	}
}
