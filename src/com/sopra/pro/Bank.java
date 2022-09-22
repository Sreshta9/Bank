package com.sopra.pro;

public class Bank {
private int bankId;
private String bankName;
private String accNo;
public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public Bank(int bankId, String bankName, String accNo) {
	super();
	this.bankId = bankId;
	this.bankName = bankName;
	this.accNo = accNo;
}
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", accNo=" + accNo + "]";
}

}
