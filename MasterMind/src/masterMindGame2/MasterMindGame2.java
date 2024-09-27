package masterMindGame2;
import java.util.*;

public class MasterMindGame2 {

    public static void main(String[] args) {
    	
    	String name;
    	String bobTheCharacter;
    	String secretCode = "";
    	String userCode;
    	String outputCode = "";
    	
    	int i;
    	int i2;
    	int randomLetter;
    	int guesses = 10;
    	int codeLength = 4;
    	int colorCount = 6;
    	
    	boolean firstAttempt = false;
    	boolean wrongInput = true;
    	
    	Scanner sc = new Scanner(System.in);
    	Random r = new Random();
    	
    	ArrayList<String> colors = new ArrayList<>();
    	colors.add("R");
    	colors.add("G");
    	colors.add("B");
    	colors.add("Y");
    	colors.add("P");
    	colors.add("O");
    	
    	//welcome message
    	
    	
    	System.out.println("Welcome To MasterMind!\r\n" +
    					   "Please... (drumroll.mp4) Enter Your Name Down Below!\r\n");
    	name = sc.nextLine();
    	
    	for (i = 0; i < codeLength; i++) {
    		randomLetter = r.nextInt(colorCount - 1);
    		secretCode = secretCode + colors.get(randomLetter);
    	}
    	if (name.equals("Admin")) {
    		System.out.println(secretCode);
    	}
    	
    	System.out.println("Hello, " + name + "! Lets Stop All This Yapping And Get Straight To Bussiness!");
    	
    	//beginning game
    	for (i = 0; i < guesses; i++) {
    		System.out.println("\r\nGuess: " + (i + 1) + "/10\r\n" +
    					       "Please Choose Out Of Any Of The Following Colors: \r\n" + colors);
    		userCode = sc.nextLine();
    		
    		firstAttempt = true;
    		userCode = userCode.toUpperCase();
    		
    		if (secretCode.equals(userCode)) {
    			System.out.println("Wow! You Did It!");
    			return;
    		}
    		
    		if (userCode.length() != codeLength) {
    			System.out.println("\r\nERROR\r\n" +
    							   "Please Enter A Code With At Least " + codeLength + " Characters Long\r\n");
    			i--;
    			continue;
    		}
    		
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
    	    		firstAttempt = false;
    	    		i--;
    	    		continue;
    	    	}
    		}
    		System.out.println("\r\n" + outputCode);
    	}
    	System.out.println("Womp Womp!");
    	
    	sc.close();
	}

}