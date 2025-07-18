import java.util.*;
/** This class is for testing the Eimer class and the genericMergeSort()-method.
*	
*	@version 2021 September 08
*/
public class Applikation {
	/**
	* Merges two generic ArrayLists of comparable objects for the genericMergeSort()-method.
	*
	*@param two ArrayLists of comparable objects 
	*@return the merged ArrayList
	*/
	public static <T extends Comparable <? super T>> ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right) {
		ArrayList<T> list = new ArrayList<>();					// new list for merge

		while (left.size() != 0 && right.size() != 0) {			// while the two lists contain elements
			if (left.get(0).compareTo(right.get(0)) >= 0) {		// if the first element of the left list is not smaller than the first one of the right list
				list.add(left.get(0));							// add the left element to the list
				left.remove(0);									// and delete it from the list 
			} else {											// if not, do the same for the right list
				list.add(right.get(0));
				right.remove(0);
			}
		}
		while (left.size() != 0) {								// add to the mergelist and delete the rest of the left list
			list.add(left.get(0));
			left.remove(0);
		}
		while (right.size() != 0) {								// do the same thing again for the right list
			list.add(right.get(0));
			right.remove(0);
		}
		return list;											//return the merged list
	}
	
	/**
	* Sorts a generic ArrayList of comparable objects with the mergeSort algorithm.
	* Needs the merge()-method to work properly.
	*
	*@param the ArrayList to be sorted 
	*@return the sorted ArrayList
	*/
	public static <T extends Comparable <? super T>> ArrayList<T> genericMergeSort(ArrayList<T> list) {
		
		if (list.size() <= 1) {							// list with 1 element does not have to be sorted
			return list;
		}

		ArrayList<T> left = new ArrayList<>();			// create two lists for left and right sublists
		ArrayList<T> right = new ArrayList<>();
		
		int mitte = list.size() / 2;					// find the middle index of the list

		for (int i = 0; i < mitte; i++) {				// seperate the list into left and right seperated in the middle
			left.add(list.get(i));
		}
	
		for (int i = mitte; i < list.size(); i++) {
			right.add(list.get(i));
		}
		
		left = genericMergeSort(left);					// do that again for the two lists until only 0 or 1 elements per list
		right = genericMergeSort(right);

		return merge(left, right);						// merge the list back
	}
	
	/**
	* The main()-method.
	* Creates a lists of random buckets and prints it out.
	* Then sorts it with the genericMergeSort()-algorithm and prints it out again.
	*/
	public static void main(String[] args) {

		//ArrayList<Eimer> buckets = new ArrayList<Eimer>();
		Eimer[] buckets = new Eimer[10];
		for (int i = 0; i < buckets.length; i++) {				// create an array with 10 random buckets
			Random r = new Random();
			int randomvolumen = r.nextInt(100)+1;				// volume is somewhere between 1 and 100 (inclusive) for better (and more realistic) use
			buckets[i] = (new Eimer(randomvolumen));
		}

		System.out.println("unsortierte Liste:");				// print out the unsorted array
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(buckets[i]);
		}
		
		ArrayList<Eimer> bucketlist = new ArrayList<>(Arrays.asList(buckets));	// turn the array into an ArrayList
		bucketlist = genericMergeSort(bucketlist);			// sort the list with the genericMergeSort()-method
		
		for (int i = 0; i < buckets.length; i++) {			// overwrite the old array with the now sorted list
			buckets[i] = bucketlist.get(i);
		}
		
		System.out.println("\nsortierte Liste:");			// print out the sorted array
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(buckets[i]);
		}
	}
}
