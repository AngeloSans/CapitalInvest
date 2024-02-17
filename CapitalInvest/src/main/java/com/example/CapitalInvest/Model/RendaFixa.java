package com.example.CapitalInvest.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class RendaFixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "Investimento")
    private String investimento;

    @Column(name = "dataInvestimento")
    private LocalDate dataInvestimento;

    @Column(name = "valorInvestido")
    private BigDecimal valorInvestido;

    @Column(name = "taxaJurosAnual")
    private double taxaJurosAnual;

    @Column(name = "prazoMes")
    private int prazoMes;

}
