package footballManager;

import javax.swing.*;

import static java.awt.SystemColor.window;

public class ManagementGUI_Runnable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame janela = new ManagementGUI();
                window.setVisible(true);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
    }
}
