class Demo {
    public static void main(String arr[]) {
        int a[] = {
            5,
            10
        };
        int x, b = 5, i = 2;
        try {
            x = a[1] / (b - a[i]);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
