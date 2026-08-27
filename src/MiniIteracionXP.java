
    public class MiniIteracionXP {

        public static void main(String[] args) {
            ejecutarPruebas();
        }

        // Lógica del negocio (Simple Design + Refactoring)
        public static double calcularCostoEnvio(double importePedido) {
            if (importePedido >= 1000.0) {
                return 0.0; // Gratis
            }
            if (importePedido >= 500.0) {
                return 50.0;
            }
            return 100.0;
        }

        // Simulación de pruebas unitarias (TDD)
        private static void ejecutarPruebas() {
            System.out.println("--- Ejecutando Pruebas Unitarias ---");

            probar("Menos de $500 ($499.99)", calcularCostoEnvio(499.99) == 100.0);
            probar("Entre $500 y $999.99 ($500.00)", calcularCostoEnvio(500.00) == 50.0);
            probar("Entre $500 y $999.99 ($750.00)", calcularCostoEnvio(750.00) == 50.0);
            probar("Entre $500 y $999.99 ($999.99)", calcularCostoEnvio(999.99) == 50.0);
            probar("$1,000 o más ($1000.00)", calcularCostoEnvio(1000.00) == 0.0);
            probar("$1,000 o más ($1500.00)", calcularCostoEnvio(1500.00) == 0.0);
        }

        private static void probar(String caso, boolean resultadoEsperado) {
            if (resultadoEsperado) {
                System.out.println("[PASS] " + caso);
            } else {
                System.out.println("[FAIL] " + caso);
            }
        }
    }

}
