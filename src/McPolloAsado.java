package preparacion;

public class McPolloAsado extends Hamburguesa{
	
	@Override
	public String nombre() {
		return "McPollo Asado";
	}

	@Override
	public void prepararCarner() {
		System.out.println("Cocinando 100 de "
				+ "pollo asado");
		
	}

	@Override
	public void ponerQueso() {
		
	}

	@Override
	public void ponerVegetales() {
		System.out.println("Poniendo una capa de lechuga");
	}


}
