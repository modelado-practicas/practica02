package preparacion;

public class HamburguesaDeAvena extends Hamburguesa{
	
	/**
     * Metodo que nos da el nombre de esta hamburguesa
     * @return String El nombre de la hamburguesa
     */
	@Override
	public String nombre() {
		return "Hamburguesa de avena";
	}

	/**
     * Metodo que describe la preparacion de la carne de esta hamburguesa
     */
	@Override
	public void prepararCarne() {
		System.out.println("Asando 170 gramos de "
				+ "avena preparada en forma de medallon.");
	}

	/**
     * Metodo que pone el queso que lleva esta hamburguesa 
     */
	@Override
	public void ponerQueso() {
		System.out.println("Poniendo dos cucharadas de "
				+ "queso crema y unos trozos de "
				+ "queso de cabra.");
	}

	/**
     * Metodo que pone los vegetales que lleva esta hamburguesa 
     */
	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo unas rojadas de"
				+ "jitomate, cebolla morada,  "
				+ "y pepino "
				+ "debajo de una delgada "
				+ "cama de lechuga fresca.");
	}

}
