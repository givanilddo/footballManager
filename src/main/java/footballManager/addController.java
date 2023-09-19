package footballManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class addController implements ActionListener{

    private Player player;
    private JFrame mainWindow;

    public addController(Player player, JFrame window){
        this.player = player;
        this.mainWindow = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = JOptionPane.showInputDialog(mainWindow,
                "Qual nome do jogador ? ");
        String club = JOptionPane.showInputDialog(mainWindow,
                "Qual seu clube ? ");
        String cargo = JOptionPane.showInputDialog(mainWindow,
                "Qual seu cargo no clube ? ");

        boolean registered = player.addPlayer(name, club, cargo);

        if(registered){
            JOptionPane.showMessageDialog(mainWindow,
                    "Jogador adicionado.");
        }else{
            JOptionPane.showMessageDialog(mainWindow,
                    "Jogador NÃO adicionado." +
                             "verifique se já não existe");

        }
    }


}
