public class Pizza {

    int cantidad;

    int precio;
    String sabor;
    public Pizza(int cantidad , String sabor, int precio){
        this.cantidad=cantidad;
        this.sabor=sabor;
        this.precio=precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
