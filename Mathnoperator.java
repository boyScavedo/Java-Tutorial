public class Mathnoperator {
    public static void main(String[] args) {
        int i = 10;
        int j = 11;

        System.out.println(Math.max(i, j)); // Prints which one is greater

        System.out.println(Math.min(i, j)); // Prints which one is smaller

        System.out.println(Math.sqrt(i)); // Prints the square root of i which is equal to 10 

        float f = -4.65f;

        System.out.println(Math.abs(f)); // Prints the absolute value of f which will be (4.65)

        int a = 10;
        int b = 20;
        int sum = a + b; // Operator for adding two numbers
        int product = a * b; // Operator for multiplying two numbers
        float division = a / b; // Operator for dividing a with b
        int difference = a - b; // Operator for subtracting two numbers

        System.out.println("The sum of " + a + " and " + b + " is " + sum 
        + " The product of " + a + " and " + b + " is " + product 
        + " The division of " + a + " and " + b + " is " + division 
        + " The difference of " + a + " and " + b + " is " + difference);

        // There are many more logical operators such as <=, >=, ==, != and so on, which we will discuss on If-Else in Episode 5
    }
}
