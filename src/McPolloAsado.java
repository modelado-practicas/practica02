public class McPolloAsado extends Hamburguesa{
	
	public McPolloAsado() {
		super(9, "McPollo Asado", "McPollo Asado", 200.00, true, false);
	}

	/**
     * Metodo que nos da el nombre de esta hamburguesa
     * @return String El nombre de la hamburguesa
     */
	@Override
	public String nombre() {
		return "McPollo Asado";
	}

	/**
     * Metodo que describe la preparacion de la carne de esta hamburguesa
     */
	@Override
	public void prepararCarne() {
		System.out.println("Cocinando 100 de "
				+ "pollo asado.");
		
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
		System.out.println("Poniendo una capa de lechuga.");
	}


}
