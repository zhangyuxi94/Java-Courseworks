import java.io.IOException;

public class GuessTheLetterGame {
	
	public static void main(String[] args) throws IOException {
		char answer='L';
		char guess;
		System.out.println("Guess a char from A to Z: ");
		guess=(char)System.in.read();
		if(guess==answer){
			System.out.println("You are right");
		}
		else{
			System.out.println("Sorry, you are ");
			if(guess>answer) System.out.println("too high");
			else System.out.println("too low");
		}
		
	};
}
