package input03;
import java.util.*;

public class Chickens02 {
    public static void main(String[] args) {
    	
    	double dailyAverage;
    	double monthlyAverage;
    	double monthlyProfit;
    	int eggs;
    	
    	
    	String newLine = System.getProperty("line.separator");
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Please insert the amount of eggs on Day 1:" +newLine +"----------");
    	eggs = sc.nextInt();
    	
    	System.out.println("----------" +newLine +"Please insert the amount of eggs on Day 2:" +newLine +"----------");
    	eggs += sc.nextInt();
    	
    	System.out.println("----------" +newLine +"Please insert the amount of eggs on Day 3:" +newLine +"----------");
    	eggs += sc.nextInt();
    	sc.close();
    	
    	dailyAverage = eggs / 3.0;
    	
    	monthlyAverage = dailyAverage * 30.0;
    	
    	monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage +newLine +"----------");
        System.out.println("Monthly Average: " +monthlyAverage +newLine +"----------");
        System.out.println("Monthly Profit:  €" +monthlyProfit);
    }
    
}
