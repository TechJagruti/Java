class A extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("A=" + i);
        }
    }
}
class B extends Thread {
    public void run() {
        int j;
        for (j = 1; j <= 10; j++) {
            System.out.println("B=" + j);
        }
    }
}
class Demo {
    public static void main(String arr[]) {
        A o1 = new A();
        B o2 = new B();
        o1.start();
        o2.start();
    }
}
