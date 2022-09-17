package preparacion;

public class HamburguesaDeSoya extends Hamburguesa{

	@Override
	public String nombre() {
		return "Hamburguesa de soya";
	}

	@Override
	public void prepararCarner() {
		System.out.println("Preparando 150 gramos de "
				+ "soya en forma de medallon.");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo un pedazo de queso "
				+ "panela y un poco de queso de cabra");
	}

	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo unas rojadas de"
				+ "jitomate, cebolla y una capa de lechuga.");
	}

}
