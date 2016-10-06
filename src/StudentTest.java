import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
	ArrayList studentList=new ArrayList();
	HashMap<String, Student> studentMap=new HashMap<String, Student>(); //key is String, object is Student
	
	public StudentTest(){
		System.out.println("Constructor called");
	}
	public void run(){
		
		System.out.println("run() called");
		Student s0=new Student("xx",1111,30,3.90);
		Student s1=new Student("two",1221,20,3.60);
		Student s2=new Student("three",1551,24,3.20);
		studentList.add(s0);
		studentList.add(s0);
//		studentList.add("Mark");
		studentList.add(s1);
		studentList.add(s2);
		System.out.println("Student: "+studentList.get(0));
		System.out.println("Student: "+studentList.get(1));

		System.out.println("Student: "+studentList.get(2));
		Student myStudent=(Student)studentList.get(2);
		System.out.println("Student: "+myStudent);
		displayStudents();
		studentMap.put(s0.getIdKey(), s0);
		studentMap.put(s1.getIdKey(), s1);
		studentMap.put(s2.getIdKey(), s2);
		System.out.println("Hashmap");
		System.out.println("Student: "+studentMap.get("1111"));
		
	}
	public void displayStudents(){
		for(Object studentObj:studentList){
			Student st=(Student) studentObj;
			System.out.println("Student:"+st);
		}
	}
	
	public static void main(String[] args) {
		StudentTest stTest=new StudentTest();
		stTest.run();
		
		// TODO Auto-generated method stub

	}

}
