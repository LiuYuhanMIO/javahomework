package homework;
import java.util.*;

public class hw64 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int num = input.nextInt();
		
		reverse(num);
	}
	
	public static void reverse(int number) {
		int n = 0;
		System.out.print("���ķ�����Ϊ��");
		while(number != 0) {
			n = number % 10;    //��number��ĩβ��
			System.out.print(n);    
			number = number / 10;
		}
	}
}
