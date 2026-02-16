class Exep {
    public static void main(String arr[]) {
        int a[] = {
            5,
            10
        };
        int b = 5;
        int x;
        try {
            x = a[1] / (b - a[0]);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index error");
        } finally {
            System.out.println("Entered in finally block");
        }
    }
}
