public class StackExample {
    public class Factorial {
        public static int factorial(int n) {
            if (n == 0) {
                return 1; // Base case
            }
            return n * factorial(n - 1); // Recursive call
        }

        public static void main(String[] args) {
            int result = factorial(5);
            System.out.println("Factorial of 5 is: " + result);
        }
    }
}
