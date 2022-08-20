package com.exercicioFactoryPagamento.pagamento.models.valoresDosPagamentos;

public class PagamentoFactory {
    public ICalculoPagamentos calculoPagamentos(String statusPagamento) {
        if (statusPagamento == null) {
            return null;
        } else if (statusPagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {

            return new CalculoDesconto();
        } else if (statusPagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")) {

            return new CalculoAcrescimo();
        }
        return null;
    }
}

