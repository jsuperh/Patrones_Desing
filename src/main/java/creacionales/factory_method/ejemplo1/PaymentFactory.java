package creacionales.factory_method.ejemplo1;

/*
 * Patrón Factory Method: Se centra en la creación de una clase fábrica, la cual tiene métodos que nos permitan
 * crear objetos de un subtipo determinado.
 * */

public class PaymentFactory {
    public static Payment buildPayment (TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
