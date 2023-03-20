package tp_4;

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String nombre;
		String apellido;
		int edad;
		System.out.println("ingrese su nombre");
		nombre = sc.nextLine();
		System.out.println("ingrese su apellido");
		apellido = sc.nextLine();
		System.out.println("ingrese su edad");
		edad = sc.nextInt();
		
		int n = 18;
		if(edad > n) {
			System.out.println("hola "+nombre+" "+apellido+" ud es mayor de edad.");
		}else {
			System.out.println("hola "+nombre+" "+apellido+" ud es menor de edad.");
		}
	}

}
