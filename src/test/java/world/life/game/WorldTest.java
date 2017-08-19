package world.life.game;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by prashu on 19/8/17.
 */
public class WorldTest {
    @Test
    public void demoFunction(){
        assertEquals("","");
    }

    World w = new World();

    @Test
    public void testLiveCell(){

    }

    @Test
    public void initializeWorld(){
        World w = new World();
        assertEquals(w.getWorld().length,3);
    }

    @Test
    public void deadCellTest(){
        World w = new World();
        Cell c1 = new Cell(CellStates.LIVE.name());
        Cell c2 = new Cell(CellStates.LIVE.name());
        Cell c3 = new Cell(CellStates.LIVE.name());
        w.getWorld()[0][0] = c1;
        w.getWorld()[0][1] = c2;
        w.getWorld()[0][2] = c3;
        //transformToNextGeneration(w);
        System.out.println(w.getWorld().toString());
        assertEquals(w.isDeadCell(0,0),true);
        assertEquals(w.isDeadCell(0,2),true);
    }


}
