/** This class represents a bucket.
*	It is an implementation of the Comparable interface.
*	
*	@version 2021 September 08
*/
public class Eimer implements Comparable <Eimer> {
	
	/** This integer represents the volume of the bucket. */
	int volumen;
	
	/** This method constructs a bucket.
	*
	*	@param volume of the bucket as an integer
	*/
	public Eimer(int volumen) {
		this.volumen = volumen;
	}
	
	/** This method is a getter for the volume of the bucket.
	*	
	*	@return volume of the bucket as an integer
	*/
	public int getVolumen() {
		return this.volumen;
	}

	/** This method compares two buckets by their volumes.
	*	It overrides the compareTo() method of the Comparable Interface.
	*	
	*	@param other bucket e 
	*	@return 1 if this bucket is smaller than the other one, -1 if not, 0 if they are equally big.
	*/	
	@Override
	public int compareTo(Eimer e) {
		if (this.getVolumen() < e.getVolumen()) {
			return 1;
		} else if (this.getVolumen() == e.getVolumen()) {
			return 0;
		} else{
			return -1;
		}
	}

	/** This method returns the information of a bucket as a String.
	*	It overrides the toString() method of the Object class.
	*	
	*	@return the information of the bucket as a String
	*/
	@Override
	public String toString() {
		return String.format("Eimer mit Volumen " + this.getVolumen());
	}
}
