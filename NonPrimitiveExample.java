// Example of Non-Primitive Data Types

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class NonPrimitiveExample {

    public static void main(String[] args) {

        // 1. String
        String name = "Mukesh";
        System.out.println("String value: " + name);

        // 2. Array
        int[] numbers = {10, 20, 30};
        System.out.println("Array value: " + numbers[0]);

        // 3. Class & Object
        Dog myDog = new Dog();   // Object of class
        myDog.sound();

        // 4. Interface reference
        Animal obj = new Dog();  // Interface reference
        obj.sound();

        // 5. Object class
        Object value = "Hello Java";
        System.out.println("Object value: " + value);
    }
}
