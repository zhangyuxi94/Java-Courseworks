//Name: Yuxi Zhang
//NUID: 001668446
//Bonus Question: The key word is "YZH"

public class CSYE6200Assign1 {
	public static void main(String[] args) throws java.io.IOException {
		int count=0;
		char[] history=new char[3];
		for(int i=0;i<history.length;i++){
			history[i]='*';
		}
		char[] keyWord={'Y','Z','H'};
		char userEnter=' ';
		System.out.println("choose from 1,2,3; or q to quit:"); 
		do{
			userEnter=(char)System.in.read();
			if(userEnter!='\n'&&userEnter!='\r'){
				history[count++%3]=userEnter;
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
					break;
				case '2':
					int integerValue=userEnter;
					System.out.println("The ASCII value of '2' is "+integerValue);
					break;
				case '3':
					String printHistory=history[(count+2)%3]+" "+history[(count+1)%3]+" "+history[(count)%3];
					System.out.println("The last three inputs are: "+printHistory);
					break;
				case 'q':
					break;
				default:
					System.out.println("Wrong input. Please choose from 1,2,3:");
					break;
				}
				
				boolean flag =true;
				for(int i=0;i<3;i++){
					if(history[(count+i)%3]!=keyWord[i]){
						flag = false;
					}
				}
				if(flag){
					System.out.println("Password accepted");
				}
			}
		}while(userEnter!='q');
		System.out.println("Successfully quitted.");
	}
}
