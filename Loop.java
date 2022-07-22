public class Loop {
    public static void main(String[] args) {
        int i = 10;

        while(i > 1) {
            System.out.println("Hello World! from while loop " + i);
            i -= 1;
        }

        i = 10;

        do {
            System.out.println("hello World! from do while loop " + i);
            i -= 1;
        }while(i > 1);

        for(int j = 10; j > 1; j--) {
            System.out.println("Hello World! from for loop " + j);
        }
    }
}