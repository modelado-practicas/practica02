package preparacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Hamburguesa {
	
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
		ponerCatsup();
		ponerPan();
		System.out.println("La " + nombre() + " esta "
				+ "lista.");
	}
	
	public abstract String nombre();
	
	public void ponerPan() {
		System.out.println("Poniendo pan");
	}
	
	public void ponerMayonesa() {
		System.out.println("Quieres mayonesa en "
				+ "tu hamburguesa (s/n)?");
		String respuesta = obtenerRespuestaUsuario();
		
		if (respuesta.toLowerCase().startsWith("s")) {
			System.out.println("Poniendo mayonesa");;
		}
	}
	
	public void ponerMostaza() {
		System.out.println("Quieres mostaza en "
				+ "tu hamburguesa (s/n)?");
		String respuesta = obtenerRespuestaUsuario();
		
		if (respuesta.toLowerCase().startsWith("s")) {
			System.out.println("Poniendo mostaza");;
		}
	}
	
	public abstract void prepararCarner();
	
	void ponerCarne() {
		System.out.println("Poniendo carne");
	}
	
	public abstract void ponerQueso();
	
	public abstract void ponerVegetales();
	
	public void ponerCatsup() {
		System.out.println("Quieres catsup en "
				+ "tu hamburguesa (s/n)?");
		String respuesta = obtenerRespuestaUsuario();
		
		if (respuesta.toLowerCase().startsWith("s")) {
			System.out.println("Poniendo catsup");;
		}
	}

	
	
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
}
