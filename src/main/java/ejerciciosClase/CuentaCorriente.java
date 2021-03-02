package ejerciciosClase;

import java.util.Scanner;

/**
 *•  * Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será 0.
 *•  * Sacar dinero: sólo se podrá sacar dinero hasta el límite marcado para números rojos.
 *•  * Ingresar dinero: se incrementa el saldo
 *• * Mostrar saldo: muestra el saldo disponible
 *
 */

public class CuentaCorriente {

    private String nombre;
    private String dni;
    private int saldo = 0;

    public CuentaCorriente (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;
    }

    public void introducirDinero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce dinero");
        this.saldo = entrada.nextInt();
    }

    public String sacarDinero () {
        int dinero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres sacar");
        dinero = entrada.nextInt();
        if ((this.saldo - dinero) <= 0){
            return "El usuario no tiene dinero suficiente";
        }else{
            this.saldo -= dinero;
            return "El usuario ha retirado" + dinero;
        }
    }

    public String getCuentaCorriente(){
          return "El usuario " + nombre + " tiene " + saldo + " en su cuenta corriente";
    }


}
