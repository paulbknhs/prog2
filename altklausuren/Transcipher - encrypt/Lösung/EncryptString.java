import java.math.*;

public class EncryptString {
	
	public static void encryptString(String text, int rows) {
		int columns = (int) Math.ceil(text.length() / (double) rows); 	// calculate the number of rows of the helper matrix
		char[][] m = new char[rows][columns];
		
		for (int i = 0; i < rows; i++) {								//fill a helper matrix with #s
			for (int j = 0; j < columns; j++) {
				m[i][j] = '#';
			}
		}
		int counter = 0;
		for (int i = 0; i < columns; i++) {								//fill the helper matrix with the chars of the text (columns first)
			for (int j = 0; j < rows; j++) {
				if (counter < text.length()) {
					m[j][i] = text.charAt(counter);
				}
				if (m[j][i] == ' ') {
					m[j][i] = '#';
				}
				counter++;
			}
		}
		
		String matrix = "";											//print out the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix = matrix + m[i][j];
			}
			matrix = matrix + "\n";
		}
		//System.out.println("\nMatrix:");
		//System.out.print(matrix);

		String result = "";											//print out the encrypted text
		for (int i = 0; i < rows; i++) {						
			for (int j = 0; j < columns; j++) {
				if (m[i][i] == '#') {
				m[i][j] = ' ';
				}
				result = result + m[i][j];
			}
		}
		System.out.println("\nVerschluesselter Text:");
		System.out.println(result);
	}
}
