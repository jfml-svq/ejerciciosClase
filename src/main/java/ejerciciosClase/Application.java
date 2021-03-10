package ejerciciosClase;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int selector;
        do {
            System.out.println("1: Añador nuevo usuario:");
            System.out.println("2: Meter dinero:");
            System.out.println("3: Sacar dinero");
            System.out.println("4: Ver datos de usuario:");
            System.out.println("0: Salir");
            selector = entrada.nextInt();
            switch (selector) {
                case 0:
                    break;
                case 1:
                    System.out.println("caso 1");
                    break;
                case 2:
                    System.out.println("caso 2");
                    break;
                case 3:
                    System.out.println("caso 3");
                    break;
                case 4:
                    System.out.println("caso 4");
                    break;
                default:
                    System.out.println("No existe esta opcion");
            }
        } while (selector != 0);
        System.out.println("Has salido del programa, chao!");
    }
}
