public class Haus implements IstHoeher, Comparable<Haus> {
	String name;
	int hoehe;

	public Haus(String name, int hoehe) {
		this.name = name;
		this.hoehe = hoehe;
	}

	public String getName() {
		return this.name;
	}
	
	public int getHoehe() {
		return this.hoehe;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}

	public int compareTo(Haus h) {
		if (this.getHoehe() < h.getHoehe()) {
			return -1;
		} else if (this.getHoehe() == h.getHoehe()) {
			return 0;
		} else{
			return 1;
		}
	}

	@Override
	public String toString() {
		return String.format(name + " mit Hoehe " + this.getHoehe() + " m");
	}
}
