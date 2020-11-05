package homework;
import java.util.*;

public class hw617 {
	public static void main(String args[]) {
		System.out.println("请输入一个正整数：");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		int i,j = 0;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				Random random = new Random();
				int k = random.nextInt(2);  //0,1随机数生成
				System.out.print(k+" "); //空格分隔
			}
			System.out.println();  //换行
		}
	}
}
