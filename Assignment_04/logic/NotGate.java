package logic;

public class NotGate extends Gate{

    public NotGate() {
        super("!");
    }

    @Override
    public boolean evaluate(boolean a, boolean b) {
        return !a;
    }

}
