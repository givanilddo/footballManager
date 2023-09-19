package NeoFootballManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ManagementPerson implements Interface {
    private Map<String, Player> players;
    private dataRecorder recorder = new dataRecorder();

    public ManagementPerson(){
        this.players = new HashMap<>();
        dataRetriver();
    }

    public void saveData(){
        try {
            this.recorder.saveData(this.players);
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }

    public void dataRetriver(){
        try {
            this.players = this.recorder.playerRetriver();
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    @Override
    public boolean addPlayer(String nome, String clube, String cargo) {
        if (!players.containsKey(nome)){
            this.players.put(nome, new Player(nome, clube, cargo));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Collection<Player> searchPlayers(String clube, String cargo) {
        Collection<Player> foundPlayers = new ArrayList<>();
        for (Player c: this.players.values()){
            if (c.getClube()==clube && c.getCargo()==cargo){
                foundPlayers.add(c);
            }
        }
        return foundPlayers;
    }

    @Override
    public boolean removePlayer(String nome) {
        if (this.players.containsKey(nome)){
            this.players.remove(nome);
            return true;
        } else{
            return false;
        }
    }
}

