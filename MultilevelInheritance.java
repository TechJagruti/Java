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
class C extends B {
    float p;
    void per() {
        p = t / 200.0 f * 100;
    }
    void showp() {
        System.out.println("Percentage = " + p);
    }
}
class Demo {
    public static void main(String arr[]) {
        C ob = new C();
        ob.get(70, 80);
        ob.put();
        ob.tot();
        ob.show();
        ob.per();
        ob.showp();
    }
}
