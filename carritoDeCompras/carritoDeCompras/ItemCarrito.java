package carritoDeCompras;

public class ItemCarrito extends Producto{
	double itemsPrecioTotal;
	
	public ItemCarrito(String nombreP,int cantidadP,double precioP, double itemsPrecioTotal){
		super(nombreP,cantidadP, precioP);
		this.itemsPrecioTotal = itemsPrecioTotal;
	}
}
