package preparacion;

public class MacGrande extends Hamburguesa{

	@Override
	public String nombre() {
		return "MacGrande";
	}

	@Override
	public void prepararCarner() {
		System.out.println("Asando 50 gramos de "
				+ "carne de res.");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo una rebana de "
				+ "queso amarillo.");
	}

	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo un poco de lechuga y "
				+ "un par de pepinillos");
		
	}
	
	@Override
	public void prepararHamburguesa() {
		System.out.println("Iniciando preparacion "
				+ "de " + nombre());
		ponerPan();
		ponerVegetales();
		ponerQueso();
		prepararCarner();
		ponerCarne();
		ponerPan();
		ponerVegetales();
		prepararCarner();
		ponerCarne();
		ponerMostaza();
		ponerMayonesa();
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + "esta "
				+ "lista.");
	}

}
