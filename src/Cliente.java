package preparacion;

public class Cliente {
	private int idCliente;
	private int distanciaMesa;
	
	
	public Cliente(int idCliente, int distanciaMesa){
		this.idCliente = idCliente;
		this.distanciaMesa = distanciaMesa;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getDistanciaMesa() {
		return distanciaMesa;
	}
	
	public void setDistanciaMesa(int distanciaMesa) {
		this.distanciaMesa = distanciaMesa;
	}
	
	
	
	

}
