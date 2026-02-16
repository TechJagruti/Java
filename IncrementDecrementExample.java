public class IncrementDecrementExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        // Pre-increment
        System.out.println("Pre-Increment (++x): " + (++x));

        // Post-increment
        System.out.println("Post-Increment (y++): " + (y++));
        System.out.println("Value of y after post-increment: " + y);

        int a = 20;
        int b = 20;

        // Pre-decrement
        System.out.println("Pre-Decrement (--a): " + (--a));

        // Post-decrement
        System.out.println("Post-Decrement (b--): " + (b--));
        System.out.println("Value of b after post-decrement: " + b);
    }
}
