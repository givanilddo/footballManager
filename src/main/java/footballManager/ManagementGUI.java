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
        setResizable(true);
        getContentPane().setBackground(Color.DARK_GRAY);

        line1 = new JLabel("FOOTBALL MANAGER", JLabel.CENTER);
        line1.setForeground(Color.black);
        line1.setFont(new Font("Impact", Font.PLAIN, 35));

        line2 = new JLabel(logoImg, JLabel.CENTER);

        line3 = new JLabel("FOOTBALL MANAGER", JLabel.CENTER);
        line3.setForeground(Color.black);
        line3.setFont(new Font("Impact", Font.PLAIN, 35));

        line3 = new JLabel(logoImg, JLabel.CENTER);

        addButton = new JButton("Adicionar", add);
        //addButton.addActionListener(new AgendaAddController(agenda, this));
        searchButton = new JButton("Pesquisar", search);
        //searchButton.addActionListener(new AgendaSearchController(agenda, this));
        removeButton = new JButton("Remover", remove);
        //removeButton.addActionListener(new AgendaRemoveController(agenda, this));

        getContentPane().setLayout(new GridLayout(4,4));
        getContentPane().add(line1);
        getContentPane().add(addButton);

        getContentPane().add(line2);
        getContentPane().add(searchButton);

        getContentPane().add(new JLabel());
        getContentPane().add(removeButton);
    }

    public static void main(String[] args) {
        JFrame window = new ManagementGUI();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
