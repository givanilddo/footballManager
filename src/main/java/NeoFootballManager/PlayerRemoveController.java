package NeoFootballManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PlayerRemoveController implements ActionListener {
    private Interface anInterface;
    private JFrame mainWindow;
    public PlayerRemoveController(Interface anInterface, JFrame window) {
        this.anInterface = anInterface;
        this.mainWindow = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(mainWindow,
                "Qual nome do jogador que quer remover");
        boolean removed = anInterface.removePlayer(nome);
        if (removed){
            JOptionPane.showMessageDialog(mainWindow,
                    "jogador removido com sucesso");
        } else {
            JOptionPane.showMessageDialog(mainWindow,
                    "Jogador não encontrado " +
                            "Operação não realizada");
        }
    }
}