package Player.Ship.Rooms.Base;

/**
 * Created by jnebl on 5/6/2017.
 */
public class Room {
    private boolean large,medium,small;
    public Room(boolean large,boolean medium,boolean small){
        this.large = large;
        this.medium = medium;
        this.small = small;
    }

    public boolean isLarge() {
        return large;
    }

    public boolean isMedium() {
        return medium;
    }

    public boolean isSmall() {
        return small;
    }
}
