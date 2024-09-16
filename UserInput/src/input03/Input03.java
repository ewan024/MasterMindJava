package input03;
import java.util.Scanner;
class Input03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1;
        int input2;
        int input3;
        
        System.out.println("Please type your numbers...");
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        input3 = sc.nextInt();
        
        sc.close();
        
        System.out.println("Answer is:");
        
        int answer = input1 + input2 + input3;
        
        System.out.println(answer);
    }
}
