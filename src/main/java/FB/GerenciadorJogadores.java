package FB;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorJogadores {
    private List<Jogador> jogadores;
    private final String arquivoDados = "jogadores.dat";

    public GerenciadorJogadores() {
        jogadores = carregarDados();
    }

    public void adicionarJogador(String nome, String clube, String cargo) {
        for (Jogador jogador : jogadores) {
            if (jogador.getNome().equalsIgnoreCase(nome) && jogador.getClube().equalsIgnoreCase(clube)) {
                JOptionPane.showMessageDialog(null, "Jogador já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        Jogador jogador = new Jogador(nome, clube, cargo);
        jogadores.add(jogador);
        JOptionPane.showMessageDialog(null, "Jogador adicionado com sucesso");
        salvarDados(jogadores);
    }

    public List<Jogador> buscarJogadores(String nome, String clube) {
        List<Jogador> resultados = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            if ((nome.isEmpty() || jogador.getNome().equalsIgnoreCase(nome)) &&
                    (clube.isEmpty() || jogador.getClube().equalsIgnoreCase(clube))) {
                resultados.add(jogador);
            }
        }
        JOptionPane.showMessageDialog(null,"Foram encontrados os jogadores abaixo: ");
        return resultados;
    }

    public void excluirJogadores(String nome, String clube) {
        jogadores.removeIf(jogador -> jogador.getNome().equalsIgnoreCase(nome) && jogador.getClube().equalsIgnoreCase(clube));
        JOptionPane.showMessageDialog(null,"Jogador removido com sucesso");
        salvarDados(jogadores);
    }

    private List<Jogador> carregarDados() {
        List<Jogador> dados = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivoDados))) {
            dados = (List<Jogador>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nenhum dado existente encontrado. Inicializando uma nova lista.");
        }
        return dados;
    }

    private void salvarDados(List<Jogador> dados) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivoDados))) {
            outputStream.writeObject(dados);
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }
}

