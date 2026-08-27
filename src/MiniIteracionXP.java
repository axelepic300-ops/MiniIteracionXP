
    public class MiniIteracionXP {


            public static void main(String[] args) {
                ejecutarPruebas();
            }

            public static double calcularCostoEnvio(double importePedido) {
                return 0.0;
            }

            private static void ejecutarPruebas() {
                System.out.println("--- Ejecutando Pruebas ---");

                probar("Pedido $499.99", calcularCostoEnvio(499.99) == 100.0);
                probar("Pedido $500.00", calcularCostoEnvio(500.00) == 50.0);
                probar("Pedido $999.99", calcularCostoEnvio(999.99) == 50.0);
                probar("Pedido $1000.00", calcularCostoEnvio(1000.00) == 0.0);
            }

            private static void probar(String caso, boolean resultado) {
                if (resultado) {
                    System.out.println("[PASS] " + caso);
                } else {
                    System.out.println("[FAIL] " + caso);
                }
            }
        }



