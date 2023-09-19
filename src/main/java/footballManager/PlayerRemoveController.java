package footballManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayerRemoveController implements ActionListener {

    private final Player player;
    private JFrame mainWindow;

    public PlayerRemoveController(Player player, JFrame window) {
        this.player = player;
        this.mainWindow = window;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(mainWindow,
                "Qual nome do jogador que quer remover");
        boolean removeu = player.removePlayer(name);
        if (removeu) {
            JOptionPane.showMessageDialog(mainWindow,
                    "jogador removido com sucesso");
        } else {
            JOptionPane.showMessageDialog(mainWindow,
                    "Jogador não encontrado " +
                            "Operação não realizada");
        }
    }
}
