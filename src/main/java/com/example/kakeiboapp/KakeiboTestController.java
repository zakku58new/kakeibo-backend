package com.example.kakeiboapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class KakeiboTestController {
		
//	サービスクラスの関連付け
	@Autowired
	KakeiboTestService service;
	
//	メニュー表示用検索
	@RequestMapping("/index")
	public List<DataTest> index() {
		return service.getKakeiboAll();
	}
	
//	生活費系関連検索
	@GetMapping("/serch/data")
	public DataTest searchMonth(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
		return service.getKakeiboWithMonth(year, month);
	}
	
//	クレカ検索
	@GetMapping("/serch/credit")
//	public Iterable<CreditData> searchCredit(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
	public CreditData searchCredit(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
		return service.getCreditData(year, month);
	}
	
//	クレカ詳細検索
	@GetMapping("/serch/creditDetail")
	public Iterable<CreditDataDetail> serchCreditDetail(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
		return service.getCreditDetail(year, month);
	}
	
//	家計簿登録
	@RequestMapping("/regist")
	public void regist(@RequestBody DataTest dataTest) {
		service.registKakeibo(dataTest);
	}
	
//	クレカ登録
	@RequestMapping("/regist/credit")
	public void registCredit(@RequestBody CreditData creditData) {
		service.registCredit(creditData);
	}
	
//	クレカ詳細登録
	@RequestMapping("/regist/creditDetail")
	public void registCreditDetail(@RequestBody Iterable<CreditDataDetail> creditDetail) {
		service.regisCreditDetail(creditDetail);
	}
	
//	クレカ詳細更新
	@RequestMapping("/update/creditDetail")
	public void updateCreditDetail(@RequestBody Iterable<CreditDataDetail> creditDetails) {
		service.updateCreditdetail(creditDetails);
	}
	
//	クレカ詳細削除
	@RequestMapping("/delete/creditDetail")
	public void deleteCreditDetail(@RequestBody CreditDataDetail creditDetail) {
		service.daleteCreditdetail(creditDetail);
	}
}
