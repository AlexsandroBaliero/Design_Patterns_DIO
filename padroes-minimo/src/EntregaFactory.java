public class EntregaFactory {

    public static EstrategiaEntrega criar(String tipo) {
        System.out.println("🏭 Factory criando estratégia: " + tipo);

        return switch (tipo.toUpperCase()) {
            case "EXPRESS" -> new EntregaExpress();
            case "NORMAL" -> new EntregaNormal();
            case "AGENDADA" -> new EntregaAgendada();
            default -> throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        };
    }
}
