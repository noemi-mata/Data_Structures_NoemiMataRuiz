public interface CarritoDeCompras2<N>{

    void agregar(N articulo);
    void eliminar(N articulo);
    void pagar();
    void cancelar();
    void vaciarCarrito ();
    void buscarProducto();
} 