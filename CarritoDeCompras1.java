import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras1<T> { // Quitamos 'implements Articulo<T>'
    
    private final List<T> articulos = new ArrayList<>();

    public void agregar(T articulo) {
        if (articulo != null) {
            articulos.add(articulo);
            System.out.println("Artículo agregado: " + articulo);
        }
    }

    public void eliminar(T articulo) {
        if (articulos.remove(articulo)) {
            System.out.println("Artículo eliminado del carrito.");
        } else {
            System.out.println("El artículo no se encuentra en el carrito.");
        }
    }
}