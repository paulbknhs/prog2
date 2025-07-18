package island.islands;

import island.Action;
import island.State;

public class DeadMansIsland implements State {
    public State transition(Action action) {
        switch (action.str()) {
            case "A": return new TreasureIsland();
            case "B": return new ShipwreckBay();
            default: return this;
        }
    }

    public String str() {
        return "Dead Man's Island";
    }

    public String info() {
        return "A: " + transition(Action.A).str() + "; B: " + transition(Action.B).str();
    }
}
