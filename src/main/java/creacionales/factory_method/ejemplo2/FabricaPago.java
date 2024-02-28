package creacionales.factory_method.ejemplo2;

/*
 * Patrón Factory Method: Se centra en la creación de una clase fábrica, la cual tiene métodos que nos permitan
 * crear objetos de un subtipo determinado.
 * */

public class FabricaPago {
    public static Pago construirPago(TipoPago tipoPago) {
        switch (tipoPago) {
            case BY_GOOGLE:
                return new PagarGoogle();
            case BY_TC:
                return new PagarTC();
            default:
                return new PagarTC();
        }
    }
}
