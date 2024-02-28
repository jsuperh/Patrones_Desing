package creacionales.factory_method.ejemplo1;

public class Main {
    public static void main(String[] args) {
        pruebaFactoryMethod();
    }

    private static void pruebaFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
        payment.doPayment();
    }
}
