package carritoDeCompras;

public class Descuento extends ItemCarrito {
    
        double descuentoP;
        public Descuento(String nombreP,int cantidadP, double precioP, double itemsPrecioTotal, double descuentoP){
            super(nombreP, cantidadP, precioP, itemsPrecioTotal);
            this.descuentoP = descuentoP;
        }
}
