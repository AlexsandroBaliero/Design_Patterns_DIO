public interface EstrategiaEntrega {
    void entregar(String pedidoId, String descricao);
    double calcularTaxa();
    int obterPrazo();
}
