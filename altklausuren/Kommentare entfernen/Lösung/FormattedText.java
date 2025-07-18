import java.util.*;

public class FormattedText{
	public static boolean deleteEmpty(String sequence){				//for the deletion of changed and now empty lines
		if (sequence.length() == 0){								//if the line is completly empty
			return true;											//delete it
			
		} else{														//if the line has characters
			for(int j = 0; j < sequence.length(); j++){	
				if(sequence.charAt(j) != ' '){						//if the line has at least one character other than a blank
					return false;									//do not delete it
				}
			}
		}								
		return true;												//if the line consists only of blanks delete it
	}
	
	public static ArrayList<String> formatText(ArrayList<String> text){
		
		boolean check = false;										//for deletion of the /*...*/-parts
		for(int i = 0; i < text.size(); i++){						//iterate through the text
	
			StringBuilder sb = new StringBuilder(text.get(i));		//turn every line into a StringBuilder for better use
			
			boolean changed = false;
			for(int j = 0; j < sb.length(); j++){					//iterate through the StringBuilder
				if(sb.charAt(j) == '/' && sb.charAt(j+1) == '*'){	//if a sequence "/*" is spotted
					check = true;									//remember that with a boolean check
				}else if(sb.charAt(j) == '*' && sb.charAt(j+1) == '/' && check == true){	//until a sequence "*/" is spotted
					sb.deleteCharAt(j);								//delete the "*/"
					sb.deleteCharAt(j);
					check = false;									//do not delete characters anymore
					changed = true;									//something has been changed
				}
				if(check == true){									//if check is true
					sb.deleteCharAt(j);								//delete the current character
					changed = true;									//something has been changed
					j--;											
				}
			}
			text.set(i, sb.toString());								//set the StringBuilder as the current line
			
			if (changed == true){									//if something has been changed
				if(deleteEmpty(text.get(i))){						//analyse the line with deleteEmpty()
					text.remove(i);									//if true, delete the line
					i--;
				}
			}
		}
		//															//for deletion of the //...-parts
		for(int i = 0; i < text.size(); i++){						//iterate through the text
			
			StringBuilder sb = new StringBuilder(text.get(i));		//turn every line into a StringBuilder for better use
			boolean changed = false;
			for(int j = 0; j < sb.length()-1; j++){					//iterate through the StringBuilder
				
				if(sb.charAt(j) == '/' && sb.charAt(j+1) == '/'){	//if a sequence "//" is spotted
					sb.delete(j, sb.length());						//delete the rest of the line
					changed = true;									//something has been changed
				}
			}
			text.set(i, sb.toString());								//set the StringBuilder as the current line
			if (changed == true){									//if something has been changed
				if(deleteEmpty(text.get(i))){						//analyse the line with deleteEmpty()
					text.remove(i);									//if true, delete the element
					i--;
				}
			}
		}
		return text;
	}
}