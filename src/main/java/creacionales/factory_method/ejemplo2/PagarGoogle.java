package creacionales.factory_method.ejemplo2;

public class PagarGoogle implements Pago {
    @Override
    public void formaDePago() {
        System.out.println("Usted ha pagado usando su cuenta Google");

    }
}
