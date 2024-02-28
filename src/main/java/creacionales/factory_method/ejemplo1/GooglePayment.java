package creacionales.factory_method.ejemplo1;

public class GooglePayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
