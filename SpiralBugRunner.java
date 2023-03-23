import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class SpiralBugRunner {
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        SpiralBug alice = new SpiralBug(3);
        alice.setColor(Color.ORANGE);
        SpiralBug bob = new SpiralBug(8);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}
