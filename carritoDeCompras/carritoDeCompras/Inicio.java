package carritoDeCompras;
import java.util.*;
public class Inicio {
	public void ui() {
		Scanner teclado = new Scanner(System.in);
		boolean permiso = false;
		int opcion = 0;
		
		do {
		try {
		System.out.println("Bienvenido");
		System.out.println("Interactue con el registro de clientes:");
		System.out.println("Presione 1 para añadir un cliente; 2 para ver los clientes; 3 para eliminar uno");
		opcion = teclado.nextInt();
		permiso = false;
		}catch(java.util.InputMismatchException ex) {
			System.out.println("No se aceptan caracters sólo enteros");
			teclado.next();
			permiso = true;
		}
		}while(permiso == true || opcion > 3);
		
		Operaciones opElegida = new Operaciones();
		int op = opcion;
		if(op == 1) {			
			opElegida.agregarCliente();
		}else if(op == 2) {
			opElegida.mostrarClientes();
		}else if(op == 3) {
			opElegida.eliminarCliente();
		}
	}
}
