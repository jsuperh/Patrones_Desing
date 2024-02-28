package creacionales.factory_method.ejemplo2;

public class PagarTC implements Pago {
    @Override
    public void formaDePago() {
        System.out.println("Usted h pagado usando su Tarjeta de crédito");
    }
}
