import java.util.Scanner;
import java.lang.Math;

public class Sieve {
    public static void main(String[] arcs) {
    Scanner input = new Scanner(System.in);


    System.out.print("Enter a number ");
    int n = input.nextInt();

    int [] sieveArray = new int[n];

    for (int i = 1; i < n; i++) {
        sieveArray[i] = i+1;
        System.out.println(sieveArray[i]);
    }
        
    boolean [] sieveBooleanArray = new boolean[n];

    for (int i = 1; i < n; i++) {
        sieveBooleanArray[i] = true;
        // System.out.println(sieveBooleanArray[i]);

        if (sieveBooleanArray[i] == true) {
            
            for (int j = i*i; i*i < n; j+=i) {

                sieveBooleanArray[j] = false;
                System.out.println(sieveBooleanArray[j]);

            }
        }

    }

    }
}
