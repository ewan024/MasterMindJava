package input03;
import java.util.*;

public class Chickens01 {
    public static void main(String[] args) 
    {

    	
    	int eggsPerChicken;
    	int chickenCount;
    	
    	String newLine = System.getProperty("line.separator");
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Please insert the amount of chickens." + newLine + "----------");
    	chickenCount = sc.nextInt();
    	System.out.println("Please insert the amount of eggs a chicken lays." + newLine + "----------");
    	eggsPerChicken = sc.nextInt();
    	
    	
    	System.out.println("----------" + newLine + "Day 1");
    	int totalEggs = eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
        
        System.out.println("----------" + newLine + "Day 2");
        chickenCount ++;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
        
        System.out.println("----------" + newLine + "Day 3");
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
        
        sc.close();
    }   
}
