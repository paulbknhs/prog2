import java.util.*;

public class CompressedText{
	
	String text;
	String compressed;
	
	public void setText(String text){
		this.text = text;
	}

	public void compressText(){
		StringBuilder sb = new StringBuilder(this.text);				//turn the String to a StringBuilder for better use
		for(int i = 0; i < sb.length() - 2; i++){						//iterate through the SB
			if(sb.charAt(i) == sb.charAt(i+1) && sb.charAt(i+1) == sb.charAt(i+2)){	//if at least three following chars are the same
				int counter = 0;
				char c = sb.charAt(i);
				while(i+counter < sb.length() && sb.charAt(i+counter) == c){		// count how many chars there actually are
					counter++;
				}
				String insert = "*" + counter + String.valueOf(c) + "*";
				sb.replace(i, i + counter, insert); 		//replace the sequence of the same char with the compressed versino
				i = i + insert.length();										// skip to the index after the insert
			}
		}
		this.compressed = sb.toString();			//put the StringBuilder as the compressed text
	}
	
	@Override
	public String toString(){
		return this.compressed;
	}
}