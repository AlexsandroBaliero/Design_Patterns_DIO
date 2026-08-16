public class Main {

    public static void main(String[] args) {
        System.out.println("════════════════════════════════════════════════");
        System.out.println("  Demonstração de Design Patterns em Java");
        System.out.println("════════════════════════════════════════════════\n");

        // Exemplo 1: Entrega EXPRESS
        System.out.println("--- Exemplo 1: Entrega EXPRESS ---");
        EstrategiaEntrega entregaExpress = EntregaFactory.criar("EXPRESS");
        entregaExpress.entregar("PED-001", "Notebook");
        System.out.println("   💰 Taxa: R$ " + entregaExpress.calcularTaxa());
        System.out.println();

        // Exemplo 2: Entrega NORMAL
        System.out.println("--- Exemplo 2: Entrega NORMAL ---");
        EstrategiaEntrega entregaNormal = EntregaFactory.criar("NORMAL");
        entregaNormal.entregar("PED-002", "Mouse");
        System.out.println("   💰 Taxa: R$ " + entregaNormal.calcularTaxa());
        System.out.println();

        // Exemplo 3: Entrega AGENDADA
        System.out.println("--- Exemplo 3: Entrega AGENDADA ---");
        EstrategiaEntrega entregaAgendada = EntregaFactory.criar("AGENDADA");
        entregaAgendada.entregar("PED-003", "Teclado");
        System.out.println("   💰 Taxa: R$ " + entregaAgendada.calcularTaxa());
        System.out.println();

        System.out.println("════════════════════════════════════════════════");
        System.out.println("✅ Demonstração concluída com sucesso!");
        System.out.println("════════════════════════════════════════════════");
    }
}
