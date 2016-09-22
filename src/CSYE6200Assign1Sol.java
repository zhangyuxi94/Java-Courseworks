import java.io.IOException;

public class CSYE6200Assign1Sol {

	char inChar=' ';
	char passKey0='*';
	char passKey1='*';
	char passKey2='*';
	char passKey3='*';
	
	public static void main(String[] args) throws IOException {
		CSYE6200Assign1Sol myProg=new CSYE6200Assign1Sol();
		myProg.run();
	}
	public CSYE6200Assign1Sol(){
		System.out.println("Constructor called");
	}
	
	public void addKey(char inChar){
		passKey0=passKey1;
		passKey1=passKey2;
		passKey2=passKey3;
		passKey3=inChar;
	}

	public boolean isPassMatched(){
		if(passKey0!='y') return false;
		if(passKey1!='z') return false;
		if(passKey2!='h') return false;
		if(passKey3!='a') return false;
		return true;
	}
	
	public void run() throws IOException{
		System.out.println("Select from 1,2,3 or q to quit");
	
		do{
			inChar=(char)System.in.read();
			if(inChar=='\n') continue;
			if(inChar=='\r') continue;

			addKey(inChar);
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
				
				if(isPassMatched()){
					System.out.println("Password Accepted");
				}
				
		}while(inChar!='q');
		
		System.out.println("Quitting...");
	}

}
