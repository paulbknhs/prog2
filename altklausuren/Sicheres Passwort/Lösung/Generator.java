public class Generator{
	
	String text;
	String password;
	
	public String generatePW(String text){
	
		int endzahl = 0;							//determines what number is placed at the end
		for(int i = 0; i < text.length(); i++){
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
				endzahl++;
			}
		}
		
		String pw = String.valueOf(text.charAt(0));		//take only the first letter of each word and append it to a String
		for(int i = 1; i < text.length(); i++){
			if (text.charAt(i) == ' ' && i+1 < text.length()){
				pw = pw + String.valueOf(text.charAt(i+1));
			}
		}
		pw = pw + endzahl;						//append the number at the end and return
		return pw;
	}
	
	public String toString(){
		return this.password;
	}
	
	public Generator(String text){
		this.text = text;
		this.password = generatePW(text);
	}
}