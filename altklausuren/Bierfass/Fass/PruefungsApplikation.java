import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class PruefungsApplikation {

    static class DIN {
        public double height, diameter;
        DIN(double height, double diameter){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Fass> faesser = new ArrayList();
        ArrayList<DIN> dinSizes = new ArrayList();
        dinSizes.add(new DIN(600, 381));
        dinSizes.add(new DIN(400, 381));
        dinSizes.add(new DIN(310, 363));
        dinSizes.add(new DIN(532, 408));
        dinSizes.add(new DIN(327, 395));
        dinSizes.add(new DIN(216, 395));
        for (int i = 0; i < 20; i++) {
            int index = (random.nextInt(6));
            Bierfass toAdd = new Bierfass(dinSizes.get(index).height, dinSizes.get(index).diameter, "");
            faesser.add(toAdd);
            System.out.println(toAdd.toString());
        }
        System.out.println("---------------------------------");
        sortiere(faesser);
        for (Fass fass : faesser) {
            System.out.println(fass.toString());
        }
    }

    public static void sortiere (List<Fass> list) {
        ArrayList<Fass> copy = new ArrayList<Fass>(list);
        ArrayList<Fass> sorted = new ArrayList<>();
        while (!copy.isEmpty()) {
            Fass smallest = copy.get(0);
            for (Fass currentFass : copy) {
                if (currentFass.getVolume() < smallest.getVolume()) {
                    smallest = currentFass;
                }
            }
            sorted.add(smallest);
            copy.remove(smallest);
        }
        list.clear();
        list.addAll(sorted);
    }

}