package NeoFootballManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class PlayerSearchController implements ActionListener {
    private Interface anInterface;
    private JFrame janelaPrincipal;

    public PlayerSearchController(Interface anInterface, JFrame janela) {
        this.anInterface = anInterface;
        this.janelaPrincipal = janela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String clube = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual nome do jogador que quer pesquisar ?");
        String cargo = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do seu clube ?");

        Collection<Player> jogadores = anInterface.searchPlayers(clube, cargo);

        if (jogadores.size()>0){
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Jogadores encontrados:");
            for (Player c: jogadores){
                JOptionPane.showMessageDialog(janelaPrincipal, c.toString());
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Não foi encontrado nenhum jogador");
        }
    }
}