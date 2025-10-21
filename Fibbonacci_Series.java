public class Fibbonacci_Series {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count=10;
        System.out.println(n1+ " " + n2);

        for(i=0; i<count; ++i){
            n3=n1+n2;
                    System.out.print(" "+n3);
                    n1=n2;
                    n2=n3; //(Fibonacci series it is a sequences of numbers
                                // where each number is the sum of the previous two numbers

        }

    }
}


