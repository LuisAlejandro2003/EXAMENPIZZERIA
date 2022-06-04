import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pedido {
    private  Scanner teclado = new Scanner(System.in);
    public  List <Pizza> lista = new LinkedList<Pizza>();
    public  List <Cliente> lista2 = new LinkedList<Cliente>();
    Cliente Cliente1  = new Cliente("",0);
   public void levantarPedido(){
       int numeroPizzas;
       String decisionSabor;
       byte opcion;
       CatalogoPizza.mostrarMenu();
       System.out.println("Escriba su especialidad:");
       opcion = teclado.nextByte();
       if (opcion==1){
           System.out.println("Seleccione el numero de pizzas que desea: ");
           opcion = teclado.nextByte();
           switch (opcion){
               case 1: lista.add(new Pizza(1, "Hawaiana" ));
                   break;
               case 2: lista.add(new Pizza(2, "Hawaiana" ));
                   break;
               case 3:  lista.add(new Pizza(3, "Hawaiana" ));
                   break;
           }
       }
       if (opcion==2){
           System.out.println("Seleccione el numero de pizzas que desea: ");
           opcion = teclado.nextByte();
           switch (opcion){
               case 1: lista.add(new Pizza(1, "Peperoni" ));
                   break;
               case 2: lista.add(new Pizza(2, "Peperoni" ));
                   break;
               case 3:  lista.add(new Pizza(3, "Peperoni" ));
                   break;
           }
       }
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
    public void imprimirTicket(){
        for (Pizza lista : lista) {
            System.out.println("Cantidad: "+ lista.getCantidad());
            System.out.println("Sabor: "+ lista.getSabor());
        }


    }
    public void imprimirCliente(){
        System.out.println("Este es el nombre: " + Cliente1.getNombre());
        System.out.println("Este es el numero: "+ Cliente1.getCelular());
    }
}
