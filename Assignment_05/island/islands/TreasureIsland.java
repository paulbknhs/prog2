package island.islands;

import island.Action;
import island.State;

public class TreasureIsland implements State {
    public State transition(Action action) {
        return this;
    }

    public String str() {
        return "Treasure Island";
    }

    public String info() {
        return "A: -; B: -";
    }
}
