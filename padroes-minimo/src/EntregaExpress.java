public class EntregaExpress implements EstrategiaEntrega {

    @Override
    public void entregar(String pedidoId, String descricao) {
        System.out.println("📦 Entregando RÁPIDO (EXPRESS)");
        System.out.println("   Pedido: " + pedidoId);
        System.out.println("   Descrição: " + descricao);
        System.out.println("   Prazo: 1 dia");
    }

    @Override
    public double calcularTaxa() {
        return 25.0;
    }

    @Override
    public int obterPrazo() {
        return 1;
    }
}
