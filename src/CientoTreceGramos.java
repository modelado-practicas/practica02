public class CientoTreceGramos extends Hamburguesa{
	
	/**
     * Metodo que nos da el nombre de esta hamburguesa
     * @return String El nombre de la hamburguesa
     */
	@Override
	public String nombre() {
		return "Ciento Trece Gramos";
	}

	/**
     * Metodo que describe la preparacion de la carne de esta hamburguesa
     */
	@Override
	public void prepararCarne() {
		System.out.println("Asando 120 gramos de "
				+ "carne de res.");
		
	}

	/**
     * Metodo que pone el queso que lleva esta hamburguesa 
     */
	@Override
	public void ponerQueso() {
		System.out.println("Poniendo una rebana de "
				+ "queso amarillo.");
	}

	/**
     * Metodo que pone los vegetales que lleva esta hamburguesa 
     */
	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo un par de "
				+ "pepinillos y una rodaja de cebolla.");
		
	}
	
	/**
     * Metodo que regresa la descripcion completa de la
     * preparacion de nuestra hamburguesa
     */
	@Override
	public void prepararHamburguesa() {
		System.out.println("Iniciando preparacion "
				+ "de " + nombre());
		ponerPan();
		ponerMayonesa();
		ponerMostaza();
		ponerQueso();
		prepararCarne();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + " esta "
				+ "lista.");
	}

}
