package homework;
import java.util.*;

public class hw1313 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生个数：");
		int len = input.nextInt();
		Course course = new Course("Java");
		
		System.out.println("请输入学生姓名");
		input = new Scanner(System.in);
		for(int i=0;i<len;i++) {
			String name = input.next();
			course.addStudent(name);
		}
		input.close();
		Course course2 = new Course("C++");
		course2 = course.clone("C++");
		
		System.out.print("选修C++的同学有：");
		for(int i=0;i<course2.getNumberOfStudents();i++)
			System.out.print(course2.getStudents()[i]+" ");
	}

}

class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents(){
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public Course clone(String courseName) {
		Course course2 = new Course(courseName);
		for(int i=0;i<numberOfStudents;i++) {
			course2.addStudent(students[i]);
		}
		return course2;
	}
}