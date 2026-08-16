# Padrões de Projeto - Simples

Demonstração de **Strategy Pattern** e **Factory Pattern** em Java puro.

## 📂 Arquivos

- `EstrategiaEntrega.java` - Interface (Strategy)
- `EntregaExpress.java` - Estratégia 1
- `EntregaNormal.java` - Estratégia 2
- `EntregaAgendada.java` - Estratégia 3
- `EntregaFactory.java` - Factory
- `Main.java` - Demonstração

## 🚀 Como Compilar e Rodar

```bash
# Compilar
cd src
javac *.java

# Rodar
java Main
```

## 📊 Resultado Esperado

```
════════════════════════════════════════════════
  Demonstração de Design Patterns em Java
════════════════════════════════════════════════

--- Exemplo 1: Entrega EXPRESS ---
🏭 Factory criando estratégia: EXPRESS
📦 Entregando RÁPIDO (EXPRESS)
   Pedido: PED-001
   Descrição: Notebook
   Prazo: 1 dia
   💰 Taxa: R$ 25.0

--- Exemplo 2: Entrega NORMAL ---
🏭 Factory criando estratégia: NORMAL
📦 Entregando NORMAL
   Pedido: PED-002
   Descrição: Mouse
   Prazo: 7 dias
   💰 Taxa: R$ 10.0

--- Exemplo 3: Entrega AGENDADA ---
🏭 Factory criando estratégia: AGENDADA
📦 Entregando AGENDADA
   Pedido: PED-003
   Descrição: Teclado
   Prazo: 14 dias
   💰 Taxa: R$ 5.0

════════════════════════════════════════════════
✅ Demonstração concluída com sucesso!
════════════════════════════════════════════════
```

## 🎨 Padrões Implementados

### Strategy
Cada tipo de entrega é uma estratégia diferente:
```java
EstrategiaEntrega estrategia = new EntregaExpress();
estrategia.entregar("PED-001", "Notebook");
```

### Factory
Factory cria a estratégia apropriada:
```java
EstrategiaEntrega estrategia = EntregaFactory.criar("EXPRESS");
```

---

**Bootcamp Santander 2026**
