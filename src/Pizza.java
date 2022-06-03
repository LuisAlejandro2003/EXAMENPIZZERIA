public class Pizza {

    int cantidad;
    String sabor;
    public Pizza(int cantidad , String sabor){
        this.cantidad=cantidad;
        this.sabor=sabor;
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
}
