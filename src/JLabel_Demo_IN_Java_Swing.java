import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabel_Demo_IN_Java_Swing {
    static void main(String[] args) {

    // JLabel = to add text or image in the JFrame

        JLabel label = new JLabel();
        label.setText("Programming with Divyanshu");

       ImageIcon icon = new ImageIcon("LogoJava.jpeg");
        label.setIcon(icon);

        label.setHorizontalTextPosition(JLabel.CENTER);
      // label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalTextPosition(JLabel.BOTTOM);

        label.setForeground(new Color(0x00FF00));

        label.setFont(new Font("MV Boli", Font.PLAIN,20));

        // label.setIconTextGap(60);

        label.setBackground(Color.BLUE);
        label.setOpaque(true);

        Border border = BorderFactory.createLineBorder(Color.yellow,4);
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,700);

        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(label);
        frame.pack();
    }
}
