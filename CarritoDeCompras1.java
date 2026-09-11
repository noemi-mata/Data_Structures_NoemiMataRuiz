public interface CarritoDeCompras1 <T>{

        void agregar(T articulo);
        void pagar();
        void eliminar(T articulo);
        void cancelar();     
        void vaciarCarrito();
        void buscarProducto();
        

}

