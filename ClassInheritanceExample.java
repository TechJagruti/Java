class Theory {
    int h, e;
    void getMarks(int x, int y) {
        h = x;
        e = y;
    }
    void showMarks() {
        System.out.println("Hindi=" + h);
        System.out.println("Eng.=" + e);
    }
}
interface Practical {
    int p = 75;
    void showPracticalMarks();
}
class Marks extends Theory implements Practical {
    public void showPracticalMarks() {
        System.out.println("Practical=" + p);
    }
    void showTotalAndPercentage() {
        System.out.println("Total=" + (h + e + p));
        System.out.println("Per.=" + ((h + e + p) / 300.0 f * 100));
    }
}
class Demo {
    public static void main(String arr[]) {
        Marks m = new Marks();
        m.getMarks(70, 75);
        m.showMarks();
        m.showPracticalMarks();
        m.showTotalAndPercentage();
    }
}
