public class Smurf implements TwoLegged {
    String name;

    public Smurf(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}