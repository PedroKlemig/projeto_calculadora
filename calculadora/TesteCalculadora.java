package calculadora;

/**
 * <p><strong>Classe de Teste: TesteCalculadora</strong></p>
 *
 * <p>Esta classe é responsável por executar testes simples e diretos dos métodos
 * da classe {@link Calculadora}. Através do método {@code main}, diferentes
 * operações matemáticas são executadas para validar o comportamento do sistema
 * e garantir que:</p>
 *
 * <ul>
 *     <li>Os métodos funcionam corretamente para entradas válidas;</li>
 *     <li>Exceções são corretamente lançadas em situações inválidas;</li>
 *     <li>A lógica de seleção de operações (switch expression) responde de forma adequada.</li>
 * </ul>
 *
 * <p>Este código é usado para fins didáticos, servindo como um exemplo de:</p>
 * <ul>
 *     <li>Execução de testes manuais;</li>
 *     <li>Tratamento de exceções;</li>
 *     <li>Uso de métodos da classe Calculadora;</li>
 *     <li>Boas práticas de programação e documentação JavaDoc.</li>
 * </ul>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal responsável pela execução dos testes.
     *
     * <p>Nele são realizadas:</p>
     * <ul>
     *     <li>Chamadas válidas aos métodos da classe {@link Calculadora};</li>
     *     <li>Testes que geram exceções, como divisão por zero e operador inválido;</li>
     *     <li>Impressão dos resultados e das mensagens de erro.</li>
     * </ul>
     *
     * @param args argumentos de linha de comando (não utilizados neste projeto)
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Operações válidas
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        // Teste de exceção: divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de exceção: operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


