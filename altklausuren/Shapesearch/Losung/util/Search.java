package Losung.util;
import java.util.*;

public class Search {
	
	public static Shape binarySearch(ArrayList<Shape> list, int lowerBound, int upperBound, int searchCriteria){ //search-algorithm like described in the task
		
		while(lowerBound <= upperBound){
			
			int m = (lowerBound + upperBound)/2;
			if (list.get(m).getSurfaceArea() == searchCriteria){
				return list.get(m);
			} else if (list.get(m).getSurfaceArea() > searchCriteria){
				upperBound = m - 1;
			} else{
				lowerBound = m+1;
			}
		}
		return null;
	}
}