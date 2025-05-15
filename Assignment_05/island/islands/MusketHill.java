package island.islands;

import island.Action;
import island.State;

public class MusketHill implements State {
    public State transition(Action action) {
        switch (action.str()) {
            case "A": return new PiratesIsland();
            case "B": return new MutineersIsland();
            default: return null;
        }
    }

    public String str() {
        return "Musket Hill";
    }

    public String info() {
        return "A: " + transition(Action.A).str() + "; B: " + transition(Action.B).str();
    }
}
