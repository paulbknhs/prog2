import java.util.*;

public class PruefungsApplikation {
	
	public static void sortiere(List<Motorrad> list){		//sorts the list with the maxsort algorithm (descending)
		
		for(int i = 0; i < 6; i++){									//iterate through the list
			Motorrad max = list.get(i);
			int maxpos = i;
			for(int j = i + 1; j < 7; j++){							//find the max-element of the restlist
				if(list.get(j).getLeistung() > max.getLeistung()){	
					max = list.get(j);
					maxpos = j;
				}
			}
			if (maxpos != i) {									//if a max-element of the restlist (other than the first element) is found:
				list.set(maxpos, list.get(i));					//perform a swap-operation: put the max-element in front of the restlist
				list.set(i, max);
			}
		}
	}
	
	public static void main(String[] args) {

		List<Motorrad> list = new ArrayList<Motorrad>();  //fill a list "list" with 7 randomly generated bikes"
		for(int i = 0; i < 7; i++){
			Random r = new Random();
			double leistung = 10 + (r.nextDouble() * (200 - 10));
			
			int gewicht = r.nextInt((300 - 100) + 1) + 100;
			
			Motorrad bike = new Motorrad(leistung, gewicht, null);
			list.add(i, bike);
		}
		
		list.get(0).setTypname("Pegassi Vortex");			// set the names of the bikes
		list.get(1).setTypname("Nagasaki Chimera");
		list.get(2).setTypname("Nagasaki Shotaro");
		list.get(3).setTypname("Maibatsu Sanchez");
		list.get(4).setTypname("Pegassi Oppressor");
		list.get(5).setTypname("Hakuchou Drag");
		list.get(6).setTypname("Principe Lectro");
		
		System.out.println("unsortiert:");					//unsorted list
		for(int i = 0; i < 7; i++){
			System.out.println(list.get(i).toString());
		}
		
		sortiere(list);										//sort the list
		Collections.reverse(list);							//reverse the list so its ascending
		
		System.out.println("\nsortiert:");					//sorted list
		for(int i = 0; i < 7; i++){
			System.out.println(list.get(i).toString());
		}
	}
}