package FootballManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerAddController implements ActionListener {
    private final Interface anInterface;
    private JFrame mainWindow;

    public PlayerAddController(Interface anInterface, JFrame window) {
        this.anInterface = anInterface;
        this.mainWindow = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(mainWindow,
                "Qual nome do jogador ? ");
        String clube = JOptionPane.showInputDialog(mainWindow,
                "Qual seu clube ? ");
        String cargo = (JOptionPane.showInputDialog(mainWindow,
                "Qual seu cargo no clube ? "));

        boolean registered = anInterface.addPlayer(nome, clube, cargo);

        if (registered){
            JOptionPane.showMessageDialog(mainWindow,
                    "Jogador cadastrado");
        } else {
            JOptionPane.showMessageDialog(mainWindow,
                    "Jogador não foi cadastrado. " +
                            "Verifique se já não existia");
        }
    }

}