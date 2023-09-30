package FB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FootballManagerGUI {
    private JFrame frame;
    private JTextField nomeField;
    private JTextField clubeField;
    private JTextField cargoField;
    private JTextArea resultadoArea;
    private GerenciadorJogadores gerenciador;

    //imagens
    ImageIcon logoImg = new ImageIcon("./imgs/logo.png");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove.png");
    ImageIcon searchImg = new ImageIcon("./imgs/icons/search.png");
    ImageIcon textImg = new ImageIcon("./imgs/texto.png");


    public FootballManagerGUI() {

        gerenciador = new GerenciadorJogadores();

        frame = new JFrame("FOOTBALL MANAGER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setLocation(700, 300);
        frame.setResizable(false);

        Color color = new Color(177,177,177);
        Color color2 = new Color(115,115,115);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(new JLabel(new ImageIcon("./imgs/logo.png")));
        mainPanel.add(topPanel, BorderLayout.NORTH);

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3, 7, 7, 7));
        panel.setBackground(color2);

        //texto area
        JLabel nomeLabel = new JLabel("     Nome:");
        nomeLabel.setBackground(color2);
        nomeLabel.setOpaque(true);
        nomeField = new JTextField();

        JLabel clubeLabel = new JLabel("     Clube:");
        clubeLabel.setBackground(color2);
        clubeLabel.setOpaque(true);
        clubeField = new JTextField();

        JLabel cargoLabel = new JLabel("     Cargo:");
        cargoLabel.setBackground(color2);
        cargoLabel.setOpaque(true);
        cargoField = new JTextField();

        //Botões
        JButton adicionarButton = new JButton("Adicionar", addImg);
        adicionarButton.setBackground(Color.white);
        adicionarButton.setOpaque(true);
        adicionarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String clube = clubeField.getText();
                String cargo = cargoField.getText();
                gerenciador.adicionarJogador(nome, clube, cargo);
                limparCampos();
                atualizarResultado();
            }
        });
        JButton buscarButton = new JButton("Buscar", searchImg);
        buscarButton.setBackground(Color.white);
        buscarButton.setOpaque(true);
        buscarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String clube = clubeField.getText();
                List<Jogador> resultados = gerenciador.buscarJogadores(nome, clube);
                exibirResultado(resultados);
            }
        });
        JButton excluirButton = new JButton("Excluir",removeImg);
        excluirButton.setBackground(Color.white);
        excluirButton.setOpaque(true);
        excluirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String clube = clubeField.getText();
                gerenciador.excluirJogadores(nome, clube);
                limparCampos();
                atualizarResultado();
            }
        });

        //Resultado Area
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(adicionarButton);

        panel.add(clubeLabel);
        panel.add(clubeField);
        panel.add(buscarButton);

        panel.add(cargoLabel);
        panel.add(cargoField);
        panel.add(excluirButton);

        mainPanel.add(panel, BorderLayout.CENTER);
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        resultadoArea.setRows(20);
        resultadoArea.setColumns(40);
        resultadoArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        resultadoArea.setBackground(color);

        mainPanel.add(new JScrollPane(resultadoArea), BorderLayout.SOUTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void limparCampos() {
        nomeField.setText("");
        clubeField.setText("");
        cargoField.setText("");
    }

    private void atualizarResultado() {
        resultadoArea.setText("");
    }

    private void exibirResultado(List<Jogador> jogadores) {
        resultadoArea.setText("");
        for (Jogador jogador : jogadores) {
            resultadoArea.append(jogador.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FootballManagerGUI();
            }
        }
        );
    }
}
