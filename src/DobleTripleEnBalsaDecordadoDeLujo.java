package preparacion;

public class DobleTripleEnBalsaDecordadoDeLujo extends Hamburguesa{

	@Override
	public String nombre() {
		return "Doble triple en balsa, decordado de "
				+ "lujo de 4x4 estilo "
				+ "animal, guijarros extra "
				+ "con vibracion exprimida,"
				+ " eje con grasa ligera, hazlo "
				+ "llorar, quemalo y dejalo nadar";
	}

	@Override
	public void prepararCarner() {
		System.out.println("Asando 50 gramos de "
				+ "carne de res.");
		
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo una rebana de queso "
				+ "amarillo");
		
	}

	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo lechuga, extra cebolla, "
				+ "jitomate y pepinillos");
		
	}
	
	@Override
	public void prepararHamburguesa() {
		System.out.println("Iniciando preparacion "
				+ "de " + nombre());
		ponerPan();
		ponerMayonesa();
		ponerMostaza();
		prepararCarner();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerPan();
		prepararCarner();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerPan();
		prepararCarner();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerPan();
		prepararCarner();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + "esta "
				+ "lista.");
	}

}
