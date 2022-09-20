public class DobleTripleEnBalsaDecordadoDeLujo extends Hamburguesa{

	public DobleTripleEnBalsaDecordadoDeLujo() {
		super(8, "Doble Triple En Balsa Decordado De Lujo", "Doble Triple En Balsa Decordado De Lujo", 300.00, true, false);
	}

	/**
     * Metodo que nos da el nombre de esta hamburguesa
     * @return String El nombre de la hamburguesa
     */
	@Override
	public String nombre() {
		return "doble triple en balsa, decordado de "
				+ "lujo de 4x4 estilo "
				+ "animal, guijarros extra "
				+ "con vibracion exprimida,"
				+ " eje con grasa ligera, hazlo "
				+ "llorar, quemalo y dejalo nadar";
	}

	/**
     * Metodo que describe la preparacion de la carne de esta hamburguesa
     */
	@Override
	public void prepararCarne() {
		System.out.println("Asando 4 pedazos de carne de res para hamburguesas "
				+ "de 50 gramos.");	
	}

	/**
     * Metodo que pone el queso que lleva esta hamburguesa 
     */
	@Override
	public void ponerQueso() {
		System.out.println("Poniendo una rebana de queso "
				+ "amarillo.");
		
	}

	/**
     * Metodo que pone los vegetales que lleva esta hamburguesa 
     */
	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo lechuga, extra cebolla, "
				+ "jitomate y pepinillos.");
		
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
		prepararCarne();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerPan();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerPan();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerPan();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + " esta "
				+ "lista.");
	}

}
