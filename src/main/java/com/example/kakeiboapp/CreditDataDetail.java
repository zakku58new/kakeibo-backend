package com.example.kakeiboapp;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "credit_detail")
public class CreditDataDetail {
//	ID
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
//	年
	@Column(name="creditdetailyear")
	private Integer creditDetailYear;
	
//	月
	@Column(name="creditdetailmonth")
	private Integer creditDetailMonth;
	
//	年月日
	@Column(name="creditdate")
	private Date creditDate;
	
//	金額
	@Column(nullable=true, name="amount")
	private Integer amount;
	
//	買ったもの
	@Column(nullable=true, name="purchaseditems")
	private String purchasedItems;
	
//	確認チェックボックス
	@Column(nullable=true, name="checkboxstatus")
	private Boolean checkboxStatus;
	
	
//	getter setter
//	ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
//	年
	public Integer getCreditDetailYear() {
		return creditDetailYear;
	}
	public void setCreditDetailYear(Integer creditDetailYear) {
		this.creditDetailYear = creditDetailYear;
	}
	
//	月
	public Integer getCreditDetailMonth() {
		return creditDetailMonth;
	}
	public void setCreditDetailMonth(Integer creditDetailMonth) {
		this.creditDetailMonth = creditDetailMonth;
	}
	
//	年月日
	public Date getCreditDate() {
		return creditDate;
	}
	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}
	
//	金額
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
//	買ったもの
	public String getPurchasedItems() {
		return purchasedItems;
	}
	public void setPurchasedItems(String purchasedItems) {
		this.purchasedItems = purchasedItems;
	}
	
//	確認チェックボックス
	public Boolean getCheckboxStatus() {
		return checkboxStatus;
	}
	public void setCheckboxStatus(Boolean checkboxStatus) {
		this.checkboxStatus = checkboxStatus;
	}
	
}
