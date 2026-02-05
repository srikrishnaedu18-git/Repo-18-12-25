public class SimpleJavaProgram {
    public static void main(String[] args) {
        // Print a greeting message
        System.out.println("Hello, Welcome to Java!");

        // Declare a variable
        int n = 5;
        System.out.println("Counting from 1 to " + n + ":");

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Conditional example
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}
