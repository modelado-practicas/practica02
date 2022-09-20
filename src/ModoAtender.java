public class ModoAtender implements EstadoCocinero{
	Robot cocinero;
	
	public ModoAtender(Robot cocinero){
		this.cocinero = cocinero;

	}

	@Override
	public void suspendido() {
		System.out.println("///MODO ATENDER/// \nMcCocinero no puede suspenderse "
				+ "si te esta atendiendo.");
		
	}

	@Override
	public void caminar() {
		System.out.println("///MODO ATENDER/// \nMcCocinero no puede caminar "
				+ "si te esta atendiendo.");
		
	}

	@Override
	public void atender() {
		if(!cocinero.getPedidoTomado()){
			cocinero.leerMenus();
			System.out.println("///MODO ATENDER/// \nPor favor dile a McCocinero que deseas.");
			cocinero.tomarPedido();
			System.out.println("McCocinero ha tomado tu pedido.");
		} else {
			System.out.println("///MODO ATENDER/// \nMcCocinero ya ha tomado tu pedido."
					+ " Intenta pedirle que lo cocine.");
		}
		
	}

	@Override
	public void cocinar() {
		if(!cocinero.getPedidoTomado()){
			System.out.println("///MODO ATENDER/// \nMcCocinero no puede cocinar si no tiene "
					+ "tu orden. Intenta pedirle que te atienda.");
		}else {
			System.out.println("///MODO ATENDER/// \nMcCocinero pasara al MODO COCINAR.");
			cocinero.asignarNuevoEstado(cocinero.getModoCocinar());
		}
	}

}
