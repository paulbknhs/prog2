public class GenericQuicksort{
	
	public static <T extends Comparable<T>> int part(T[] arr, int start, int stop){
		
		int links = start;			//Setzen Sie die Variablen links auf den Anfangspunkt 
		int rechts = stop - 1;		//und rechts auf den Endpunkt – 1
		T pivot = arr[stop];		//Setzen Sie die Variable pivot auf Array[Endpunkt].
		
		while(links < rechts){		//Wiederholen Sie Folgendes solange links kleiner als rechts ist.
			while(links < stop && arr[links].compareTo(pivot) < 0){	//Erhöhen Sie links um 1 solange links kleiner als der Endpunkt ist und Array[links] kleiner als pivot ist.
				links++;
			}
			while(rechts > start && arr[rechts].compareTo(pivot) >= 0){	//Verringern Sie rechts um 1 solange rechts größer als der Anfangspunkt ist und Array[rechts] größer oder gleich pivot ist.
				rechts--;
			}
			if (links < rechts){		//Falls links kleiner als rechts ist, 
				T temp = arr[links];	//tausche die Werte von Array an den Stellen links und rechts miteinander.
				arr[links] = arr[rechts];
				arr[rechts] = temp;
			}
		}
		if (arr[links].compareTo(pivot) >= 0){		//Falls der Array[links] größer als pivot ist, tausche die Werte von Array an den Stellen links und Endpunkt miteinander.
			T tmp = arr[links];
			arr[links] = arr[stop];
			arr[stop] = tmp;
		}
		return links;				//Geben Sie links zurück.
	}
	
	public static <T extends Comparable<T>> void quicksort(T[] arr, int start, int stop){
		if (start < stop){							//Falls der Anfangspunkt kleiner als der Endpunkt ist, dann machen Sie folgendes:
			int mitte = part(arr, start, stop); 	//Rufen Sie den Algorithmus Teilen mit demselben Anfangs- und Endpunkt und derselbenListe auf und speichern Sie das Ergebnis in einer Variable mit dem Namen mitte ab.
			quicksort(arr, start, mitte-1);			//Rufen Sie Quicksort mit demselben Anfangspunkt und mitte – 1 als Endpunkt auf.
			quicksort(arr, mitte+1, stop);			//Rufen Sie Quicksort mit mitte + 1 als Anfangspunkt und demselben Endpunkt auf.
		}
	}
	public static <T extends Comparable<T>> void sort(T[] arr){		//initialisiere den quicksort-Algorithmus
		quicksort(arr, 0, arr.length - 1);
	}
}