package preparacion;

public class HamburguesaDeAvena extends Hamburguesa{
	@Override
	public String nombre() {
		return "Hamburguesa de avena";
	}

	@Override
	public void prepararCarner() {
		System.out.println("Asando 170 gramos de "
				+ "avena preparada en forma de medallon.");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo dos cucharadas de "
				+ "queso crema y unos trozos de "
				+ "queso de cabra");
	}

	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo unas rojadas de"
				+ "jitomate, cebolla morada,  "
				+ "y pepino "
				+ "debajo de una delgada "
				+ "cama de lechuga fresca.");
	}

}
