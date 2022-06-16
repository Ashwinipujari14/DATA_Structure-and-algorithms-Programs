import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       int n = scanner.nextInt();
       
        if (n%2==1 || (n>=6 && n<=20))
        {
            System.out.println("weird");
        } else
        {
            System.out.println("Not Weird");
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}