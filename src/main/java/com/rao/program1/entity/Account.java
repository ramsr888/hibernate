
package com.rao.program1.entity;

import java.io.Serializable;

public class Account implements Serializable {
	
	private int accountNo;
	private String accountNm;
	private String accountType;
	private String ifscCode;
	private double balance;


	int getAccountNo() {
		return accountNo;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNm() {
		return accountNm;
	}
	public void setAccountNm(String accountNm) {
		this.accountNm = accountNm;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(int accountNo, String accountNm, String accountType, String ifscCode, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountNm = accountNm;
		this.accountType = accountType;
		this.ifscCode = ifscCode;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountNm=" + accountNm + ", accountType=" + accountType
				+ ", ifscCode=" + ifscCode + ", balance=" + balance + "]";
	}


}
