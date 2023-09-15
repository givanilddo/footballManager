package footballManager;

import java.io.IOException;
import java.util.*;

public class ManagementPerson implements PlayerInveterface {
    private Map<String, Player> players;
    private dataRecorder recorder = new dataRecorder();

    @Override
    public Collection<Player> searchPlayers(String name, String club) {
        return null;
    }

    public ManagementPerson() {
        this.players = new HashMap<>();
        dataRetriver();
    }

    public void saveData() {
        try {
            this.recorder.saveData(this.players);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void dataRetriver() {
        try {
            this.players = this.recorder.playerRetriver();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean addPlayer(String name, String club, int goals) {
        if (!players.containsKey(name)) {
            this.players.put(name, new Player(name, club, goals));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removePlayer(String name) {
        if (this.players.containsKey(name)) {
            this.players.remove(name);
            return true;
        } else {
            return false;
        }
    }

}
