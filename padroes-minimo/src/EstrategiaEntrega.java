/**
 * STRATEGY PATTERN
 * Define diferentes formas de entregar um pedido
 */
public interface EstrategiaEntrega {
    void entregar(String pedidoId, String descricao);
    double calcularTaxa();
    int obterPrazo();
}
