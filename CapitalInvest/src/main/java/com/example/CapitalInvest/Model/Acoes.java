package com.example.CapitalInvest.Model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Acoes")
public class Acoes {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInvestimento() {
        return investimento;
    }

    public void setInvestimento(String investimento) {
        this.investimento = investimento;
    }

    public LocalDate getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(LocalDate dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    public BigDecimal getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(BigDecimal valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public int getPrazoMes() {
        return prazoMes;
    }

    public void setPrazoMes(int prazoMes) {
        this.prazoMes = prazoMes;
    }
}
