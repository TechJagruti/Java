class Exep {
    public static void main(String arr[]) {
        int a[] = {
            5,
            10
        };
        int b = 5;
        int x;
        int i = 2;
        try {
            x = a[1] / (b - a[i]);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}
