
    public class MiniIteracionXP {

        private static final double ENVIO_NORMAL = 100.0;
        private static final double ENVIO_REDUCIDO = 50.0;
        private static final double ENVIO_GRATIS = 0.0;

            public static void main(String[] args) {
                ejecutarPruebas();
            }

        public static double calcularCostoEnvio(double importePedido, boolean premium) {
            if (premium) {
                return ENVIO_GRATIS;
            }

            if (importePedido >= 1000.0) {
                return ENVIO_GRATIS;
            }

            if (importePedido >= 500.0) {
                return ENVIO_REDUCIDO;
            }

            return ENVIO_NORMAL;
        }

            private static void ejecutarPruebas() {
                System.out.println("--- Ejecutando Pruebas ---");

                probar("Pedido $499.99", calcularCostoEnvio(499.99, false) == 100.0);
                probar("Pedido $500.00", calcularCostoEnvio(500.00, false) == 50.0);
                probar("Pedido $999.99", calcularCostoEnvio(999.99, false) == 50.0);
                probar("Pedido $1000.00", calcularCostoEnvio(1000.00, false) == 0.0);
                probar("Cliente Premium", calcularCostoEnvio(200.00, true) == 0.0);
            }

            private static void probar(String caso, boolean resultado) {
                if (resultado) {
                    System.out.println("[PASS] " + caso);
                } else {
                    System.out.println("[FAIL] " + caso);
                }
            }
        }



