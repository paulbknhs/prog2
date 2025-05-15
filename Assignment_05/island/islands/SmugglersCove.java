package island.islands;

import island.Action;
import island.State;

public class SmugglersCove implements State {
    public State transition(Action action) {
        switch (action.str()) {
            case "A": return new TreasureIsland();
            default: return null;
        }
    }

    public String str() {
        return "Smugglers' Cove";
    }

    public String info() {
        return "A: " + transition(Action.A).str() + "; B: -";
    }
}
