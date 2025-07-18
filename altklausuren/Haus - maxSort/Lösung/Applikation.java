public class Applikation{
	public static void main(String[] args) {
		
		Haus a = new Haus(1);
		Haus b = new Haus(8);
		Haus c = new Haus(3);
		Haus d = new Haus(3);
		Haus e = new Haus(2);
		Haus f = new Haus(4);
		Haus g = new Haus(3);
		Haus h = new Haus(3);
		Haus[] arr = {a, b, c, d, e, f, g, h};
		
		System.out.println("unsortiert:");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i].toString());
		}
		
		GenericMaxSort<Haus> sort = new GenericMaxSort<Haus>();
		sort.sort(arr);
		
		System.out.println("\nsortiert:");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i].toString());
		}
	}
}