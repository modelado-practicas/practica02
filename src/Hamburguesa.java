import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase abstracta que sirve
 * como base de una hamburguesa de manera general
 */

public abstract class Hamburguesa {
	
	private int id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private boolean queso;
    private boolean vegetariano;

	public Hamburguesa(int id, String nombre, String descripcion, Double precio, boolean queso, boolean vegetariano) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.queso = queso;
		this.vegetariano = vegetariano;
	}

	/**
     * Metodo que regresa la descripcion completa de la
     * preparacion de nuestra hamburguesa
     */
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
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + " esta "
				+ "lista.");
	}
	
	/**
     * Metodo asbracto para ingresar el nombre de la hamburguesa
     */
	public abstract String nombre();
	
	/**
     * Metodo para poner pan a nuestra hamburguesa
     */
	public void ponerPan() {
		System.out.println("Poniendo pan.");
	}
	
	/**
     * Metodo para poner mayonesa a nuestra hamburguesa si el cliente lo desea
     */
	public void ponerMayonesa() {
		System.out.println("Quieres mayonesa en "
				+ "tu hamburguesa (s/n)?");     
		String respuesta = obtenerRespuestaUsuario();
		
		if (respuesta.toLowerCase().startsWith("s")) {
			System.out.println("Poniendo mayonesa."); 
		}
	}
	
	
	/**
     * Metodo para poner mostaza a nuestra hamburguesa si el cliente lo desea
     */
	public void ponerMostaza() {
		System.out.println("Quieres mostaza en "
				+ "tu hamburguesa (s/n)?");
		String respuesta = obtenerRespuestaUsuario();
		
		if (respuesta.toLowerCase().startsWith("s")) {
			System.out.println("Poniendo mostaza.");;
		}
	}
	
	
	/**
     * Metodo asbracto para definir como se prepara la carne de la hamburguesa
     */
	public abstract void prepararCarne();
	
	
	/**
     * Metodo para poner la carne ya preparada a la hamburguesa
     */
	void ponerCarne() {
		System.out.println("Poniendo carne.");
	}
	
	/**
     * Metodo asbracto para poner el queso que ira en la hamburguesa
     */
	public abstract void ponerQueso();
	
	
	/**
     * Metodo asbracto para poner los vegetales que van en la hamburguesa
     */
	public abstract void ponerVegetales();
	
	
	/**
     * Metodo para poner catsup a nuestra hamburguesa si el cliente lo desea
     */
	public void ponerCatsup() {
		System.out.println("Quieres catsup en "
				+ "tu hamburguesa (s/n)?");
		String respuesta = obtenerRespuestaUsuario();
		
		if (respuesta.toLowerCase().startsWith("s")) {
			System.out.println("Poniendo catsup.");;
		}
	}

	
	
	/**
     * Metodo auxiliar para recibir las respuestas del cliente.
     */
	private String obtenerRespuestaUsuario() {
		String respuesta = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			respuesta = in.readLine();
		} catch (IOException ioe) {
			System.err.println("Ocurrio un error tratando de "
					+ "recibir tu respuesta");
		}
		if (respuesta == null) {
			return "no";
		}
		return respuesta;
	}

	@Override
	public String toString() {
		return ""+id+".- "+nombre+", "+precio+", "+descripcion;
	}

	public int getId() {
		return id;
	}
}
