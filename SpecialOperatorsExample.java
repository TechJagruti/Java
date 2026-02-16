class Person {
    String name = "Mukesh";

    void display() {
        System.out.println("Name: " + name);
    }
}

public class SpecialOperatorsExample {

    public static void main(String[] args) {

        // Creating object
        Person obj = new Person();

        // 1️⃣ instanceof Operator
        boolean check = obj instanceof Person;
        System.out.println("Is obj instance of Person? " + check);

        // 2️⃣ Ternary Operator
        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);

        // 3️⃣ Dot Operator
        obj.display();   // Accessing method using dot operator
    }
}
