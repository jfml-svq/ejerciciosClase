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
    private double saldo = 0;
    private int limite;

    public CuentaCorriente(String pepe_juan, String s, int limite){
        this.nombre = nombre;
        this.dni = dni;
        this.limite = this.limite;
        saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
        limite = 0;
    }

    public CuentaCorriente (String dni, int saldo, int limite) {
        this.dni = dni;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void introducirDinero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce dinero");
        this.saldo = entrada.nextInt();
    }

    public String sacarDinero () {
        int dinero;
        this.limite = limite;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres sacar");
        dinero = entrada.nextInt();
        if ((this.saldo - dinero) <= limite){
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
