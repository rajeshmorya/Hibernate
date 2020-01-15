package com.arteck;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="CCARD")
public class CreditCardPayment extends Payment {
	@Column(name="ccnumber")
    private int cardNumer;
    
    @Column(name="cctype",length=10)
    private String cardType;
    public String getCardType() {
        return cardType;
    }
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public int getCardNumer() {
        return cardNumer;
    }
    public void setCardNumer(int cardNumer) {
        this.cardNumer = cardNumer;
    }
	
}
