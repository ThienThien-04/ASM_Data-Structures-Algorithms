package RecursionAlgorithm;

public class Recursions {
    public static void countNumberNonRecursion(int number){
        if (number <= 0) {
            return;
        }
        for (int i = 1; i <= number; i++){
            System.out.println(i);
        }
    }
    public static void countNumberWithRecursion(int n, int m){
        if (n > m){
            return;
            // buoc khu de quy(suy bien)
            // dung chuong trinh de quy lai
        }
        System.out.println(n);
        n = n + 1;
        countNumberWithRecursion(n, m); // goi de quy
    }
    public static long factorialNonRecursion(int n){
        if (n < 0){
            return 0;
        }
        if (n == 1 || n == 0){
            return 1;
        }
        long result = 1;
        for (long i = 1; i <= n; i++){
            result *= i; // result = result * i
        }
        return result;
    }
    public static long factorialWithRecursion(int n){
        if (n < 0){
            return 0;
        }
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorialWithRecursion(n-1);
    }
    public static long fibonacciRecursion(long number){
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacciRecursion(number - 1)+fibonacciRecursion(number-2);
    }
    public static long sumNumbersWithRecursion(long n){
        if (n <= 1){
            return 1;
        }
        return n + sumNumbersWithRecursion(n-1);
    }
    public static long sumNumbersNonRecursion(long n){
        if (n <= 1){
            return 1;
        }
        return (n*(n+1))/2;
    }
}
