package footballManager;

import java.awt.GridLayout;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class ManagementGUI extends JFrame {
    JLabel line1, line2, line3;

    //Adicionando Imagens
    ImageIcon logoImg = new ImageIcon("./imgs/logo.png"); //C:\Users\Givanildo\Desktop\projeto futebol manager poo\imgs
    ImageIcon addImg = new ImageIcon("./imgs/icons/add.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove.png");
    ImageIcon searchImg = new ImageIcon("./imgs/icons/search.png");
    ImageIcon textImg = new ImageIcon("./imgs/texto.png");

    JButton addButton, removeButton, searchButton;



    public ManagementGUI() {



        setName("FOOTBALL \n MANAGER");
        setSize(885,600); //tamanho da janela
        setLocation(700, 300);
        setResizable(false);
        getContentPane().setBackground(Color.DARK_GRAY);

        line1 = new JLabel(logoImg, JLabel.CENTER);


        line2 = new JLabel(textImg, JLabel.CENTER);
        line2.setForeground(Color.WHITE);
        line2.setFont(new Font("Arial", Font.PLAIN, 15));

        //line2 = new JLabel("alem de pesquisar e remover de seus respectivos times", JLabel.CENTER);
        //line2.setForeground(Color.WHITE);
        //line2.setFont(new Font("Arial", Font.PLAIN, 10));

        line3 = new JLabel("GIL", JLabel.CENTER);
        line3.setForeground(Color.WHITE);
        line3.setFont(new Font("Impact", Font.PLAIN, 25));


        addButton = new JButton("Adicionar", addImg);
        //addButton.addActionListener(new AgendaAddController(agenda, this));

        searchButton = new JButton("Pesquisar", searchImg);
        //searchButton.addActionListener(new AgendaSearchController(agenda, this));

        removeButton = new JButton("Remover", removeImg);
        //removeButton.addActionListener(new AgendaRemoveController(agenda, this));


        getContentPane().setLayout(new GridLayout(3,4, 5, 5));

        getContentPane().add(line1);
        getContentPane().add(addButton);

        getContentPane().add(line2);
        getContentPane().add(searchButton);

        getContentPane().add(line3);
        getContentPane().add(removeButton);



    }

    public static void main(String[] args) {
        JFrame window = new ManagementGUI();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}