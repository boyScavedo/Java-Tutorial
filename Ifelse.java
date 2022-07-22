import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any integer value: ");
        int n = scan.nextInt();
        scan.close();

        if(n > 0) {
            System.out.println("The number you entered is Positive!");
        }
        else if(n < 0) {
            System.out.println("The number you entered is Negative!");
        }   
        else {
            System.out.println("The number you entered is Zero!");
        }
    }
}
