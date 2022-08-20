package com.exercicioFactoryRecebimento.recebimento.models.valoresDosRecebimentos;

import java.math.BigDecimal;

public interface ICalculoRecebimentos {
    public BigDecimal calcularRecebimento(BigDecimal valorAReceber);

    BigDecimal calcular(BigDecimal valorAReceber);
}
