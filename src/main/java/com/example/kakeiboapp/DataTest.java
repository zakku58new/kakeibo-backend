package com.example.kakeiboapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//エンティティ
//テーブルに保管されるデータをJava内でオブジェクトとして扱える用にするためのクラス
@Entity
@Table(name = "kakeibo_data")
public class DataTest {
	
//	ID
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	エラー：「Table 'kakeibo.kakeibo_data_seq' doesn't exist」が発生した。
//	解決方法として、
//	　「GenerationType」を「AUTO」ではなく「IDENTITY」に変えればよい。
//	　AUTOの時は「SEQUENCE」を指定したときの挙動になっていた。
//	その他の方法として、
//	　application.propertiesで旧式の命名方法を採用するように指定すればよい
//	　→「spring.jpa.properties.hibernate.id.db_structure_naming_strategy: legacy」
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
//	JPA(Hibernate)の仕様、カラム名作成（デフォルト）
//	１．論理名の生成
//	　クラス名、フィールド名を論理名として取得し、
//	　@Columnや@Tableで指定されていれば、その文字列を論理名とする。
//	２．物理名の生成
//	　ピリオドをアンダーバーに置き換える
//	　キャメルケースをスネークケースに置き換える
//	　例）dateYear → date_year
	
//	対応方法
//	　DBのテーブルのカラム名を変更する。
//	　@Column(name="dateyear")のようにすべて小文字にする。
	
	
//	年
	@Column(name="dateyear")
	private Integer dateYear;
	
//	月
	@Column(name="datemonth")
	private Integer dateMonth;
	
//	給料
	@Column(nullable = true, name="income")
	private Integer income;
	
//	口座
	@Column(nullable = true, name="bank")
	private Integer bank;
	
//	電気代
	@Column(nullable = true, name="electricitybill")
	private Integer electricityBill;
	
//	ガス代
	@Column(nullable = true, name="gasbill")
	private Integer gasBill;
	
//	水道代
	@Column(nullable = true, name="waterbill")
	private Integer waterBill;
	
//	生活
	@Column(nullable = true, name="foodexpense")
	private Integer foodExpense;
	
//	家賃
	@Column(nullable = true, name="rentalcost")
	private Integer rentalCost;
	
	
//	getter setter
//	ID
	public long getid() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
//	※画面側から渡す変数は、ここのsetterで引数として使用している変数名にする必要がある。
//	年
	public Integer getDateYear() {
		return dateYear;
	}
	public void setDateYear(Integer dateYear) {
		this.dateYear = dateYear;
	}
	
//	月
	public Integer getMonth() {
		return dateMonth;
	}
	public void setMonth(Integer month) {
		this.dateMonth = month;
	}
	
//	給料
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	
//	口座
	public Integer getBank() {
		return bank;
	}
	public void setBank(Integer bank) {
		this.bank = bank;
	}
	
//	電気代
	public Integer getElectricityBill() {
		return electricityBill;
	}
	public void setElectricityBill(Integer electricityBill) {
		this.electricityBill = electricityBill;
	}
	
//	ガス代
	public Integer getGasBill() {
		return gasBill;
	}
	public void setGasBill(Integer gasBill) {
		this.gasBill = gasBill;
	}
	
//	水道代
	public Integer getWaterBill() {
		return waterBill;
	}
	public void setWaterBill(Integer waInteger) {
		this.waterBill = waInteger;
	}
	
//	生活
	public Integer getFoodExpense() {
		return foodExpense;
	}
	public void setFoodExpense(Integer foodInteger) {
		this.foodExpense = foodInteger;
	}
	
//	家賃
	public Integer getRentalCost() {
		return rentalCost;
	}
	public void setRentalCost(Integer rentalCost) {
		this.rentalCost = rentalCost;
	}
	
}