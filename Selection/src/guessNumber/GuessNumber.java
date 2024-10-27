package guessNumber;

import java.util.*;

public class GuessNumber {

	public static void main(String[] args) {
		
		int randomNumber;
		int i;
		int userInput;
		
		Scanner sc = new Scanner(System.in);
    	Random r = new Random();
    	
    	randomNumber = r.nextInt(100) + 1;
    	
    	for (i = 1; i <= 7; i++) {
    		
    		System.out.println("Your Guess:");
    		userInput = sc.nextInt();
    		
    		if (userInput == randomNumber) {
    			System.out.println("YIPPIE!\r\n" +
    							   "You Did It In " + i + " Guesses");
    			return;
    		}
    		
    		if (userInput > randomNumber) {
    			System.out.println("Too High!");
    		}
    		
    		if (userInput < randomNumber) {
    			System.out.println("Too Low!");
    		}
    		
    		if (i == 7) {
    			System.out.println("Womp, Womp!");
    		}
    	}
    sc.close();
	}
}