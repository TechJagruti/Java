class Parent {
    void show() {
        System.out.println("Parent class method called");
    }
}
class Child extends Parent {
    void show() {
        super.show();
        System.out.println("Child class method called");
    }
}
class Demo {
    public static void main(String arr[]) {
        Child c = new Child();
        c.show();
    }
}
