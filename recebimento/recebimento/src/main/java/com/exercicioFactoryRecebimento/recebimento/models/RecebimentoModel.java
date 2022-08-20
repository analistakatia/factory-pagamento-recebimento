package com.exercicioFactoryRecebimento.recebimento.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "recebimentos")
public class RecebimentoModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 20, nullable = false)
    private BigDecimal valorAReceber;

    @Column(length = 20, nullable = false)
    private String statusDoRecebimento;

    @Column(name = "valor_do_desconto", length = 10)
    private BigDecimal valorDoDesconto;

    @Column(length = 10, nullable = false)
    private BigDecimal valorFinal;

}
