import java.math.*;

public class DecryptString {
	
	public static void decryptString(String text, int columns) {
		int rows = (int) Math.ceil(text.length() / (double) columns); 	//calculate the number of rows of the helper matrix
		int counter = 0;
		char[][] m = new char[columns][rows];
		
		for (int i = 0; i < columns; i++) {								//fill a helper matrix with the chars of the String (columns first)
			for (int j = 0; j < rows; j++) {
				if (counter < text.length()) {
					m[i][j] = text.charAt(counter);
				}
				counter++;
			}
		}
		
		String matrix = "";												//print out the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix = matrix + m[j][i];
			}
			matrix = matrix + "\n";
		}
		//System.out.println("\nMatrix:");
		//System.out.print(matrix);

		String result = "";												//print out the decrypted text
		for (int i = 0; i < rows; i++) {						
			for (int j = 0; j < columns; j++) {
				if (m[j][i] == '#') {
					m[j][i] = ' ';
				}
				result = result + m[j][i];
			}
		}
		System.out.println("\nEntschluesselter Text:");
		System.out.println(result);
	}
}