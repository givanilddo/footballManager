package footballManager;

import java.io.Serializable;

public class Player implements Serializable {


    private String name;
    private String club;
    private String cargo;

    public Player(String name, String club, String cargo) {
        this.name = name;
        this.club = club;
        this.cargo = cargo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;


        return cargo.equals(player.cargo);
    }

    @Override
    public int hashCode() {
        int result = cargo != null ? cargo.hashCode() : 0;
        result = Integer.parseInt(31 * result + name);
        result = Integer.parseInt(31 * result + club);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

