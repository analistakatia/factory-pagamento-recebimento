package com.exercicioFactoryPagamento.pagamento.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pagamentos")
public class PagamentoModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 20, nullable = false)
    private BigDecimal valorAPagar;

    @Column(length = 20, nullable = false)
    private String statusDoPagamento;

    @Column(name = "valor_do_desconto", length = 10)
    private BigDecimal valorDoDesconto;

    @Column(name = "valor_do_acrescimo", length = 10)
    private BigDecimal valorDoAcrescimo;

    @Column(name = "valor_final", length = 10)
    private BigDecimal valorFinal;
}
