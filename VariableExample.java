public class VariableExample {

    // Instance Variable (belongs to object)
    int instanceVar = 10;

    // Static Variable (belongs to class)
    static int staticVar = 20;

    public void show() {

        // Local Variable (inside method)
        int localVar = 30;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {

        // Creating object to access instance variable
        VariableExample obj = new VariableExample();

        obj.show();
    }
}
