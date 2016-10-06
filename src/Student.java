
public class Student {
	private String name;
	private int id;
	private int age;
	private double gpa;
	public Student(String name,int id, int age, double gpa){
		this.name=name;
		this.id=id;
		this.age=age;
		this.gpa=gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getIdKey(){
		return(String.valueOf(id));
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String toString(){
		return "[String,name="+name+"]";
	}
	

}
