import Articulo.java as Articulo;

public interface CarritoDeCompras1 <T> extends Articulo{

        void agregar(T articulo);
        void pagar();
        void eliminar(T articulo);
        void cancelar();     
        void vaciarCarrito();
        void buscarProducto(); 

}
