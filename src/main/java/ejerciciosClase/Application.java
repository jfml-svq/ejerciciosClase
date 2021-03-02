package ejerciciosClase;

public class Application {
    public static void main(String[] args) {
        CuentaCorriente user1 = new CuentaCorriente("Pepe juan", "11111111N", 50);
        CuentaCorriente user2 = new CuentaCorriente(500, -40 );
        System.out.println(user1.getCuentaCorriente());
        user1.introducirDinero();
        System.out.println(user1.getCuentaCorriente());
        user1.sacarDinero();
        System.out.println(user1.getCuentaCorriente());
    }
}
