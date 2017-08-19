package world.life.game;

/**
 * Created by prashu on 19/8/17.
 */
public enum CellStates {

        DEAD(0),LIVE(1),REPRODUCE(2);

        private int state;

        CellStates(int state) {
            this.state = state;
        }

        public int getState(){
            return this.state;
        }

}
