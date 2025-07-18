package Losung;
import Losung.util.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		ArrayList<Shape> shapes = new ArrayList<Shape>();  //fill an arraylist "shapes" with 10 randomly generated rectangles"
		Random r = new Random();			
		for(int i = 0; i < 10; i++){
			int x = r.nextInt(10)+1;
			int y = r.nextInt(10)+1;
			Rectangle rec = new Rectangle(x,y);
			shapes.add(i, rec);
		}
	
		int n = shapes.size();  						//bubblesort the arraylist by SurfaceArea
		Shape temp = null;  
		for(int i=0; i < n; i++){	
			for(int j=1; j < (n-i); j++){  
				if(shapes.get(j-1).getSurfaceArea() > shapes.get(j).getSurfaceArea()){  
					temp = shapes.get(j-1);  
					shapes.set(j-1, shapes.get(j));  
					shapes.set(j, temp);  
				} 
			}
		}  
	
		System.out.print("Shapes: ");					//print out the list
		for(int i = 0; i < shapes.size(); i++){
			System.out.print(shapes.get(i).toString());
			if (i < shapes.size()-1){
				System.out.print(", ");
			} else{
				System.out.println();
			}
		}

		while (true){
			
			System.out.println("What surface do you want to search for:");
			
			Scanner scanner = TermRead.getScanner();
			String input = scanner.nextLine();
			
			try { 
				Integer.parseInt(input); 
			}  catch (NumberFormatException e){ 
				System.out.println(input + " is not a valid integer."); 
				System.exit(1);
			} 
			int searchCriteria = Integer.parseInt(input);
			
			Shape result = Search.binarySearch(shapes, 0, 9, searchCriteria);
			
			if (result != null){
				System.out.println("Found " + result.toString() + " with a surface area of " + result.getSurfaceArea());
			}
			else{
				System.out.println("Didn't find anything.");
				input = "";
			}
			while (!input.equals("n") && !input.equals("y")){
				System.out.println("Do you want to search again (y/n): ");
				input = scanner.nextLine();
				if (input.equals("n")){
					System.exit(0);
				} else if (input.equals("y")){
					break;
				}
			}
		}
	}
}