public class SwitchDemo {

	public static void main(String[] args) throws java.io.IOException {
		System.out.println("Select from a,b or q to quit");
		char inChar;
		do{
			inChar=(char)System.in.read();
			switch(inChar){
			case 'a':
				System.out.println("You selected option a");
				break;
			case 'b':
				System.out.println("You selected option b");
				break;
			case '\r':
			case '\n':
			case 'q':
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}
		}while(inChar!='q');
		
		System.out.println("Quitting...");
	}

}
