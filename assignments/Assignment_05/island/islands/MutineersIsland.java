package island.islands;

import island.Action;
import island.State;

public class MutineersIsland implements State {
    public State transition(Action action) {
        switch (action.str()) {
            case "A": return new SmugglersCove();
            case "B": return new MusketHill();
            default: return this;
        }
    }

    public String str() {
        return "Mutineers' Island";
    }

    public String info() {
        return "A: " + transition(Action.A).str() + "; B: " + transition(Action.B).str();
    }
}
