package world.life.game;

/**
 * Created by prashu on 19/8/17.
 */
public class World {

    private Object[][] world = new Object[3][3];

    public Object[][] getWorld() {
        return world;
    }

    public void setWorld(Object[][] world) {
        this.world = world;
    }

    public boolean isDeadCell(int row, int column){
        Cell c = (Cell) world[row][column];
        return c.getState().equals(CellStates.DEAD.name());
    }

    public boolean isLiveCell(int row, int column){
        Cell c = (Cell) world[row][column];
        return c.getState().equals(CellStates.LIVE.name());
    }

    public boolean isReproduceCell(int row, int column){
        Cell c = (Cell) world[row][column];
        return c.getState().equals(CellStates.REPRODUCE.name());
    }

    public World transformToNextGeneration(World world){
        //Rules
        return world;
    }



}
