import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private  Scanner teclado = new Scanner(System.in);
    public  List <Pizza> lista = new LinkedList<Pizza>();

    Cliente Cliente1  = new Cliente("",0);
    Pizza PizzaHawaiana = new Pizza(0,"hawaiana",178);
    Pizza PizzaPeperoni= new Pizza(0,"peperoni",150);
    public int levantarPedido(){
        int opcion;
        CatalogoPizza.mostrarMenu();
        System.out.println("Escriba su especialidad:");
        opcion = teclado.nextInt();
        if (opcion==1){
            System.out.println("Digite el numero de pizzas que desea: ");
            opcion = teclado.nextInt();
            PizzaHawaiana.setCantidad(opcion);

            System.out.println("Este es el nombre: " + Cliente1.getNombre());
            System.out.println("Este es el numero de telefono: "+ Cliente1.getCelular());

            System.out.println("Eligio este sabor: "+ PizzaHawaiana.getSabor());
            System.out.println("Este es el precio: " + PizzaHawaiana.getPrecio());
            System.out.println("Esta es la cantidad: " + PizzaHawaiana.getCantidad());
        }
        if (opcion==2){

            System.out.println("Digite el numero de pizzas que desea: ");
            opcion = teclado.nextInt();
            PizzaPeperoni.setCantidad(opcion);

            System.out.println("Este es el nombre: " + Cliente1.getNombre());
            System.out.println("Este es el numero de telefono: "+ Cliente1.getCelular());

            System.out.println("Eligio este sabor: "+ PizzaPeperoni.getSabor());
            System.out.println("Este es el precio: " + PizzaPeperoni.getPrecio());
            System.out.println("Este es la cantidad: " + PizzaPeperoni.getCantidad());
        }
        return opcion;

    }
   public void levantarDatosCliente(){
       String nameCliente;
       int numeroCelular;

       System.out.println("Escriba su nombre: ");
       nameCliente=teclado.next();
       Cliente1.setNombre(nameCliente);
       System.out.println("Escriba su celular: ");
       numeroCelular= teclado.nextInt();
       Cliente1.setCelular(numeroCelular);

   }


}
