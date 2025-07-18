public class GenericMaxSort <T extends Comparable>{

	public void sort(T[] arr){						//sorts an array of comparable elements with the Maxsort alogithm
	
		int n = arr.length -1;
		for(int i = 0 ; i < n; i++){				//iterate through the array
			T max = arr[0];
			int maxpos = 0;
			for(int j = 0 ; j < n ; j++){			//find the biggest element
				if(arr[j].compareTo(max) > 0 ){		
					max = arr[j] ;
					maxpos = j ;
				}
			}
			T tmp = arr[maxpos];					// put swap the max element with the last element
			arr[maxpos] = arr[n];
			arr[n] = tmp;
			n--;
		}
	}
}