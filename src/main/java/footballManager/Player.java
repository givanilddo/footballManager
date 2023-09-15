package footballManager;

import java.io.Serializable;
import java.util.Objects;

public class Player implements Serializable {

    private String name;
    private String club;
    private int goals;

    public Player(String name, String club, int goals){
        this.name = name;
        this.club = club;
        this.goals = goals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (goals != player.goals) return false;
        if (!Objects.equals(name, player.name)) return false;
        return Objects.equals(club, player.club);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (club != null ? club.hashCode() : 0);
        result = 31 * result + goals;
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

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
