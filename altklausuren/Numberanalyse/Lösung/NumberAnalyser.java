import java.util.*;

public class NumberAnalyser{
	
	String sequence;
	ArrayList<String> analysed;
	
	public void setSequence(String sequence){
		this.sequence = sequence;
	}
	
	public static int checksum(String number){
		
		try { 												//check if the input really is a number
			Integer.parseInt(number); 
		}  catch (NumberFormatException e){ 
			System.out.println(">" + number + " is not a valid integer."); 
			System.exit(1);
		}
		
		char[] digits = number.toCharArray();				//turn the String of the number to a char-array
		int checksum = 0;
		for(int i = 0; i < digits.length; i++){				//calculate the checksum
			
			int digit = Character.getNumericValue(digits[i]);
			checksum = checksum + digit;
		}
		return checksum;
	}
	
	public void analyseSequence(){

		String[] split = this.sequence.split(" ");		//divide the sequence into different numbers (elements of arrays)
		
		for (int i = 0; i+1 < split.length; i++){  		//bubblesort the numbers by checksum
			if (checksum(split[i]) > checksum(split[i+1])){
				String tmp = split[i];
				split[i] = split[i+1];
				split[i+1] = tmp;
				i = 0;
			}
		}
		
		ArrayList<String> strings = new ArrayList<String>(); 	//turn the array into an arraylist
		
		for(int i = 0; i < split.length; i++){					//format the list
			strings.add(checksum(split[i]) + ": " + split[i]);
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