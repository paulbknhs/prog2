public class Barcode {

    public static void convertToBinary(int number) {
        String bin = Integer.toBinaryString(number);	//turn the number into binary
 
        if (bin.length() <= 8) {						//fill the front up with 0s until the maxlength (8) is reached
            while (bin.length() < 8) {
                bin = "0" + bin;
            }
			System.out.println("> " + bin);
        } else {
            System.out.println("> " + number + " is too big, please try a number smaller than 256");	//if the number is bigger than the maxlength return an error msg
        }
    }
}