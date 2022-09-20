package preparacion;

public class ModoSuspendido implements EstadoCocinero{
	Robot cocinero;
	
	public ModoSuspendido(Robot cocinero){
		this.cocinero = cocinero;
	}

	@Override
	public void suspendido() {
		System.out.println("///MODO SUSPENDIDO/// \n McCocinero ya se encuentra SUSPENDIDO");
	}

	@Override
	public void caminar() {
		if(cocinero.getOrdenRecibida() && cocinero.getUbicacionCliente() 
				&& cocinero.getPedidoTomado() && cocinero.getComidaPreparada()){
				System.out.println("///MODO SUSPENDIDO/// \n McCocinero ya ha terminado "
						+ "de preparar su pedido.");
			} else {
				System.out.println("///MODO SUSPENDIDO/// \nMcCocinero ha sido ACTIVADO"
						+ "\n McCocinero pasara al MODO CAMINAR");
				cocinero.ingresarOrden();
				cocinero.asignarNuevoEstado(cocinero.getModoCaminar());
			}
	}

	@Override
	public void atender() {
		if(cocinero.getOrdenRecibida() && cocinero.getUbicacionCliente() 
				&& cocinero.getPedidoTomado() && cocinero.getComidaPreparada()){
				System.out.println("///MODO SUSPENDIDO/// \n McCocinero ya ha terminado "
						+ "de preparar su pedido.");
			} else {
				System.out.println("///MODO SUSPENDIDO/// \n McCocinero no puede "
						+ "atendenterte si se encuentra suspendido");
			}
	}

	@Override
	public void cocinar() {
		if(cocinero.getOrdenRecibida() && cocinero.getUbicacionCliente() 
				&& cocinero.getPedidoTomado() && cocinero.getComidaPreparada()){
				System.out.println("///MODO SUSPENDIDO/// \n McCocinero ya ha terminado "
						+ "de preparar su pedido.");
			} else {
				System.out.println("///MODO SUSPENDIDO/// \n McCocinero no puede "
						+ "cocinar si se encuentra suspendido");
			}
	}
}
