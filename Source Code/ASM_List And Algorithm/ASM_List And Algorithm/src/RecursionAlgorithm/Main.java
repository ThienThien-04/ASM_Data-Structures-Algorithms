package RecursionAlgorithm;

public class Main {
    public static void main(String[] args){
        Recursions.countNumberNonRecursion(9);
        Recursions.countNumberWithRecursion(1, 9);
        long result = Recursions.factorialWithRecursion(-15);
        System.out.println("Recursion of 5 is : " + result);
        for (int i = 1; i <= 8; i++){
            System.out.print(Recursions.fibonacciRecursion(i) + " ");
        }
        System.out.println();
        long sum = Recursions.sumNumbersWithRecursion(100);
        System.out.print("Sum from 1 to 100 is : " + sum);
    }
}
