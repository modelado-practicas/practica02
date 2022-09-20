package preparacion;


public class Robot {
	private boolean ordenRecibida;
	private Cliente clienteAAtender;
	private boolean ubicacionCorrecta;
	private boolean pedidoTomado;
	private boolean comidaPreparada;
	private int distanciaCaminada;
	
	private Menu menusALeer;
	private Hamburguesa comidaACocinar;
	
	private EstadoCocinero estadoActual;
	
	private EstadoCocinero modoSuspendido;
	private EstadoCocinero modoCaminar;
	private EstadoCocinero modoAtender;
	private EstadoCocinero modoCocinar;
	
	
	
	public Robot(int idCliente, int mesa){
		ordenRecibida = false;
		Cliente comensal = new Cliente(idCliente,mesa);
		clienteAAtender = comensal;
		ubicacionCorrecta = false;
		pedidoTomado = false;
		comidaPreparada = false;
		distanciaCaminada = 0;
		

		modoSuspendido = new ModoSuspendido(this);
		modoCaminar = new ModoCaminar(this);
		modoAtender = new ModoAtender(this);
		modoCocinar = new ModoCocinar(this);

		estadoActual = modoSuspendido;
		
	}
	
	
		
	public void ingresarOrden(){
		System.out.println("Captando orden...");
		recibirOrdenCliente();
		System.out.println("Orden recibida exitosamente");
	}
	
	private void recibirOrdenCliente(){
		ordenRecibida = true;
	}
	
	public boolean getOrdenRecibida(){
		return ordenRecibida;
	}
	
	public boolean getUbicacionCliente(){
		if(clienteAAtender.getDistanciaMesa() != distanciaCaminada){
			return ubicacionCorrecta;
		}
		else{
			ubicacionCorrecta = true;
			return ubicacionCorrecta;
		}
	}
	
	public boolean getPedidoTomado(){
		if(clienteAAtender.getIdCliente() != id) {
			return pedidoTomado;
		}
		else {
			pedidoTomado = true;
			return pedidoTomado;
		}
	}
	
	public boolean getComidaPreparada() {
		if (pedidoTomado == true && estadoActual == modoCocinar) {
			return comidaPreparada;
		}
		else {
			comidaPreparada = false;
			return comidaPreparada;
		}
	}
	
	
	public Cliente getCliente(){
		return clienteAAtender;
	}
	
	public int getDistanciaCaminada() {
		return distanciaCaminada;
	}
	
	public void setDistanciaCaminada(int caminado) {
		this.distanciaCaminada = caminado;
	}
	
	public void acercarseAlCliente(){
		setDistanciaCaminada(getDistanciaCaminada() + 1);;
	}
	
	public void tomarPedido() {
		
	}
	
	public void prepararComida() {
		Hamburguesa burger = new ; 
		burger.prepararHamburguesa();
		comidaPreparada = true;
	}
	
	public void asignarNuevoEstado(EstadoCocinero nuevoEstado){
		estadoActual = nuevoEstado;
	}
	
	public void llamarAlCocinero(){
		estadoActual.caminar();
	}
	
	public void atender(){
		estadoActual.atender();
	}
	
	public void cocinar(){
		estadoActual.cocinar();
	}
	
	public void suspenderse(){
		estadoActual.suspendido();
	}


	public EstadoCocinero getModoSuspendido() {
		return modoSuspendido;
	}


	public EstadoCocinero getModoCaminar() {
		return modoCaminar;
	}


	public EstadoCocinero getModoAtender() {
		return modoAtender;
	}


	public EstadoCocinero getModoCocinar() {
		return modoCocinar;
	}
	

}