public class Human implements TwoLegged {
    String name;

    public Human(String name) {
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