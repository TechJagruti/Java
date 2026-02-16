class Exep {
    public static void main(String arr[]) {
        int a = 10;
        int b = 5;
        int c = 5;
        int x, y;
        try {
            x = a / (b - c);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
