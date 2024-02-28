package creacionales.factory_method.ejemplo2;

public class Main {
    public static void main(String[] args) {
        realizarPago();
    }

    private static void realizarPago(){
        Pago pago = FabricaPago.construirPago(TipoPago.BY_GOOGLE);
        pago.formaDePago();
    }
}
