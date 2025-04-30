package calculate;
import logic.*;

public class HalfAdder {
    Gate[] gates;

    public HalfAdder() {
        this.gates = new Gate[]{new XorGate(), new AndGate()};
    }

    public boolean[] add(boolean a, boolean b) {
        boolean c = gates[1].evaluate(a, b);
        boolean s = gates[0].evaluate(a, b);
        return new boolean[]{s, c};
    }

    public void info() {
        for (Gate gate : this.gates) {
            gate.table();
        }
    }
}
