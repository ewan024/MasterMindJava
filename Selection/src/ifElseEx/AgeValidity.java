package ifElseEx;
import java.util.*;
public class AgeValidity {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Can You Drive?\r\n" +
						   "Fill In Your Age Please...");

		boolean loop1 = true;
		int age;
		
		while (loop1) {
			
			age = sc.nextInt();
			
			if (age <= 0) {
				System.out.println("You're Not Born Yet! Please Fill In Valid Number!");
				continue;
			}
		
			if (age >= 18) {
				System.out.println("YAY! You Can Drive!");
				sc.close();
			} 
			else if (age < 18) {
				System.out.println("Womp, Womp! You Can't Drive!");
				sc.close();
			} 
		loop1 = false;
		}
		
	}

}
