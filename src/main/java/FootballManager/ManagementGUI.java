package FootballManager;

import javax.swing.*;
import java.awt.*;

public class ManagementGUI extends JFrame{
    JLabel line1, line2, line3;
    ImageIcon logoImg = new ImageIcon("./imgs/logo.png"); //C:\Users\Givanildo\Desktop\projeto futebol manager poo\imgs
    ImageIcon addImg = new ImageIcon("./imgs/icons/add.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove.png");
    ImageIcon searchImg = new ImageIcon("./imgs/icons/search.png");
    ImageIcon textImg = new ImageIcon("./imgs/texto.png");
    JButton addButton, removeButton, searchButton;
    Interface anInterface = new ManagementPerson();

    public ManagementGUI() {

        setTitle("Football Manager");
        setName("FOOTBALL \n MANAGER");
        setSize(885,600);
        setLocation(700, 300);
        setResizable(false);

        //background color
        Color color = new Color(115,115,115);
        Color color2 = new Color(244,232,60);
        getContentPane().setBackground(color);



        line1 = new JLabel(logoImg, JLabel.CENTER);

        line2 = new JLabel(textImg, JLabel.CENTER);

        line3 = new JLabel("POO - 2023", JLabel.CENTER);
        line3.setForeground(color2);
        line3.setFont(new Font("Impact", Font.PLAIN, 25));


        addButton = new JButton("Adicionar", addImg);
        addButton.addActionListener(new PlayerAddController(anInterface, this));

        searchButton = new JButton("Pesquisar", searchImg);
        searchButton.addActionListener(new PlayerSearchController(anInterface, this));

        removeButton = new JButton("Remover", removeImg);
        removeButton.addActionListener(new PlayerRemoveController(anInterface, this));


        getContentPane().setLayout(new GridLayout(3,3, 5, 5));

        //line1
        getContentPane().add(line1);
        getContentPane().add(addButton);
        //line2
        getContentPane().add(line2);
        getContentPane().add(searchButton);
        //line3
        getContentPane().add(line3);
        getContentPane().add(removeButton);

    }
    //Main
    public static void main(String[] args) {

        JFrame window = new ManagementGUI();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
////