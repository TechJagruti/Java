interface Area {
    float pi = 3.14 f;
    void compute(float x);
}
class Circle implements Area {
    public void compute(float x) {
        System.out.println("Area of circle=" + (pi * x * x));
    }
}
class Demo {
    public static void main(String arr[]) {
        Circle c = new Circle();
        c.compute(10);
    }
}
