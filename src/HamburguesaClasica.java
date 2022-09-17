package preparacion;

public class HamburguesaClasica extends Hamburguesa {
	
	@Override
	public String nombre() {
		return "Hamburguesa Clasica";
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
	}

	@Override
	public
	void ponerVegetales() {
		System.out.println("Poniendo un par de pepinilos.");
	}

}
