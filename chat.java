import javax.swing.*;
class chat 
{
    public static void main(String ar[])
    {
        one o=new one();
        two t=new two();
            o.start();
            t.start();
    }
}

class one extends Thread
{
    public void run()
    {
        String s1=JOptionPane.showInputDialog(null, this);
        JOptionPane.showMessageDialog(null,s1);
    }
}
class two extends Thread
{
    public void run()
    {
        String s2=JOptionPane.showInputDialog(null, this);
        JOptionPane.showMessageDialog(null,s2);
    }
    
}
