import java.util.ArrayList;
import java.util.Scanner;

class Applikation{
    public static <T extends Point> ArrayList<T> sortPoints(ArrayList<T> list){
        for(boolean changed = true; changed; ){
            changed = false;
            for(int i = 0; i < list.size() - 1; i++){
                if(list.get(i).compareTo(list.get(i+1)) > 0){
                    T point = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, point);
                    changed = true;
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<MPoint> list = new ArrayList<>();

        System.out.println("Neuer Punkt x y :");
        for(String input = scan.nextLine(); !input.equals("E"); input = scan.nextLine()){
            MPoint mPoint = new MPoint(Integer.valueOf(input), Integer.valueOf(scan.nextLine()));
            list.add(mPoint);

            System.out.println("Neuer Punkt x y :");
        }

        System.out.println("\nEingebene Punkte:");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        list = sortPoints(list);

        System.out.println("\nSortierte Punkte:");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

interface Point extends Comparable<Point>{
    public int getX();
    public int getY();

    public void setX(int x);
    public void setY(int y);

    public double getDistance();

    public int compareTo(Point point);
}

class MPoint implements Point{
    private int x;
    private int y;

    public int getX(){return x;}
    public int getY(){return y;}

    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}

    public MPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(){
        return Math.abs(x) + Math.abs(y);
    }

    @Override
    public String toString(){
        return "Punkt: ( " + x + " ; " + y + " ) Dist: " + getDistance();
    }

    @Override
    public int compareTo(Point point){
        return (int) (getDistance() - point.getDistance());
    }
}
