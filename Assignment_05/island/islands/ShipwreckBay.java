package island.islands;

import island.Action;
import island.State;

public class ShipwreckBay implements State {
    public State transition(Action action) {
        switch (action.str()) {
            case "A": return new MusketHill();
            case "B": return new DeadMansIsland();
            default: return null;
        }
    }

    public String str() {
        return "Pirates' Island";
    }

    public String info() {
        return "A: " + transition(Action.A).str() + "; B: " + transition(Action.B).str();
    }
}
