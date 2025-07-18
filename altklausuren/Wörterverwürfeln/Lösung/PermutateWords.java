public class PermutateWords{
	String text;
	String permutedText;
	
	public char[] bubblesort (char[] arr){ //bubblesort the char-array
		
		int lastChar = 2;
		if (arr[arr.length - 1] == '.'){  //but ignore any dots at the end
			lastChar = 3;
		}
		for (int i = 1; i < arr.length - lastChar; i++){ //also ignore the first and last letter
			if (arr[i] > arr[i + 1]){
				char tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
				i = 0;
			}
		}
		return arr;
	}
	
	public String permutate(String text){

		String[] split = this.text.split(" ");  //split the words to a String-array
		String output = "";
		for(int i = 0; i < split.length; i++){
			
			char arr[] = split[i].toCharArray(); 	//turn the words of the Stringarray into char-Arrays for better use
			arr = bubblesort(arr);					//and bubblesort the words with the bubblesort method
			
			for (int j = 0; j < arr.length; j++){
				output = output + arr[j];			//re-append the words to the output-String
			}
			if (i < split.length - 1){
				output = output + " ";					//fill the blanks back in
			}
		}
		return output;
	}
	
	public PermutateWords(String text){
		this.text = text;
		this.permutedText = permutate(text);
	}
	
	public String toString(){
		return this.permutedText;
	}
}