package island.islands;

import island.Action;
import island.State;

public class PiratesIsland implements State {
    public State transition(Action action) {
        switch (action.str()) {
            case "A": return new ShipwreckBay();
            case "B": return new MusketHill();
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
