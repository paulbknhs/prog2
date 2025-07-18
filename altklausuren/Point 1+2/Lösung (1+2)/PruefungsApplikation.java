import java.util.*;

public class PruefungsApplikation {
	
	public static List<Point> sortiere1(List<Point> list){		//sorts the list with the minimumsort algorithm with comparator isMoreEastMoreNorth() (ascending)
		
		for(int i = 0; i < list.size() - 1; i++){						//iterate through the list
			Point min = list.get(i);
			int minpos = i;
			for(int j = i + 1; j < list.size(); j++){						//find the min-element of the restlist
				if(!(list.get(j).isMoreEastMoreNorth(min))){	
					min = list.get(j);
					minpos = j;
				}
			}
			if (minpos != i) {									//if a min-element of the restlist (other than the first element) is found:
				list.set(minpos, list.get(i));					//perform a swap-operation: put the min-element in front of the restlist
				list.set(i, min);
			}
		}
		return list;
	}
	
	public static List<Point> sortiere2(List<Point> list){		//sorts the list with the bubblesort algorithm with comparator manhattanDistanceFromZero (ascending)
		for(int i = 0; i < list.size() - 1; i++){						//iterate through the list
			for(int j = 0; j < list.size() - 1; j++){
				if (list.get(j).manhattanDistanceFromZero() > list.get(j+1).manhattanDistanceFromZero()){ //if the current point has a bigger manhattandistance than the following, swap them
					Point tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) {

		List<Point> list = new ArrayList<Point>();  //fill a list "list" with 25 randomly generated points
		for(int i = 0; i < 25; i++){
			Random r = new Random();

			int x = r.nextInt((10 - -10) + 1) - 10;			//random numbers ranging from -10 to 10
			int y = r.nextInt((10 - -10) + 1) - 10;
			
			Point point = new Point(x, y);		//create and add the points to the list
			list.add(i, point);
		}
		
		System.out.println("unsortiert:");					//unsorted list
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
		
		list = sortiere1(list);								//sort the list
		
		System.out.println("\nSortiert nach isMoreEastMoreNorth:");					//sorted list with isMoreEastMoreNorth
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
		
		list = sortiere2(list);								//sort the list
		
		System.out.println("\nSortiert nach Manhattan-Distanz:");					//sorted list with manhattanDistanceFromZero
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
	}
}