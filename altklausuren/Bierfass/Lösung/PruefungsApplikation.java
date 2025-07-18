import java.util.*;

public class PruefungsApplikation {
	
	public static List<Bierfass> sortiere(List<Bierfass> list){		//sorts the list with the minsort algorithm (ascending)
		
		for(int i = 0; i < list.size() - 1; i++){						//iterate through the list
			Bierfass min = list.get(i);
			int minpos = i;
			for(int j = i + 1; j < list.size(); j++){						//find the min-element of the restlist
				if(list.get(j).getVolume() < min.getVolume()){	
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
	
	public static void main(String[] args) {

		List<Bierfass> list = new ArrayList<Bierfass>();  //fill a list "list" with 7 randomly generated beerkegs
		for(int i = 0; i < 20; i++){
			Random r = new Random();
			int randnumber = r.nextInt((7 - 1) + 1) + 1;	//random number from 1-7 for the 7 types of kegs
			int height = 0;
			int diameter = 0;
			
			switch(randnumber){						//different cases for different kegsnorms (if I have understood the task correctly)
				case 1:
					height = 600;
					diameter = 381;
					break;
				case 2:
					height = 400;
					diameter = 381;
					break;
				case 3:
					height = 310;
					diameter = 363;
					break;
				case 4:
					height = 532;
					diameter = 408;
					break;
				case 5:
					height = 365;
					diameter = 408;
					break;
				case 6:
					height = 327;
					diameter = 395;
					break;
				case 7:
					height = 216;
					diameter = 395;
					break;
			}
			
			Bierfass fass = new Bierfass(height, diameter);		//create and add the kegs to the list
			list.add(i, fass);
		}
		
		System.out.println("unsortiert:");					//unsorted list
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
		
		list = sortiere(list);								//sort the list
		
		System.out.println("\nsortiert:");					//sorted list
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).toString());
		}
	}
}