import java.util.*;
import java.lang.*;
public class FormattingText{
	
	String text;
	String justified;
	
	public void setText(String text){
		this.text = text;
	}
	
	public void alignRight(int limit){
		
		String[] split = this.text.split(" ");  //filter out the words of the String into a String[]
		
		ArrayList<String> strings = new ArrayList<String>(); //fill an arraylist with the words
		for(int i = 0; i < split.length; i++){  
			strings.add(split[i]);
		}
		
		for (int i = 0; i + 1 < strings.size(); i++) {  // fill each line with words so that the length does not step over the maximum
			if (strings.get(i).length() + strings.get(i+1).length() < limit){
				String a = strings.get(i);
				String b = strings.get(i+1);
				strings.set(i, a + " " + b);
				strings.remove(i+1);
				i = i - 1 ;
			}
		}
		
		for (int i = 0; i < strings.size(); i++) {  //insert hashs in front of the line so that the limit of a line is reached
			StringBuilder build = new StringBuilder(strings.get(i));
			int rest = limit - build.length();
			while (rest > 0){
				build.insert(0, "#");
				rest--;
			}
			strings.set(i, build.toString());
		}
		String output = ""; 
		for(int i = 0; i < strings.size(); i++){	//turn the String[] back into Strings
			output = output + strings.get(i) + "\n";
		}
		this.justified = output;
	}
	
	@Override
	public String toString(){
		return this.justified;
	}
}