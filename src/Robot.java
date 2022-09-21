public class Robot {
	private boolean ordenRecibida;
	private Cliente clienteAAtender;
	private boolean ubicacionCorrecta;
	private boolean menusLeidos;
	private boolean pedidoTomado;
	private boolean comidaPreparada;
	private int distanciaCaminada;
	
	
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
		menusLeidos = false;
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
		return pedidoTomado;
	}
	
	public boolean getComidaPreparada() {
		if (pedidoTomado == true && (estadoActual == modoCocinar || estadoActual == modoSuspendido)) {
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
	
	private void printMenu(Iterator it){
		while(it.hasNext()){
			Hamburguesa platillo = it.next();
			System.out.println(platillo.toString());
		}
	}

	public void leerMenus() {
		Menu menuGeneral = new MenuGeneral();
		Menu menuPorDia = new MenuPorDia();
		Menu menuEspecial = new MenuEspecial();

		Iterator itMenuGeneral= menuGeneral.createIterator();
		Iterator itMenuPorDia= menuPorDia.createIterator();
		Iterator itmenuEspecial= menuEspecial.createIterator();

		printMenu(itMenuGeneral);
		printMenu(itMenuPorDia);
		printMenu(itmenuEspecial);
		
		menusLeidos = true;
	}
	
	public void setComidaACocinar(Hamburguesa pedido) {
		comidaACocinar = pedido;
	}
	private Hamburguesa buscarHamburguesa(Iterator it, int id){
		Hamburguesa hamburguesa = null;
		while(it.hasNext()){
			Hamburguesa platillo = it.next();
			if(platillo.getId() == id){
				hamburguesa = platillo;
				break;
			}
		}
		return hamburguesa;
	}

	public String tomarPedido(int id) {
		Menu menuGeneral = new MenuGeneral();
		Menu menuPorDia = new MenuPorDia();
		Menu menuEspecial = new MenuEspecial();

		Iterator itMenuGeneral= menuGeneral.createIterator();
		Iterator itMenuPorDia= menuPorDia.createIterator();
		Iterator itmenuEspecial= menuEspecial.createIterator();

		comidaACocinar = null;
		comidaACocinar = buscarHamburguesa(itMenuGeneral, id);
		if(comidaACocinar == null){
			comidaACocinar = buscarHamburguesa(itMenuPorDia, id);
		}
		if(comidaACocinar == null){
			comidaACocinar = buscarHamburguesa(itmenuEspecial, id);
		}
		if(comidaACocinar != null){
			pedidoTomado = true;
			return ("Has escogido " + comidaACocinar.nombre());
		}else{
			return "Opcion invalida";
		}
		
		
	}
	
	public void prepararComida() {
		comidaACocinar.prepararHamburguesa(); 
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
