import java.util.Scanner;
import java.lang.Math;

public class Sieve {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int [] sieveArray = new int[n+1];

        for (int i = 0; i <= n; i++) {
            sieveArray[i] = i;
        }
            
        boolean [] sieveBooleanArray = new boolean[n+1];

        for(int i = 2; i <= n; i++) {
            sieveBooleanArray[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (sieveBooleanArray[i]) {
                for (int j = i*i; j <= n; j+=i) {
                    sieveBooleanArray[j] = false;
                }
            }
        }

        System.out.print("Primes up to " + n + ": ");

        for(int i = 2; i <= n; i++) {
            if(sieveBooleanArray[i]) {
                System.out.print(sieveArray[i] + " ");
            }
        }

        input.close();
    }
}
