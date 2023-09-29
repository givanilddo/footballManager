package FB;

import java.io.Serializable;

public class Jogador implements Serializable {
    private String nome;
    private String clube;
    private String cargo;

    public Jogador(String nome, String clube, String cargo) {
        this.nome = nome;
        this.clube = clube;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getClube() {
        return clube;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Clube: " + clube + ", Cargo: " + cargo;
    }
}
