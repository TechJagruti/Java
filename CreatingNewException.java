class MyExcep extends Exception {
    MyExcep() {
        System.out.println("In MyExcep class");
    }
}
class UserDefinedException {
    public static void main(String arr[]) {
        int x = 5, y = 10;
        try {
            int z = y / x;
            if (z <= 2)
                throw new MyExcep();
        } catch (MyExcep e) {
            System.out.println("z is less than 2");
        }
    }
}
