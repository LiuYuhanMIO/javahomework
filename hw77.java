package homework;
import java.util.*;

public class hw77 {
	public static void main(String args[]) {
		int[] counts = new int[10];
		System.out.println("���������������");
		
		for(int i=0;i<100;i++) {
			int k = (int) (Math.random()*10);
			counts[k]++;  //ͳ��0-9���ֳ��ֵĴ���
			System.out.print(k+" ");  //��ӡ�������
		}
		System.out.println();
		
		System.out.println("counts������");
		for(int i=0;i<10;i++) {
			System.out.print(counts[i]+" ");
		}
		
	}
}
