import java.util.*;

public class Applikation {
	public static <T extends Haus> void sort(List<T> list){			//sorts the list with the maxsort algorithm (descending)
		
		for(int i = 0; i < list.size()-1; i++){						//iterate through the list
			T max = list.get(i);
			int maxpos = i;
			for(int j = i + 1; j < list.size(); j++){				//find the max-element of the restlist
				if(list.get(j).compareTo(max) > 0 ){	
					max = list.get(j);
					maxpos = j;
				}
			}
			if (maxpos != i) {										//if a max-element of the restlist (other than the first element) is found:
				list.set(maxpos, list.get(i));						//perform a swap-operation: put the max-element in front of the restlist
				list.set(i, max);
			}
		}
		Collections.reverse(list);									//reverse the list so it's ascending
	}
	
	public static <T extends Haus> void binarySearch(List<T> list, int lowerBound, int upperBound, T compare){ 	// recursive binary-search-algorithm like described in the task
		
		if (lowerBound > upperBound){
			System.out.println("Kein Haus mit einer Hoehe von " + compare.getHoehe() + " m gefunden.");
			return;
		}
		
		int m = (lowerBound + upperBound)/2;
		if (list.get(m).getHoehe() == compare.getHoehe()){
			System.out.print("\nHaus gefunden: ");
			System.out.println(list.get(m).toString());
			return;
		} else if (list.get(m).getHoehe() > compare.getHoehe()){
			binarySearch(list, lowerBound, m-1, compare);
		} else{
			binarySearch(list, m+1,upperBound, compare);
		}
	}
	
	public static void main(String[] args) {

		List<Haus> houses = new ArrayList<Haus>();
		for (int i = 0; i < 10; i++) {							//create a list with 10 random houses
			Random r = new Random();
			int randomheight = r.nextInt((20 - 5) + 1) + 5;		//height ranges from 5 to 20 m
			houses.add(new Haus("Haus Nr." + (i+1), randomheight));
		}

		System.out.println("unsortierte Liste:");				// print out the unsorted list
		for (int i = 0; i < houses.size(); i++) {
			System.out.println(houses.get(i));
		}

		sort(houses);											// sort the list
		
		System.out.println("\nsortierte Liste:");				// print out the sorted list
		for (int i = 0; i < houses.size(); i++) {
			System.out.println(houses.get(i));
		}
		
		while (true){											//search-loop
			
			System.out.println("\nNach welcher Haushoehe soll gesucht werden? (Bitte Ganzzahlen angeben.)");
			System.out.print(">");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			try { 
				Integer.parseInt(input); 
			}  catch (NumberFormatException e){ 
				System.out.println(input + " ist keine valide Zahl."); 
				System.exit(1);
			} 
			int number = Integer.parseInt(input);
			
			Haus compare = new Haus ("", number);
			binarySearch(houses, 0, houses.size(), compare);		//use binarySearch to search for the desired height
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("\nWollen Sie nach noch einer Haushoehe suchen (j/n)?");
				System.out.print(">");
				input = scanner.nextLine();
				if (input.equals("n")){
					System.exit(0);
				} else if (input.equals("j")){
					break;
				}
			}
		}
	}
}



