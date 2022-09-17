package preparacion;

public class CientoTreceDeluxe extends Hamburguesa{

	@Override
	public String nombre() {
		return "Ciento Trece Gramos Deluxe";
	}

	@Override
	public void prepararCarner() {
		System.out.println("Asando 120 gramos de "
				+ "carne de res.");
		
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo una rebana de "
				+ "queso amarillo.");
	}

	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo jitomate, lechuga "
				+ "pepinillos y unas rodajas de cebolla.");
		
	}
	
	@Override
	public void prepararHamburguesa() {
		System.out.println("Iniciando preparacion "
				+ "de " + nombre());
		ponerPan();
		ponerQueso();
		prepararCarner();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerMostaza();
		ponerMayonesa();
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + "esta "
				+ "lista.");
	}

}
