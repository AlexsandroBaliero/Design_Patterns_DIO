public class EntregaNormal implements EstrategiaEntrega {

    @Override
    public void entregar(String pedidoId, String descricao) {
        System.out.println("📦 Entregando NORMAL");
        System.out.println("   Pedido: " + pedidoId);
        System.out.println("   Descrição: " + descricao);
        System.out.println("   Prazo: 7 dias");
    }

    @Override
    public double calcularTaxa() {
        return 10.0;
    }

    @Override
    public int obterPrazo() {
        return 7;
    }
}
