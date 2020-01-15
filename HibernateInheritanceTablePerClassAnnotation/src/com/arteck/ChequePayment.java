package com.arteck;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="CHQ") 
public class ChequePayment extends Payment{

	@Column(name="chqnumber")
    private int chequeNumber;
    
    @Column(name="chtype",length=10)
    private String chequeType;
    public String getChequeType() {
        return chequeType;
    }
    public void setChequeType(String chequeType) {
        this.chequeType = chequeType;
    }
    public int getChequeNumber() {
        return chequeNumber;
    }
    public void setChequeNumber(int chequeNumber) {
        this.chequeNumber = chequeNumber;
    } 

	
}
