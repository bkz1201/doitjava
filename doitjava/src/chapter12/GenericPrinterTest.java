package chapter12;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powP = new GenericPrinter<>();
		
		powP.setMaterial(new Powder());
		Powder powder = powP.getMaterial();
		System.out.println(powP);

		GenericPrinter<Plastic> plaP = new GenericPrinter<>();
		
		plaP.setMaterial(new Plastic());
		Plastic plastic = plaP.getMaterial();
		System.out.println(plaP);
	}
}
