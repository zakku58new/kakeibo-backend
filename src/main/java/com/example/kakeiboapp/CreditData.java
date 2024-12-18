package com.example.kakeiboapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "credit")
public class CreditData {
	
//	ID
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
//	年
	@Column(name="credityear")
	private Integer creditYear;
	
//	月
	@Column(name="creditmonth")
	private Integer creditMonth;
	
//	楽天クレカ合計
	@Column(nullable=true, name="rcreditsum")
	private Integer RCreditSum;
	
//	楽天ポイント
	@Column(nullable=true, name="rcreditpoint")
	private Integer RCreditPoint;
	
//	楽天クレカ最終合計
	@Column(nullable=true, name="rcreditsumlast")
	private Integer RCreditSumLast;
	
//	三井クレカ合計
	@Column(nullable=true, name="mcreditsum")
	private Integer MCreditSum;
	
//	三井ポイント
	@Column(nullable=true, name="mcreditpoint")
	private Integer MCreditPoint;
	
//	三井クレカ最終合計
	@Column(nullable=true, name="mcreditsumlast")
	private Integer MCreditSumLast;
	
	
//	getter setter
//	ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
//	年creditYear
	public Integer getCreditYear() {
		return creditYear;
	}
	public void setCreditYear(Integer creditYear) {
		this.creditYear = creditYear;
	}
	
//	月creditMonth
	public Integer getCreditMonth() {
		return creditMonth;
	}
	public void setCreditMonth(Integer creditMonth) {
		this.creditMonth = creditMonth;
	}
	
//	楽天クレカ合計RCreditSum
	public Integer getRCreditSum() {
		return RCreditSum;
	}
	public void setRCreditSum(Integer RCreditSum) {
		this.RCreditSum = RCreditSum;
	}
	
//	楽天ポイントRCreditPoint
	public Integer getRCreditPoint() {
		return RCreditPoint;
	}
	public void setRCreditPoint(Integer RCreditPoint) {
		this.RCreditPoint = RCreditPoint;
	}
	
//	楽天クレカ最終合計RCreditSumLast
	public Integer getRCreditSumLast() {
		return RCreditSumLast;
	}
	public void setRCreditSumLast(Integer RCreditSumLast) {
		this.RCreditSumLast = RCreditSumLast;
	}
	
//	三井クレカ合計MCreditSum
	public Integer getMCreditSum() {
		return MCreditSum;
	}
	public void setMCreditSum(Integer MCreditSum) {
		this.MCreditSum = MCreditSum;
	}
	
//	三井ポイントMCreditPoint
	public Integer getMCreditPoint() {
		return MCreditPoint;
	}
	public void setMCreditPoint(Integer MCreditPoint) {
		this.MCreditPoint = MCreditPoint;
	}
	
//	三井クレカ最終合計MCreditSumLast
	public Integer getMCreditSumLast() {
		return MCreditSumLast;
	}
	public void setMCreditSumLast(Integer MCreditSumLast) {
		this.MCreditSumLast = MCreditSumLast;
	}

}
