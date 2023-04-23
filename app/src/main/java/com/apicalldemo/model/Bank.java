package com.apicalldemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bank {

@SerializedName("cardExpire")
@Expose
private String cardExpire;
@SerializedName("cardNumber")
@Expose
private String cardNumber;
@SerializedName("cardType")
@Expose
private String cardType;
@SerializedName("currency")
@Expose
private String currency;
@SerializedName("iban")
@Expose
private String iban;

public String getCardExpire() {
return cardExpire;
}

public void setCardExpire(String cardExpire) {
this.cardExpire = cardExpire;
}

public String getCardNumber() {
return cardNumber;
}

public void setCardNumber(String cardNumber) {
this.cardNumber = cardNumber;
}

public String getCardType() {
return cardType;
}

public void setCardType(String cardType) {
this.cardType = cardType;
}

public String getCurrency() {
return currency;
}

public void setCurrency(String currency) {
this.currency = currency;
}

public String getIban() {
return iban;
}

public void setIban(String iban) {
this.iban = iban;
}

}