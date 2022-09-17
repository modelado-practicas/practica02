package preparacion;

public class CientoTreceGramos extends Hamburguesa{
	
	@Override
	public String nombre() {
		return "Ciento Trece Gramos";
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
		System.out.println("Poniendo un par de "
				+ "pepinillos y una rodaja de cebolla.");
		
	}
	
	@Override
	public void prepararHamburguesa() {
		System.out.println("Iniciando preparacion "
				+ "de " + nombre());
		ponerPan();
		ponerMayonesa();
		ponerMostaza();
		ponerQueso();
		prepararCarner();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + "esta "
				+ "lista.");
	}

}
