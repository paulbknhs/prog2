public class Main {

    public static void main(String[] args) {
        Node current = null;
        for (String arg : args) {
            if (current == null)
                current = new Node(Integer.parseInt(arg));
            else
            current = new Node(Integer.parseInt(arg), current);
        }

        while (current != null) {
            System.out.println(current.getValue());
            System.out.println(current.hashCode());
            System.out.println(current.equals(current.getNext()));
            current = current.getNext();
        }

    }
}