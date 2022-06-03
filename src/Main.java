
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main {

    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        byte opcion;
        Pedido objetoPedido=new Pedido();
        Tienda objetoTienda=new Tienda();

        do {

            System.out.println("MENU");    //Menu principal
            System.out.println("1. Levantar pedido");
            System.out.println("2. Ver su orden");
            System.out.print("Selecciona una opcion: ");
            System.out.println("\n-----------------------\n");
            opcion = teclado.nextByte();
            switch (opcion){
                case 1:
                    objetoPedido.levantarPedido();


                    break;
                case 2:
                    objetoPedido.imprimirTicket();



                    break;
                case 3:

                    break;
                case 4:



                   break;



            }
        } while (opcion<5);

    }
}
