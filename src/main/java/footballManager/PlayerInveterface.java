package footballManager;

import java.util.Collection;

public interface PlayerInveterface {

    public boolean addPlayer(String name, String club, int goals);

    Collection<Player> searchPlayers(String name, String club);

    public boolean removePlayer(String name);

}
