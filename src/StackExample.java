import java.util.Stack;

public class StackExample {
	
	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(5);
		System.out.println(s.size());
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		
		System.out.println(s);
	}

}
