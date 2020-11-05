package homework;
import java.util.*;

public class hw77 {
	public static void main(String args[]) {
		int[] counts = new int[10];
		System.out.println("随机生成数数组是");
		
		for(int i=0;i<100;i++) {
			int k = (int) (Math.random()*10);
			counts[k]++;  //统计0-9数字出现的次数
			System.out.print(k+" ");  //打印随机数组
		}
		System.out.println();
		
		System.out.println("counts数组是");
		for(int i=0;i<10;i++) {
			System.out.print(counts[i]+" ");
		}
		
	}
}
