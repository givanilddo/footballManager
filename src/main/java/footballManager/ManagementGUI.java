package footballManager;

import javax.swing.*;
import java.awt.*;

public class ManagementGUI extends JFrame {
    JLabel line1, line2, line3;

    //Adicionando Imagens
    ImageIcon logoImg = new ImageIcon("./imgs/logo.png"); //C:\Users\Givanildo\Desktop\projeto futebol manager poo\imgs
    ImageIcon add = new ImageIcon("./imgs/add.png");
    ImageIcon remove = new ImageIcon("./imgs/remove.png");
    ImageIcon search = new ImageIcon("./imgs/search.png");

    JButton addButton, removeButton, searchButton;



    public ManagementGUI() {

        setTitle("FOOTBALL MANAGER");
        setSize(750,500); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.DARK_GRAY);

        line1 = new JLabel("F O O T B A L L   M A N A G E R", JLabel.CENTER);
        line1.setForeground(Color.black);
        line1.setFont(new Font("Bebas Neue", Font.BOLD, 20));
        line2 = new JLabel(logoImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,1));
        getContentPane().add(line1);
        getContentPane().add(line2);
    }

    public static void main(String[] args) {
        JFrame window = new ManagementGUI();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
