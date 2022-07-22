import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int i = scan.nextInt();
        System.out.println("The number you entered is " + i);
    }
}