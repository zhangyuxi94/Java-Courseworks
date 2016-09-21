import java.io.IOException;

public class CSYE6200Assign1Sol {

	public static void main(String[] args) throws IOException {
		System.out.println("Select from 1,2,3 or q to quit");
		char inChar=' ';
		char passKey0='*';
		char passKey1='*';
		char passKey2='*';
		char passKey3='*';
		do{
			inChar=(char)System.in.read();
			if(inChar=='\n') continue;
			if(inChar=='\r') continue;
			passKey0=passKey1;
			passKey1=passKey2;
			passKey2=passKey3;
			passKey3=inChar;
				switch(inChar){
				case '1':
					System.out.println("You selected option 1");
					break;
				case '2':
					System.out.println("You selected option 2");
					break;
				case '3':
					System.out.println("The history of your input is:");
					System.out.println(passKey0+" "+passKey1+" "+passKey2+" "+passKey3);
					break;
				case 'q':
					break;
				default:
					System.out.println("Invalid selection");
					break;
				}
				
				if(passKey0!='y') continue;
				if(passKey1!='z') continue;
				if(passKey2!='h') continue;
				if(passKey3!='a') continue;
				System.out.println("Password Accepted");
		}while(inChar!='q');
		
		System.out.println("Quitting...");
	}

}
