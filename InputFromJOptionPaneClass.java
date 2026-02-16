import javax.swing.*;
class First{
    public static void main(String arr[]){
        int a;
        String s = JOptionPane.ShowInputDialog("enter a no.");
        a = Integer.parseInt(s);
        JOptionPane.ShowMessageDialog(null,"you entered"+a);
    }
}
