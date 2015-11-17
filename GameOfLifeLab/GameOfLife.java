import info.gridworld.actor.Rock;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 15;
    private final int COLS = 15;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the Actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all Actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X11 = 6, Y11 = 6;
        final int X12 = 7, Y12 = 6;
        final int X13 = 8, Y13 = 6;
        final int X21 = 6, Y21 = 7;
        final int X22 = 7, Y22 = 7;
        final int X23 = 8, Y23 = 7;
        final int X31 = 6, Y31 = 8;
        final int X32 = 7, Y32 = 8;
        final int X33 = 8, Y33 = 8;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains Actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add Actors (a type of Actor) to the three intial locations
        Rock rock11 = new Rock();
        Location loc11 = new Location(Y11, X11);
        grid.put(loc11, rock11);

        Rock rock12 = new Rock();
        Location loc12 = new Location(Y12, X12);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(Y13, X13);
        grid.put(loc13, rock13);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(Y21, X21);
        grid.put(loc21, rock21);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(Y22, X22);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(Y23, X23);
        grid.put(loc23, rock23);
        
        Rock rock31 = new Rock();
        Location loc31 = new Location(Y31, X31);
        grid.put(loc31, rock31);
        
        Rock rock32 = new Rock();
        Location loc32 = new Location(Y32, X32);
        grid.put(loc32, rock32);
        
        Rock rock33 = new Rock();
        Location loc33 = new Location(Y33, X33);
        grid.put(loc33, rock33);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        ArrayList<Location> alive = new ArrayList<Location>();
        ArrayList<Location> dead = new ArrayList<Location>();
        
        for (int rowNum = 0; rowNum < ROWS; rowNum++)
        {
            for (int colNum = 0; colNum < COLS; colNum++)
            {   
                Location loc = new Location(rowNum, colNum);
                
                if (grid.get(loc) != null)
                {
                    ArrayList<Actor> numLive = grid.getNeighbors(loc);
                    int neighborLive = numLive.size();
                    if (neighborLive == 2 || neighborLive == 3)
                    {
                        alive.add(loc);
                    }
                    else
                    {
                        dead.add(loc);
                    }
                }
                if (grid.get(loc) == null)
                {
                    ArrayList<Actor> numLive = grid.getNeighbors(loc);
                    int neighborLive = numLive.size();
                    if (neighborLive == 3)
                    {
                        alive.add(loc);
                    }
                    else
                    {
                        dead.add(loc);
                    }
                }
            }
        }
        
        for (Location removePlace : dead)
        {
            grid.remove(removePlace);
        }
        for (Location newPlace : alive)
        {
            Rock rock = new Rock();
            grid.put(newPlace, rock);
        }
        world.setGrid(grid);
        world.show();
    }
    
    /**
     * Returns the Actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the Actor to return
     * @param   col the column (zero-based index) of the Actor to return
     * @pre     the grid has been created
     * @return  the Actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor Actor = world.getGrid().get(loc);
        return Actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) 
        throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        for (int i = 0; i < 3; i++)
        {
            game.createNextGeneration();
            Thread.sleep(1000);
        }
    }

}
