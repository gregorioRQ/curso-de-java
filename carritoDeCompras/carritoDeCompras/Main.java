package carritoDeCompras;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String nombres[] = { "maní", "mermelada", "pan" };
		double precios[] = { 22.56, 54.21, 31.43 };
		String producto = "";
		double precio = 00.00;

		System.out.println("Bienvenido que desea: ");
		int num = 0;
		for (int i = 0; i < nombres.length; i++) {
			num++;
			System.out.println("* " + num + " => " + nombres[i] + ": " + precios[i] + " Creditos");
		}
		
		//CON UN SWITCH SELECCIONO EL PRODUCTO 
		System.out.println("presione un numero para seleccionar su producto");
		int select = teclado.nextInt();
		String saborElegido = " ";
		
		switch (select) {
		case 1:
			producto = nombres[0];
			precio = precios[0];
			
			//SELECCIONA EL SABOR DEL PRODUCTO
			System.out.println("Que tipo de maní desea:");
			System.out.println("Presione 0 para salado, 1 tostado, 2 agridulce");			
			int accion = teclado.nextInt();
			String[] saboresM = {"salado", "tostado","agridulce"};
			
			if(accion == 1) {				
				saborElegido = saboresM[accion];
				System.out.println("ha seleccionado mani "+ saboresM[accion]+ " ahora...");
			}else if(accion == 2) {
				saborElegido = saboresM[accion];
				System.out.println("ha seleccionado mani "+ saboresM[accion]+ " ahora...");
			}else if(accion == 3) {
				saborElegido = saboresM[accion];
				System.out.println("ha seleccionado mani "+ saboresM[accion]+ " ahora...");
			};
			break;
		case 2:
			producto = nombres[1];
			precio = precios[1];
			
			//SELECCIONA EL SABOR DEL PRODUCTO
			System.out.println("Que sabor de mermelada desea:");
			System.out.println("Presione 0 para naranja, 1 arandanos, 2 damazco");			
			int accion2 = teclado.nextInt();
			String[] saboresMermelada = {"naranja", "arandanos","damazco"};
			
			if(accion2 == 1) {				
				saborElegido = saboresMermelada[accion2];
				System.out.println("ha seleccionado mermelada de "+ saboresMermelada[accion2]+ " ahora...");
			}else if(accion2 == 2) {
				saborElegido = saboresMermelada[accion2];
				System.out.println("ha seleccionado mermelada de "+ saboresMermelada[accion2]+ " ahora...");
			}else if(accion2 == 3) {
				saborElegido = saboresMermelada[accion2];
				System.out.println("ha seleccionado mermelada de  "+ saboresMermelada[accion2]+ " ahora...");
			};
			break;
		case 3:
			producto = nombres[2];
			precio = precios[2];
			break;
		}
			
		System.out.println("Al hacer una compra superior a 200 creditos recibirá un descuento del 15%, entonces...");
		System.out.println("cuantas unidades desea lleva?: ");
		int cantidadP = teclado.nextInt();

		
		Sabor sa = new Sabor(producto, cantidadP, precio, saborElegido);

		ItemCarrito item = new ItemCarrito(sa.nombreP, sa.cantidadP, sa.precioP,
				sa.cantidadP * sa.precioP);

		if (item.itemsPrecioTotal > 200) {
			Descuento compraConDescuento = new Descuento(item.nombreP, item.cantidadP, item.precioP,
					item.itemsPrecioTotal, item.itemsPrecioTotal - (item.itemsPrecioTotal * 0.15));
			double total = compraConDescuento.descuentoP;
			System.out.println("Su producto es: " + item.nombreP +" "+ sa.saborP);
			System.out.println("la cantidad seleccionada fue: " + item.cantidadP + " unidades");
			System.out.println("el precio por unidad es: " + item.precioP);
			System.out.println("el precio total es: " + item.itemsPrecioTotal);
			System.out.println("DESCUENTO APLICADO, el nuevo total a pagar es: " + total);
		} else {
			System.out.println("Su producto es: " + item.nombreP);
			System.out.println("la cantidad seleccionada fue: " + item.cantidadP);
			System.out.println("el precio por unidad es:" + item.precioP);
			System.out.println("el precio total es: " + item.itemsPrecioTotal);
			System.out.println("no hay descuentos disponibles");
		}
	}

}
