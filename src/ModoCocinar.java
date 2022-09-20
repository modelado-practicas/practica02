package preparacion;

public class ModoCocinar implements EstadoCocinero{
	Robot cocinero;
	
	public ModoCocinar(Robot cocinero){
		this.cocinero = cocinero;

	}

	@Override
	public void suspendido() {
		if(!cocinero.getComidaPreparada()){
			System.out.println("///MODO COCINAR/// \nMcCocinero no puede suspenderse "
					+ "si esta cocinando.");
		}else {
			System.out.println("///MODO COCINAR/// \nMcCocinero pasara a MODO SUSPENDIDO."
					+ "\nGracias por su pedido y que tenga un dia McBurger :)");
			cocinero.asignarNuevoEstado(cocinero.getModoSuspendido());
		}
		
		
	}

	@Override
	public void caminar() {
		System.out.println("///MODO COCINAR/// \nMcCocinero no puede caminar "
				+ "si esta cocinando.");
	}

	@Override
	public void atender() {
		System.out.println("///MODO COCINAR/// \nMcCocinero no te puede atender "
				+ "si esta cocinando.");
		
	}

	@Override
	public void cocinar() {
		if(!cocinero.getComidaPreparada()){
			System.out.println("///MODO COCINAR/// \nMcCocinero comenzara a "
					+ "preparar su comida.");
			cocinero.prepararComida();
		}else {
			System.out.println("///MODO COCINAR/// \nMcCocinero ya ha preparado "
					+ "su pedido.");
		}
		
	}

}
