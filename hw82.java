package homework;
import java.util.*;

public class hw82 {
	public static void main(String args[]) {
		System.out.println("Enter a 4-by-4 matrix row by row:");
		Scanner input = new Scanner(System.in);
		double[][] a = new double[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++)
				a[i][j] = input.nextDouble();
		}
		
		double sum = sumMajorDiagonal(a);
		System.out.print("Sum of the elements in the major diagonal is "+sum);
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0.0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i == j) 
					sum += m[i][j];
			}
		}
		return sum;
	}

}
