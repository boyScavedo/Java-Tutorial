public class Typecasting {
    public static void main(String[] args) {
        int i = 9;
        double d = i; // This is automatic typecasting it hold value smaller than its datatype storage
        System.out.println(d);
        double f = 9.74;
        int j = (int) f; // This is manual typecasting it helps smaller datatype variables to hold large value by reducing the total storage
        System.out.println(j);
    }
}
