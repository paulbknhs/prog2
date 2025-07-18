import java.util.*;

public class Applikation {
	
	public static void presort(ArrayList<Haustier> animals) { 		//sorts an arraylist of animals by their names
		animals.sort((o1, o2)-> o1.getName().compareTo(o2.getName()));
	}

	public static String sort(ArrayList<Haustier> animals){
		
		presort(animals);			//first sort the animals by their names
		
		ArrayList<Hamster> hamster = new ArrayList<Hamster>();  //two lists for hamsters and dogs
		ArrayList<Hund> hunde = new ArrayList<Hund>();
		
		Hamster testhamster = new Hamster("",0);   //two dummy-animals for comparison
		Hund testhund = new Hund("",0);
		
		for (int i = 0; i < animals.size(); i++){	//iterate through the main-arraylist: hamsters go to the hamsterslist, dogs go to the dogslist
			if (animals.get(i).getClass().equals(testhamster.getClass())){
				hamster.add((Hamster) animals.get(i));
			} else if (animals.get(i).getClass().equals(testhund.getClass())){
				hunde.add((Hund) animals.get(i));
			}
		}
		
		String output = "\n\nHamsterliste:\n";  //String for output, first with the information of the hamsters...
		for (int i = 0; i < hamster.size(); i++){
			output = output + hamster.get(i).toString();
			if(i < hamster.size()-1){
				output = output + ", ";
			}
		}
		
		output = output + "\nHundeliste:\n"; //...then with the information for the dogs
		for (int i = 0; i < hunde.size(); i++){
			output = output + hunde.get(i).toString();
			if(i < hunde.size()-1){
				output = output + ", ";
			}
		}
		return output;
	}

	public static void main(String[] args) {

		ArrayList<Haustier> animals = new ArrayList<Haustier>(); //list of animals

		while (true){
			System.out.println(">Eingabe:");
			
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] split = input.split(" ");
			
			if(input.equals("exit")){	   //if input is exit: program exits
				System.exit(1);
			} else if(input.equals("sort")){			//if input is sort, the list of animals is sorted
				System.out.println(sort(animals));
			} else if(split.length == 3 && split[0].equals("Hamster")){  // valid hamster - input -> create a hamster in the animallist
				try { 
					Integer.parseInt(split[2]); 
				} catch (NumberFormatException e){ 
					System.out.println(input + " is not a valid integer."); 
					System.exit(1);
				}
				int number = Integer.parseInt(split[2]);

				Hamster hamster = new Hamster(split[1], number);
				animals.add(hamster);

			} else if (split.length == 3 && split[0].equals("Hund")){   // valid dog-input -> create a dog in the animallist
				try { 
					Integer.parseInt(split[2]); 
				} catch (NumberFormatException e){ 
					System.out.println(split[2] + " is not a valid integer."); 
					System.exit(1);
				}
				int number = Integer.parseInt(split[2]);
				
				Hund hund = new Hund(split[1], number);
				animals.add(hund);
			} else {
				System.out.println("Wrong input, try again!");     //else: wrong input is assumed
			}
		}
	}
}