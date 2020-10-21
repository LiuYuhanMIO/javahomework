package homework;
import java.util.*;

public class hw710 {
	public static void main(String args[]) {
		double[] num = new double[10];
		System.out.println("请输入10个数字：");
		Scanner input = new Scanner(System.in);

		for(int i=0;i<10;i++) {
			num[i] = input.nextDouble();
		}
		
		int min_index = indexOfSmallestElement(num);
		System.out.print("最小元素的下标是："+min_index);
	}
	
	public static int indexOfSmallestElement(double[] array) {
		double min_num = array[0];
		int index = 0;
		for(int i=0;i<10;i++) {
			if(array[i] < min_num) {
				min_num = array[i];
				index = i;
			}	
		}
		return index;
	}
}
