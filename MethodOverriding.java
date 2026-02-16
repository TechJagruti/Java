class A {
    int a;
    void get(int x) {
        a = x;
    }
    void show() {
        System.out.println("a = " + a);
    }
}
class B extends A {
    int b;
    void get(int x, int y) {
        a = x;
        b = y;
    }
    void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
class Demo {
    public static void main(String arrr[]) {
        B ob = new B();
        ob.get(23, 34);
        ob.show();
    }
}
