import java.io.*;
class First{
    public static void main(String arr[]){
        int a;
        Try{
            DataInputStream in = new DataInputStream(System.in);
            System.out.print("enter a no.");
            a= Integer.pardeInt(in.readLine());
            System.out.println("you entered "+a);
        }
        catch(Exception e){
            system.out.println("Error");
        }
    }
}
