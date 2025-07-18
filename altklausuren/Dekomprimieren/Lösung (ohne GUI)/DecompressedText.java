import java.util.*;

public class DecompressedText{
	
	String text;
	String decompressed;
	
	public void setText(String text){
		this.text = text;
	}
	
	public boolean isNumber(char c){			//function to identify if a char is a number
		if (c >= '0' && c <= '9'){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean checkSequence(StringBuilder sb, int start){		//check if a sequence has the format *(number))(char)*
		
		if(start + 1 < sb.length() && sb.charAt(start) == '*' && sb.charAt(start+1) != '*' && sb.charAt(start+2) != '*'){		//check if the sequence begins with a * and isnt´t followed by another *
			int stop = start + 1;
			while (stop < sb.length() && sb.charAt(stop) != '*' ){		//find the end of the sequence
				stop++;
			}
			for(int i = start + 1; i < stop - 1; i++){			//check if every char apart from the last one is a number
				if (!isNumber(sb.charAt(i))){
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public void compressText(){
		StringBuilder sb = new StringBuilder(this.text);						//turn the String to a StringBuilder for better use
		for(int start = 0; start < sb.length() - 2; start++){						//iterate through the SB											
			if(checkSequence(sb, start)){  //start is the star mark (*)
				int stop = start+1;
				while (stop < sb.length() && sb.charAt(stop) != '*' ){	//stop is the stop mark (*) 
					stop++;
				}
				char c = sb.charAt(stop-1);		//char to be inserted
				
				String number = "";
				for(int j = start+1; j < stop - 1; j++){		//filter out the multiplicator of the compressed char
					number = number + String.valueOf(sb.charAt(j));
				}
			
				int mult = Integer.parseInt(number);	//turn the multiplicator into an integers
				
				String insert = "";
				for(int k = 0; k < mult; k++){			//multiply the compress char with the multiplicator -> decompressed sequence
					insert = insert + String.valueOf(c);
				}
				sb.replace(start, stop+1, insert);		//replace the compressed sequence with the decompressed version
				start = stop;							//continue after the sequence
			}
		}
		this.decompressed = sb.toString();			//put the StringBuilder as the decompressed text
	}

	@Override
	public String toString(){
		return this.decompressed;
	}
}