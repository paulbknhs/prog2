import java.util.*;

public class TextAnalyser{
	
	String text;
	ArrayList<String> analysed;
	
	public void setText(String text){
		this.text = text;
	}
	
	public void analyseText(){

		String[] split = this.text.split(" ");		//divide the text into different words (elements of arrays)
		
		for (int i = 0; i+1 < split.length; i++){  //bubblesort the words by length
			if (split[i].length() > split[i+1].length()){
				String tmp = split[i];
				split[i] = split[i+1];
				split[i+1] = tmp;
				i = 0;
			}
		}
		
		for (int i = 0; i+1 < split.length; i++){  //bubblesort the words by length again because why not?
			if (split[i].length() > split[i+1].length()){
				String tmp = split[i];
				split[i] = split[i+1];
				split[i+1] = tmp;
				i = 0;
			}
		}
		
		ArrayList<String> strings = new ArrayList<String>(); 	//turn the array into an arraylist
		
		for(int i = 0; i < split.length; i++){					//format the list
			strings.add(split[i].length() + ": " + split[i]);
		}
		
		for (int i = 0; i < strings.size(); i++) {				//merge elements that have the same length
			if (i+1 < strings.size() && strings.get(i).charAt(0) == strings.get(i+1).charAt(0)){
				
				StringBuilder sb = new StringBuilder(strings.get(i+1));
				sb.deleteCharAt(0);
				sb.deleteCharAt(0);
				
				strings.set(i, strings.get(i) + sb.toString());
				strings.remove(i+1);
				i = 0;
			}
		}
		
		for (int i = 0; i < strings.size(); i++) {				//merge elements that have the same length again because why not?
			if (i+1 < strings.size() && strings.get(i).charAt(0) == strings.get(i+1).charAt(0)){
				
				StringBuilder sb = new StringBuilder(strings.get(i+1));
				sb.deleteCharAt(0);
				sb.deleteCharAt(0);
				
				strings.set(i, strings.get(i) + sb.toString());
				strings.remove(i+1);
				i = 0;
			}
		}
		this.analysed = strings;
	}
	
	@Override
	public String toString(){
		String output = "";
		for (int i = 0; i < this.analysed.size(); i++) {
			output = output + analysed.get(i) + "\n";
		}
		return output;
	}
}