package tp_4;

import java.util.Scanner;
public class Ejercicio3 {
		// TODO Auto-generated method stub
		Scanner escaner = new Scanner(System.in);
		public void compraproducto(){
		String nproducto = "";   
		double precio, total; 	
		double totalpagar = 0;
		int cantidad;
		
		
		System.out.println("Ingrese el nombre del producto");  
		nproducto = escaner.next();			
		System.out.println("Ingreso el precio del producto");
		precio = escaner.nextDouble();
		System.out.println("Ingreso la cantidad");
		cantidad = escaner.nextInt();
		total = precio * cantidad;
		
		System.out.println("El total es : " + total); 
			if(total > 1000){ 
				System.out.println("El descuento es de: "+ total*0.20);  
				totalpagar = total - (total*0.20); 
				System.out.println("El precio total es : "+totalpagar);
			}else{ 
				System.out.println("No hay descuentos"); 
			}
	}

	

		public void seccion ( ) {  
			Scanner escaner = new Scanner(System.in);
			String cliente;
			System.out.println("Ingreso el nombre del cliente");
			cliente = escaner.next(); 
	  
			System.out.println("Ingrese el nombre de la sección de productos(en minusculas): ");  
			String opcion =" "; 
	  
			System.out.println("Frutas"); 
			System.out.println("Lacteos");
			System.out.println("Gaseosas");
	  
			opcion = escaner.next(); 
				switch(opcion) {   
					case "frutas":  compraproducto();  break;
					case "lacteos":  compraproducto();  break;
	  				case "gaseosas":  compraproducto();  break;
				}
	}
	
	public static void main (String []args){
		Ejercicio3 cp = new Ejercicio3();  
		cp.seccion();
	}
}
