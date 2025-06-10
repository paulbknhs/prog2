import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Box> boxlist = new ArrayList<>();
        Random rand = new Random();
        for (Integer i = 0; i < 5; i++) {
            boxlist.add(new Box(i.toString(), rand.nextInt()));
        }
        System.out.println(boxlist);
    }
}
