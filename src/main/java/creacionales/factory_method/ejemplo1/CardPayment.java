package creacionales.factory_method.ejemplo1;

public class CardPayment implements Payment{
    @Override
    public void doPayment() {
            System.out.println("Pagando con Tarjeta de Credito");
    }
}
