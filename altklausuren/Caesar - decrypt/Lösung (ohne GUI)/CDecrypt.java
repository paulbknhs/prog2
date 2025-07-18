import java.util.*;

public class CDecrypt{

	public static String decrypt(String text, int key){

		StringBuilder sb = new StringBuilder(text);		//turn the String into a StringBuilder for better use
		
		for(int i = 0; i < sb.length(); i++){			//iterate through the StringBuilder
			
			char currentchar = sb.charAt(i);
			if(currentchar != ' '){						//unless the current char is not a blank
				int pos = currentchar - 'A';			//get the position in the alphabet
				while(key < 0){							//"translate" negative keys to a positive variant
					key = key + 26;
				}
				int newpos = (26 - key + pos) % 26;		//determine the new position with the help of a %-operation
				char insert = (char) ('A' + newpos);	//create the new char
				sb.setCharAt(i, insert);				//change the current char to the new char
			}
		}
		return sb.toString();
	}
}