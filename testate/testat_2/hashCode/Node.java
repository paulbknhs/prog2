public class Node {

    private int value;
    private Node nextNode;

    public Node(int value, Node next) {
        this.value = value;
        this.nextNode = next;
    }
    public Node(int value) {
        this.value = value;
    }
    public Node getNext() {
        return this.nextNode;
    }
    public int getValue() {
        return this.value;
    }
    @Override
    public int hashCode() {
        return this.value % 255;
    }
    @Override
    public boolean equals(Object o) {
        try {
            Node n = (Node) o;
            return (this.value == n.getValue());
        } catch (Exception e) {
            return false;
        }
    }
}