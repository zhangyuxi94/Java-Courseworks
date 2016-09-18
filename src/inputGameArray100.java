public class inputGameArray100 {
	
	static int   count = 0;
	public static void Xixi(char [] history){
		System.out.println("The history input is : ");
		for(int i=1;i<=3;i++){
			char temp = count - i>=0?history[count-i]:'*';
			System.out.print(temp+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws java.io.IOException {
		char userEnter=' ';
		System.out.println("choose from 1,2,3; or q to quit:"); 
		int index=2;
		char[] history=new char[100];
	
		do{
			userEnter=(char)System.in.read();
//			System.out.println(userEnter+"wahaha");
			switch(userEnter){
			case '1':        
				history[count++] = userEnter;
				System.out.println("Number\tCube the number");
				int sum=0;
				for(int i=1;i<=9;i++){
					int number=i;
					int cubedNumber=i*i*i;
					System.out.println(number+"\t"+cubedNumber);
					sum+=cubedNumber;
				}
				System.out.println("Sum:\t"+sum);
				break;
			case '2':
				history[count++] = userEnter;
				int integerValue=userEnter;
				System.out.println("The ASCII value of '2' is "+integerValue);
				break;
			case '3':
				history[count++] = userEnter;
				Xixi(history);
				break;
			case '\n':
			case '\r':
			case 'q':
				break;
				
			default:
				System.out.println("Wrong input. Please choose from 1,2,3:");
				break;
			}
			
		}while(userEnter!='q');
		System.out.println("Successfully quitted.");
	}
}


