package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private int riskFactor;

    @Column(nullable = false)
    private int total;

    @Column(nullable = false)
    private long clientId;

    protected Portfolio() {

    }

    public Portfolio(String portfolioName, int riskFactor, int total, long clientId) {
        this.portfolioName = portfolioName;
        this.riskFactor = riskFactor;
        this.total = total;
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public int getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(int riskFactor) {
        this.riskFactor = riskFactor;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
}