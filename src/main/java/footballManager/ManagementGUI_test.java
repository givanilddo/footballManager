package footballManager;

import javax.swing.*;
import java.awt.*;

    public class ManagementGUI_test extends JFrame {

        JLabel linha1, linha2;
        ImageIcon logoImg = new ImageIcon("./imgs/logo.png"); //C:\Users\Givanildo\Desktop\projeto futebol manager poo\imgs
        public ManagementGUI_test(){
            setTitle("Agenda de Aniversários");
            setSize(400,400); //tamanho da janela
            setLocation(0, 0);
            setResizable(false);
            getContentPane().setBackground(Color.white);
            linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
            linha1.setForeground(Color.red);
            linha1.setFont(new Font("Serif", Font.BOLD, 24));
            linha2 = new JLabel(logoImg, JLabel.CENTER);
            getContentPane().setLayout(new GridLayout(3,1));
            getContentPane().add(linha1);
            getContentPane().add(linha2);
        }
        //...
        public static void main(String [] args){
            JFrame janela = new ManagementGUI_test();
            janela.setVisible(true);
            janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    }


