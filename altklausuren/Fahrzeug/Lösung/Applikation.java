import java.util.*;

public class Applikation {
	
	public static Vector<Auto> addCar(Vector<Auto> cars, Auto car) { //add a new car to the cars-vector and sort it
		cars.add(cars.size(), car);
		return sort(cars);
	}
	
	public static Vector<Auto> sort(Vector<Auto> cars) { 		//sorts a vector of cars by their weight
		for(int i = 0; i < cars.size(); i++){					//bubblesort algorithm
			for(int j=1; j < (cars.size()-i); j++){  
				if(cars.get(j-1).istSchwerer(cars.get(j))){  	//sort by weight
					Auto temp = cars.get(j-1);  
					cars.set(j-1, cars.get(j));  
					cars.set(j, temp);  
				} 
			}
		}
		return cars;
	}
	
	public static void main(String[] args) {

		Vector <Auto> cars = new Vector<Auto>();  //fill a vector "cars" with 10 randomly generated cars
		for(int i = 0; i < 10; i++){
			Random r = new Random();
			
			int gewicht = r.nextInt((2000 - 500) + 1) + 500;
			
			Auto car = new Auto(gewicht);
			cars.add(i, car);
		}
		
		System.out.println("unsortiert:");					//unsorted vector
		for(int i = 0; i < cars.size(); i++){
			System.out.println(cars.get(i).toString());
		}
		
		cars = sort(cars);									//sort the vector

		System.out.println("\nsortiert:");					//sorted vector
		for(int i = 0; i < cars.size(); i++){
			System.out.println(cars.get(i).toString());
		}
		
		for(int i = 0; i < 10; i++){						//generate 10 new cars and add them to the vector while sorting it
			Random r = new Random();
			
			int gewicht = r.nextInt((2000 - 500) + 1) + 500;
			
			Auto car = new Auto(gewicht);
			cars = addCar(cars, car);
		}
		
		System.out.println("\nsortiert mit 10 neuen Autos:");	//output: sorted vector with 20 cars
		for(int i = 0; i < cars.size(); i++){
			System.out.println(cars.get(i).toString());
		}
	}
}