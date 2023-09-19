package FootballManager;


import java.util.Collection;

public interface Interface {

    public boolean addPlayer(String nome, String clube, String cargo);
    public Collection<Player> searchPlayers(String clube, String cargo);
    public boolean removePlayer(String nome);
}
//