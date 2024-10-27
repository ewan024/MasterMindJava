package ifElseEx;
public class ArrayEx1 {

    public static void main(String args[]) {
        
        int[] primeNum = new int[20];
        int[] even = new int[5];
        int[] score = new int[9];
        
        long[] primes = new long[2];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = new long[1];
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        
        byte [] values = new byte[10];
        values[0] = 1;
        values[1] = 1;
        values[2] = 1;
        values[3] = 1;
        values[4] = 1;
        values[5] = 1;
        values[6] = 1;
        values[7] = 1;
        values[8] = 1;
        values[9] = 1;
        System.out.println(values);
    }

}
