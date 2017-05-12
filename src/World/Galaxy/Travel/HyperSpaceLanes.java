package World.Galaxy.Travel;

import World.Galaxy.Stars.Stars.Stars;

/**
 * Created by jnebl on 5/12/2017.
 */
public class HyperSpaceLanes {
    private Stars destination;
    public HyperSpaceLanes(Stars destination){
        this.destination = destination;
    }

    public Stars getDestination() {
        return destination;
    }
}
