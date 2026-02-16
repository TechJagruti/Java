class A implements Runnable {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("A=" + i);
        }
    }
}
class B implements Runnable {
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
        Thread ob1 = new Thread(o1);
        Thread ob2 = new Thread(o2);
        ob1.start();
        ob2.start();
    }
}
