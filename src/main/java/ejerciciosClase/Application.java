package ejerciciosClase;

public class Application {
    public static void main(String[] args) {
        CuentaCorriente user1 = new CuentaCorriente("Pepe juan", "11111111N", 50);
        CuentaCorriente user2 = new CuentaCorriente(500);

        CuentaCorriente user3 = new CuentaCorriente("f10000000",500, 50);
        System.out.println(user1.getCuentaCorriente());
        user1.introducirDinero();
        System.out.println(user1.getCuentaCorriente());
        user1.sacarDinero();
        System.out.println(user1.getCuentaCorriente());

    }
}
