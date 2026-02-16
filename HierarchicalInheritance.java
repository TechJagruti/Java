class A {
    int a, b;
    void get(int x, int y) {
        a = x;
        b = y;
    }
    void put() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
class B extends A {
    int t;
    void tot() {
        t = a + b;
    }
    void show() {
        System.out.println("Total = " + t);
    }
}
class C extends A {
    float p;
    void per() {
        p = (a + b) / 200.0 f * 100;
    }
    void showp() {
        System.out.println("Percentage = " + p);
    }
}
