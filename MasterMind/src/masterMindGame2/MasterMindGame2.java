package masterMindGame2;
import java.util.*;

public class MasterMindGame2 {

    public static void main(String[] args) {
    	
    	//variables
    	
    	//strings
    	
    	String name;
    	String bobTheCharacter;
    	String secretCode = "";
    	String userCode;
    	String outputCode;
    	
    	//intergers
    	
    	int i;
    	int i2;
    	int randomLetter;
    	int guesses = 100;
    	int codeLength = 4;
    	
    	//booleans
    	
    	boolean wrongInput = false;
    	
    	//imports
    	
    	Scanner sc = new Scanner(System.in);
    	Random r = new Random();
    	
    	//the (string) array list for the colors
    	
    	ArrayList<String> colors = new ArrayList<>();
    	colors.add("R");
    	colors.add("G");
    	colors.add("B");
    	colors.add("Y");
    	colors.add("P");
    	colors.add("O");
    	colors.add("C");
    	
    	//welcome message
    	
    	System.out.println("Welcome To MasterMind!\r\n" +
    					   "Please... (drumroll.mp3) Enter Your Name Down Below!\r\n");
    	
    	//player enters name
    	
    	name = sc.nextLine();
    	
    	//code generator
    	
    	for (i = 0; i < codeLength; i++) {
    		randomLetter = r.nextInt(colors.size());
    		secretCode = secretCode + colors.get(randomLetter);
    	}
    	
    	//shows code if name is Admin
    	
    	if (name.equals("Admin")) {
    		System.out.println(secretCode);
    	}
    	
    	//start message
    	
    	System.out.println("Hello, " + name + "! Lets Start The Game!");
    	
    	//beginning game, defines the outside of the loop
    	
    	outerLoop: for (i = 0; i < guesses; i++) {
    		
    		//the amount of guesses left message
    		
    		System.out.println("\r\nGuess: " + (i + 1) + "/10\r\n" +
    					       "Please Choose Out Of Any Of The Following Colors: \r\n" + colors);
    		userCode = sc.nextLine();
    		
    		//validates lowercase input
    		
    		userCode = userCode.toUpperCase();
    		
    		//checks if code is correct to the secret code
    		
    		if (secretCode.equals(userCode)) {
    			System.out.println("Wow! You Did It!");
    			sc.close();
    			return;
    		}
    		
    		//error if text is not equal to the code length
    		
    		if (userCode.length() != codeLength) {
    			System.out.println("\r\nERROR\r\n" +
    							   "Please Enter A Code With At Least " + codeLength + " Characters Long\r\n");
    			i--;
    			continue;
    		}
    		
    		//makes sure evaluation code does not print multiple times
    		outputCode = "";
    		
    		//code evaluation
    		
    		for (i2 = 0; i2 < codeLength; i2++) {
    			
    			//converts a string into a character
    			
    			bobTheCharacter = "" + userCode.charAt(i2);
    			
    			//checks if code has ONLY valid letter pt. 1
    			
    			if (colors.contains(bobTheCharacter)) {
    				
    				//checks if user code if in the right place and the right character
    				
	    			if (secretCode.charAt(i2) == userCode.charAt(i2)) {
	    				outputCode = outputCode + "B";
    				}
	    			
	    			//checks if user code is the right character but not in the right spot
	    			
    				else if(secretCode.contains(bobTheCharacter)) {
    					outputCode = outputCode + "W";
    				}
	    			
	    			//checks if the user code is not in the right place nor in the right spot
	    			
    				else {
    					outputCode = outputCode + "-";
    				}
    			}
    			
    			//checks if code has ONLY valid letter pt. 2
    			else {
    	    		wrongInput = true;
    	    		System.out.println("\r\nERROR\r\n" +
						       		   "Please Enter Valid Letters!\r\n");
    	    		i--;
    	    		continue outerLoop;
    	    	}
    		}
    		
    		//prints evaluation code
    		
    		System.out.println("\r\n" + outputCode);
    	}
    	
    	//lose message
    	
    	System.out.println("Womp Womp!");
    	
    	//closes scanner
    	
    	sc.close();
    	
	}
}