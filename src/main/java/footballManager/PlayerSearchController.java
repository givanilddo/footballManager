package footballManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class PlayerSearchController implements ActionListener {

    private Player player;
    private JFrame mainWindow;

    public PlayerSearchController(Player player, JFrame window){
        this.player = player;
        this.mainWindow = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = JOptionPane.showInputDialog(mainWindow,
                "Qual nome do jogador que quer pesquisar ?");
        String club = JOptionPane.showInputDialog(mainWindow,
                "Qual o nome do seu clube ?");
        String cargo = JOptionPane.showInputDialog(mainWindow,
                "Qual o Cargo dele ?");

        Collection<Player> jogadores = player.searchController(name, club);
        if (jogadores.size()>0){
            JOptionPane.showInputDialog(mainWindow,
                    "Jogadores encontrados:");
            for (Player c: jogadores){
                JOptionPane.showMessageDialog(mainWindow, c.toString());
            }
        } else {
            JOptionPane.showMessageDialog(mainWindow,
                    "Não foi encontrado nenhum jogador");
        }
    }
}
