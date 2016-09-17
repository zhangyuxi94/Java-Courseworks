public class CSYE6200Assign1 {
	public static void main(String[] args) throws java.io.IOException {
		int count=0;
		char[] history=new char[3];
		history[0]='*';
		history[1]='*';
		history[2]='*';
		char userEnter=' ';
		System.out.println("choose from 1,2,3; or q to quit:"); 
		do{
			userEnter=(char)System.in.read();
			switch(userEnter){
			case '1':        
				System.out.println("Number\tCube the number");
				int sum=0;
				for(int i=1;i<=9;i++){
					int number=i;
					int cubedNumber=i*i*i;
					System.out.println(number+"\t"+cubedNumber);
					sum+=cubedNumber;
				}
				System.out.println("Sum:\t"+sum);
				history[count++%3]=userEnter;
				break;
			case '2':
				int integerValue=userEnter;
				System.out.println("The ASCII value of '2' is "+integerValue);
				history[count++%3]=userEnter;
				break;
			case '3':
				history[count++%3]=userEnter;
				String printHistory=history[(count+2)%3]+" "+history[(count+1)%3]+" "+history[(count)%3];
				System.out.println("The last three inputs are: "+printHistory);
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
