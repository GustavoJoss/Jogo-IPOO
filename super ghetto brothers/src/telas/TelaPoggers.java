package telas;

import javax.swing.*;
import java.awt.*;

public class TelaPoggers extends JFrame {
    public TelaPoggers() {
        JFrame poggers = new JFrame("Super Ghetto Brothers");

        setTitle("Super Ghetto Brothers");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        ImageIcon imagemFundo = new ImageIcon("D:\\IPOO\\6dlExhFtvqNE.png");
        JLabel imagemLabel = new JLabel(imagemFundo);
        getContentPane().add(imagemLabel);
        imagemLabel.setBounds(0, 0, 800, 500);
        imagemLabel.setVisible(true);




    }


}
