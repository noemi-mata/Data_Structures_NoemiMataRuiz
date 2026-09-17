public class articulo {
    private  int idArticulo;
    private float precio;
    private int cantidad;
    private boolean stock;
    private String categoria;

    public articulo(int idArticulo, float precio, int cantidad, boolean stock, String categoria){
        this.idArticulo = idArticulo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
        this.categoria = categoria;
    }


    
    public int getIdArticulo() {
        return idArticulo;
    }


    public boolean isStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
