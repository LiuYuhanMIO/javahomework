package homework;
import java.util.*;

public class hw1303 {
	public static void main(String args[]) {
		ArrayList<Number> list = new ArrayList<Number>();
		System.out.println("���������ָ���:");
		Scanner input = new Scanner(System.in);	
		int len = input.nextInt();
		
		System.out.println("������ÿ������:");
		input = new Scanner(System.in);	
		for(int i=0;i<len;i++) {		
			int n = input.nextInt();
			list.add(n);
		}
		input.close();
		sort(list);
		System.out.print("�����listΪ��"+list);
		
	}
	
	//ð������
	public static void sort(ArrayList<Number> list) {
		for(int j=0;j<list.size();j++) {
			for(int k=0;k<list.size()-1;k++) {
				if(list.get(k).intValue() > list.get(k+1).intValue()) {
					int temp = list.get(k+1).intValue();
					list.set(k+1 , list.get(k).intValue());
					list.set(k , temp);
				}
			}
		}
		
	}

}
