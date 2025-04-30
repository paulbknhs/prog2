package logic;

public class AndGate extends Gate{

    public AndGate() {
        super("&");
    }

    @Override
    public boolean evaluate(boolean a, boolean b) {
        return (a == true && b == true);
    }
    
}
