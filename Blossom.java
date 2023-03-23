import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import java.awt.Color;

/**
 * A <code>Flower</code> is an actor that darkens over time. Some actors drop
 * flowers as they move. <br />
 * The API of this class is testable on the AP CS A and AB exams.
 */

public class Blossom extends Flower
{
    private static final Color DEFAULT_COLOR = Color.GREEN;
    private static final double DARKENING_FACTOR = 0.1;
    private int acts;
    private int life = 10;

    /** Constructs a green flower. */
    public Blossom()
    {
        setColor(DEFAULT_COLOR);
        acts = 0;
        life = 10;
    }
    
    public Blossom(int lifeIn)
    {
		this();
		life = lifeIn;
	}

    /** Causes the color of this flower to darken.*/
    public void act()
    {
        Color col = getColor();
        int red = (int)(col.getRed()*(1-DARKENING_FACTOR));
        int green = (int)(col.getGreen()*(1-DARKENING_FACTOR));
        int blue = (int)(col.getBlue()*(1-DARKENING_FACTOR));
		setColor(new Color(red,green,blue));
        acts++;
        
        if (acts>=life)
			removeSelfFromGrid();
    }
}
