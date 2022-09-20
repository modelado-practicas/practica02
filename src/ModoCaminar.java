public class ModoCaminar implements EstadoCocinero {
	Robot cocinero;
	
	public ModoCaminar(Robot cocinero){
		this.cocinero = cocinero;

	}

	@Override
	public void suspendido() {
		if(cocinero.getDistanciaCaminada() > 0){
			System.out.println("///MODO CAMINAR/// \nMcCocinero regresara a su"
					+ " estacion y pasara al MODO SUSPENDIDO.");
			cocinero.setDistanciaCaminada(0);
			cocinero.asignarNuevoEstado(cocinero.getModoSuspendido());
		} else {
			System.out.println("///MODO CAMINAR/// \nMcCocinero pasara al MODO SUSPENDIDO.");
			cocinero.asignarNuevoEstado(cocinero.getModoSuspendido());
		}
		
	}

	@Override
	public void caminar() {
		if(!cocinero.getUbicacionCliente()){
			cocinero.acercarseAlCliente();
			System.out.println("///MODO CAMINAR/// \nMcCocinero se dirige a tu mesa.");
		} else {
			System.out.println("///MODO CAMINAR/// \nMcCocinero ha llegado a tu mesa.");
		}
		
	}

	@Override
	public void atender() {
		if(!cocinero.getUbicacionCliente()){
			System.out.println("///MODO CAMINAR/// \nMcCocinero todavia no ha llegado a tu mesa, "
					+ "por favor intenta seguir llamandolo.");
		}else {
			System.out.println("///MODO CAMINAR/// \n McCocinero pasara al MODO ATENDER para "
					+ "que pueda tomar tu orden");
			cocinero.asignarNuevoEstado(cocinero.getModoAtender());
		}
		
	}

	@Override
	public void cocinar() {
		System.out.println("///MODO CAMINAR/// \nMcCocinero no puede cocinar antes de "
				+ "tomar tu orden.");
	}

}
