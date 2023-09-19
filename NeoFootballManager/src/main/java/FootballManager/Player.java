package FootballManager;


import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {
    private String nome;
    private String clube;
    private String cargo;
    public Player(String nome, String dia, String mes){
        this.nome = nome;
        this.clube = clube;
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (!Objects.equals(nome, player.nome)) return false;
        if (!Objects.equals(clube, player.clube)) return false;
        return Objects.equals(cargo, player.cargo);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (clube != null ? clube.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
