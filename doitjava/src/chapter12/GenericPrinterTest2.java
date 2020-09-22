package chapter12;

public class GenericPrinterTest2 {
	public static void main(String[] args) {
		GenericPrinter<Powder> powP = new GenericPrinter<>();
		powP.setMaterial(new Powder());
		powP.printing();
		
		GenericPrinter<Plastic> plaP = new GenericPrinter<>();
		plaP.setMaterial(new Plastic());
		plaP.printing();
	}
}
