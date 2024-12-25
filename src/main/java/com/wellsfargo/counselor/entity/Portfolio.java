package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long clientId;

    @Id
    @GeneratedValue()
    private long portfolioId;


    @Column(nullable = false)
    private long portfoliold;

    @Column(nullable = false)
    private long creationDate;
    

    protected Portfolio() {

    }

    public Portfolio(long creationDate, long clientId, long portfolioId , long creationDate) {

        this.creationDate = creationDate;
        this.clientId = clientId;
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
        
    }

    public Long getClientId() {
        return clientId;
    }
    

    public void setclientId(){
        this.clientId = clientId;
    }

    public Long getportfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(){
        this.portfolioId=portfolioId;
    }
    
    public Long getcreationDate() {
        return creationDate;
    }
    public void setcreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }


    
}
