import java.util.Scanner;
public class Tienda {
    private static Scanner teclado = new Scanner(System.in);

    public void menuPrincipal(){
        byte opcion;
        Pedido objetoPedido=new Pedido();
        do {
            System.out.println("MENU");    //Menu principal
            System.out.println("1. Levantar pedido");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opcion: ");
            System.out.println("\n-----------------------\n");
            opcion = teclado.nextByte();
            switch (opcion){
                case 1:
                    objetoPedido.levantarDatosCliente();
                    objetoPedido.levantarPedido();
                    break;
                case 2:
                    System.out.println("Fue un placer atenderle");


            }
        } while (opcion< 2);


    }
}
