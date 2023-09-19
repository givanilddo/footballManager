package footballManager;

import java.util.Collection;

public interface PlayerInterface {

    public boolean addPlayer(String name, String club, String cargo);
    public Collection<Player> searchPlayers(String name, String club);
    public boolean removePlayer(String name);


}
