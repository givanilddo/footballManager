package FootballManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class PlayerSearchController implements ActionListener {
    private Interface anInterface;
    private JFrame mainWindow;

    public PlayerSearchController(Interface anInterface, JFrame window) {
        this.anInterface = anInterface;
        this.mainWindow = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clube = JOptionPane.showInputDialog(mainWindow,
                "Qual nome do jogador que quer pesquisar ?");
        String cargo = JOptionPane.showInputDialog(mainWindow,
                "Qual o nome do seu clube ?");

        Collection<Player> players = anInterface.searchPlayers(clube, cargo);

        if (players.equals(players)){
            JOptionPane.showMessageDialog(mainWindow,
                    "Jogadores encontrados:");
            for (Player c: players){
                JOptionPane.showMessageDialog(mainWindow, c.toString());
            }
        } else {
            JOptionPane.showMessageDialog(mainWindow,
                    "Não foi encontrado nenhum jogador");
        }
    }
}