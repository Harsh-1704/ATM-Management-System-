package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class bank extends JFrame {
    bank() {
        ImageIcon imageIcon = new ImageIcon("C:/Users/asus/IdeaProjects/untitled1/src/bank/icons/bank2.jpg");
        Image imageOne =  imageIcon.getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(imageOne);
        JLabel imageLabel = new JLabel(imageIcon1);
        add(imageLabel);


        setSize( 600,600);
        setLocation(650, 250);
        setVisible(true);

        try{
            Thread.sleep(3000);
            setVisible(false);

            new login();

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        new bank();
    }
}
