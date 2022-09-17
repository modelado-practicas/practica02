package preparacion;

public class QuesoHamburguesa extends Hamburguesa {
	
	@Override
	public String nombre() {
		return "QuesoHamburguesa";
	}

	@Override
	public
	void prepararCarner() {
		System.out.println("Asando 50 gramos de "
				+ "carne de res.");
	}

	@Override
	public
	void ponerQueso() {
		System.out.println("Poniendo una rebana de "
				+ "queso amarillo.");
	}

	@Override
	public
	void ponerVegetales() {
		System.out.println("Poniendo un par de pepinillos.");
	}

}
