package footballManager;

import java.util.Collection;

public interface PlayerInveterface {

    public boolean addPlayer(String name, String club, String cargo);

    Collection<Player> searchPlayers(String name, String club);

    public boolean removePlayer(String name);


}
