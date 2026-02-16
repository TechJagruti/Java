class Demo {
    public static void main(String arr[]) throws Exception {
        String s;
        DataInputStream in = new DataInputStream(System.in);
        System.out.print("Enter a string: ");
        s = in.readLine();
        System.out.println("You entered: " + s);
    }
}
