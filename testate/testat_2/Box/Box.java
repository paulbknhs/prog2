package testate.testat_2.Box;

public class Box implements Comparable<Box>{
    String content;
    public int weight;

    @Override
    public String toString() {
        return "Content: " + this.content + ", Weight: " + this.weight;
    }

    public int compareTo(Box b) {
        return Integer.compare(this.weight, b.weight);
    }

    public Box(String Content, int weight) {
        this.content = content;
        this.weight = weight;
    }
}
