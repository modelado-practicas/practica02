package preparacion;

public class HamburguesaDeAvena extends Hamburguesa{
	@Override
	public String nombre() {
		return "Hamburguesa de tofu";
	}

	@Override
	public void prepararCarner() {
		System.out.println("Asando 170 gramos de "
				+ "tofu.");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo un pedazo de queso "
				+ "panela y un poco de queso de cabra");
	}

	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo unas rojadas de"
				+ "jitomate, una capa de lechuga y .");
	}

}
