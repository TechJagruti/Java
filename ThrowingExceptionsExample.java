class Demo {
    public static void main(String arr[]) {
        int a = 10, b = 5, c;
        try {
            c = b - a;
            if (c < 0)
                throw new ArithmeticException("Negative value");
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
