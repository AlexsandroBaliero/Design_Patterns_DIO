public class EntregaAgendada implements EstrategiaEntrega {

    @Override
    public void entregar(String pedidoId, String descricao) {
        System.out.println("📦 Entregando AGENDADA");
        System.out.println("   Pedido: " + pedidoId);
        System.out.println("   Descrição: " + descricao);
        System.out.println("   Prazo: 14 dias");
    }

    @Override
    public double calcularTaxa() {
        return 5.0;
    }

    @Override
    public int obterPrazo() {
        return 14;
    }
}
