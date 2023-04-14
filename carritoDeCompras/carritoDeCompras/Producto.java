package carritoDeCompras;


public class Producto {
	String nombreP;	
	int cantidadP;
	double precioP;
	
	public Producto(String nombreP, int cantidadP , double precioP) {
		this.nombreP = nombreP;	
		this.cantidadP = cantidadP;
		this.precioP = precioP;
	}
}
	
	class Sabor extends Producto{
		String saborP;
		//constructor
		
	public Sabor(String nombreP, int cantidadP, double precioP, String saborP) {
		super(nombreP,cantidadP, precioP);
		this.saborP = saborP;
	}
}

