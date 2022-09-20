public class HamburguesaDeSoya extends Hamburguesa{

	public HamburguesaDeSoya() {
		super(3, "HamburguesaDeSoya", "HamburguesaDeSoya", 100.00, false, true);
	}

	/**
     * Metodo que nos da el nombre de esta hamburguesa
     * @return String El nombre de la hamburguesa
     */
	@Override
	public String nombre() {
		return "Hamburguesa de soya";
	}

	/**
     * Metodo que describe la preparacion de la carne de esta hamburguesa
     */
	@Override
	public void prepararCarne() {
		System.out.println("Preparando 150 gramos de "
				+ "soya en forma de medallon.");
	}

	/**
     * Metodo que pone el queso que lleva esta hamburguesa 
     */
	@Override
	public void ponerQueso() {
		System.out.println("Poniendo un pedazo de queso "
				+ "panela y un poco de queso de cabra");
	}

	/**
     * Metodo que pone los vegetales que lleva esta hamburguesa 
     */
	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo unas rojadas de"
				+ "jitomate, cebolla y una capa de lechuga.");
	}

}
