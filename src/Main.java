import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        System.out.println("--Bienvenido a McBurguer--"
				+ "\nPor registra un numero de usuario y nosotros te "
				+ "asignaremos una mesa.");
        
        Scanner sc = new Scanner(System.in);
		int id;
		
		while (true){
			try {
				String idUsuario = sc.nextLine();
				id = Integer.parseInt(idUsuario);
				break;
			}catch (NumberFormatException ex){
				System.out.println("Por favor ingrese un numero.");
			}
		}
		
		Random r = new Random();
		int mesa = r.nextInt(4)+1;
		 
		System.out.println("Se le ha asignado la mesa: " + mesa);
		
		Robot arisa = new Robot(id, mesa);
		
		int opcion;
		
		System.out.println("Bienvenido usuario " + id + ", yo soy McCocinero"
				+ " y estoy para atenderte."
				+ "\n Por favor elige la opcion que deseas ejeutar.");
		
		do{
			System.out.println(
				"\n1.- Llamar al cocinero.\n" +
				"2.- Atender.\n" + 
				"3.- Cocinar.\n" + 
				"4.- Suspenderse.\n" +
				"0.- Terminar simulacion.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
<<<<<<< HEAD
						System.out.println("Por favor elige la opcion VALIDA\n\n"
=======
						System.out.println("Por favor elige la opcion VALIDA\n "
>>>>>>> b4846040470f3d158c5f4c03bd06e4357c878967
							+"1.- Llamar al cocinero.\n" +
							"2.- Atender.\n" + 
							"3.- Cocinar.\n" + 
							"4.- Suspenderse.\n" +
							"0.- Terminar simulacion.\n");
					}
				}

				switch(opcion){
					case 1:
						arisa.llamarAlCocinero();
						break;

					case 2:
						arisa.atender();
						break;

					case 3:
						arisa.cocinar();
						break;

					case 4:
						arisa.suspenderse();
						break;

					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);
    }
}
