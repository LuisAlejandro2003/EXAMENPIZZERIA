public class Cliente {
    private String nombre;
    private int celular;

    public Cliente(String nombre , int celular) {
        this.nombre=nombre;
        this.celular=celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
