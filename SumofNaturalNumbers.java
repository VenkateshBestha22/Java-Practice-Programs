import java.util.Scanner;
public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Integer : ");

        int n = sc.nextInt();
        int sum=0;

        for(int i=1; i<=n; i++){                //this for loop start with i=1 its a initial value and move to i<=n "i is less than or equal to n this is condition , i++ in increment by 1 this is also called update step
            sum+=i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}

