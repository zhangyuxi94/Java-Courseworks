
public class contExample {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=i;
			if((i%10)!=0) 
				continue;
			System.out.println("i="+i);
		}
		System.out.println("Value of sum:" + sum);
		System.out.println("Done");
	}
}
