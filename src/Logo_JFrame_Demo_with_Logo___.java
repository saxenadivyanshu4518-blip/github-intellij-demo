import javax.swing.*;
import java.awt.*;

public class Logo_JFrame_Demo_with_Logo___ {
    static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("My GUI JFrame");

        // frame.setSize(400,400);

        frame.setBounds(400,200,400,400);

        frame.getContentPane().setBackground(Color.BLUE);

        frame.setMaximumSize(new Dimension(100,100));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


         ImageIcon logo = new ImageIcon("logo.jpeg");
         frame.setIconImage(logo.getImage());


        frame.setVisible(true);
    }
}
