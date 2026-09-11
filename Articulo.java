public class Articulo {
    private String nombre;
    private int idArticulo;
    private float precio;
    private int cantidad;
    private boolean stock;
    private String categoria;


    public Articulo(float precio, int cantidad, String nombre, int idArticulo, boolean stock,String categoria){
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.idArticulo = idArticulo;
        this.stock = stock;
        this.categoria = categoria;
    }

    //Getters
     public float getPrecio(){
        return precio;
    }

     public int getCantidad(){
        return cantidad;
    }

    public String getNombre() {
        return nombre;
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
}