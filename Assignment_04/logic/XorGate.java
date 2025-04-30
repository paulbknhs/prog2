package logic;

public class XorGate extends Gate{
    AndGate and;
    OrGate or;
    NotGate not;

    public XorGate() {
        super("^");
        this.and  = new AndGate();
        this.or  = new OrGate();
        this.not  = new NotGate();
    }

    @Override
    public boolean evaluate(boolean a, boolean b) {      
        return (and.evaluate(or.evaluate(a, b), not.evaluate(and.evaluate(a, b), b)));
    }
    
}
