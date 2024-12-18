package com.example.kakeiboapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakeiboapp.repositories.CreditDataDetailRepository;
import com.example.kakeiboapp.repositories.CreditDataRepository;
import com.example.kakeiboapp.repositories.DataTestRepository;

@RestController
//@Controller
public class KakeiboTestController {
	
//	リポジトリの関連付け
	@Autowired
	DataTestRepository repository;
	
	@Autowired
	CreditDataRepository creditRepository;
	
	@Autowired
	CreditDataDetailRepository creditDetailRepository;
	
	@RequestMapping("/index")
	public Iterable<DataTest> index() {
//		DataTest result = new DataTest();
//		result.setMonth(11);
//		result.setIncome(222);
//		result.setBank(333);
//		result.setElectricityBill(444);
//		result.setGasBill(555);
//		result.setWaterBill(666);
//		result.setFoodExpense(777);
//		result.setRentalCost(888);
//		repository.saveAndFlush(result);
		
		Iterable<DataTest> list = repository.findAll();
		return list;
	}
	
//	生活費系関連検索
	@GetMapping("/serch/data")
	public Iterable<DataTest> searchMonth(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
		
		Iterable<DataTest> list = repository.findByMonthContaining(year, month);
		return list;
	}
	
//	クレカ検索
	@GetMapping("/serch/credit")
	public Iterable<CreditData> searchCredit(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
//		CreditData result = new CreditData();
//		result.setCreditYear(2024);
//		result.setCreditMonth(11);
//		result.setRCreditSum(11111);
//		result.setRCreditPoint(22222);
//		result.setRCreditSumLast(33333);
//		result.setMCreditSum(44444);
//		result.setMCreditPoint(55555);
//		result.setMCreditPoint(66666);
//		result.setMCreditSumLast(77777);
//		creditRepository.saveAndFlush(result);
		
		Iterable<CreditData> list = creditRepository.findByMonthContaining(year, month);
		return list;
	}
	
//	クレカ詳細検索
	@GetMapping("/serch/creditDetail")
	public Iterable<CreditDataDetail> serchCreditDetail(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
//		CreditDataDetail result = new CreditDataDetail();
//		result.setCreditDetailYear(2024);
//		result.setCreditDetailMonth(11);
//		result.setCreditDate(Date.valueOf("2024-1-28"));
//		result.setAmount(1000);
//		result.setPurchasedItems("ごはん");
//		result.setCheckboxStatus(false);
//		creditDetailRepository.saveAndFlush(result);
		
		Iterable<CreditDataDetail> list = creditDetailRepository.findByCreditDetailYearAndCreditDetailMonth(year, month);
		return list;
	}
	
	@RequestMapping("/regist")
	public void regist(@RequestBody DataTest dataTest) {
		repository.saveAndFlush(dataTest);
		
//		Iterable<DataTest> list = repository.findAll();
//		return list;
	}
	
	@RequestMapping("/regist/credit")
	public void registCredit(@RequestBody CreditData creditData) {
		creditRepository.saveAndFlush(creditData);
		
//		Iterable<CreditData> list = creditRepository.findAll();
//		return list;
	}
	
	@RequestMapping("/regist/creditDetail")
	public void registCreditDetail(@RequestBody CreditDataDetail creditDetail) {
		creditDetailRepository.saveAndFlush(creditDetail);
		
//		該当月のクレジットの合計情報の更新
		Iterable<CreditData> list = creditRepository.findByMonthContaining(creditDetail.getCreditDetailYear(), creditDetail.getCreditDetailMonth());
//		CreditData data = new CreditData();
//		data.setCreditYear(list.)
//		Iterable<CreditDataDetail> list = creditDetailRepository.findAll();
//		return list;
	}
	
}
