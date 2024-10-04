package masterMindGame2;
import java.util.*;

public class MasterMindGame2 {

    public static void main(String[] args) {
    	
    	//variables
    	
    	String name;
    	String bobTheCharacter;
    	String secretCode = "";
    	String userCode;
    	String outputCode;
    	
    	int i;
    	int i2;
    	int randomLetter;
    	int guesses = 10;
    	int codeLength = 4;
    	
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
    		
    		outputCode = "";
    		
    		//checks what letters equal or are in the code
    		
    		for (i2 = 0; i2 < codeLength; i2++) {
    			
    			bobTheCharacter = "" + userCode.charAt(i2);
    			if (colors.contains(bobTheCharacter)) {
    				
	    			if (secretCode.charAt(i2) == userCode.charAt(i2)) {
	    				outputCode = outputCode + "B";
    				}
    				else if(secretCode.contains(bobTheCharacter)) {
    					outputCode = outputCode + "W";
    				}
    				else {
    					outputCode = outputCode + "-";
    				}
    			}
    			else {
    	    		wrongInput = true;
    	    		System.out.println("\r\nERROR\r\n" +
						       		   "Please Enter Valid Letters!\r\n");
    	    		i--;
    	    		continue outerLoop;
    	    	}
    		}
    		System.out.println("\r\n" + outputCode);
    	}
    	
    	//lose message
    	
    	System.out.println("Womp Womp!");
    	
    	sc.close();
    	
	}
}