public class HamburguesaClasica extends Hamburguesa {
	
	public HamburguesaClasica() {
		super(1, "Hamburguesa Clasica", "Hamburguesa Clasica", 100.00, true, false);
	}

	/**
     * Metodo que nos da el nombre de esta hamburguesa
     * @return String El nombre de la hamburguesa
     */
	@Override
	public String nombre() {
		return "Hamburguesa Clasica";
	}

	/**
     * Metodo que describe la preparacion de la carne de esta hamburguesa
     */
	@Override
	public void prepararCarne() {
		System.out.println("Asando 50 gramos de "
				+ "carne de res.");
	}
	
	/**
     * Metodo que pone el queso que lleva esta hamburguesa 
     */
	@Override
	public void ponerQueso() {
	}

	/**
     * Metodo que pone los vegetales que lleva esta hamburguesa 
     */
	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo un par de pepinilos.");
	}

}
