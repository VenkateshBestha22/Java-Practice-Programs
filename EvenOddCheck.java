

import java.util.Scanner;


public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number ");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println(n+"Is Even");
        }else {
            System.out.println(n+"Is Odd");
        }
        sc.close();
    }

}
