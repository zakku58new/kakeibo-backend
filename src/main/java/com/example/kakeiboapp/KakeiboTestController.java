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
	
////	リポジトリの関連付け
//	@Autowired
//	DataTestRepository repository;
//	
//	@Autowired
//	CreditDataRepository creditRepository;
//	
//	@Autowired
//	CreditDataDetailRepository creditDetailRepository;
	
//	サービスクラスの関連付け
	@Autowired
	KakeiboTestService service;
	
//	メニュー表示用検索
	@RequestMapping("/index")
	public List<DataTest> index() {
		
//		Iterable<DataTest> list = repository.findAll();
//		年と月項目の降順でソートして全件取得する。
//		List<DataTest> list = repository.findAll(Sort.by(Sort.Direction.DESC, "dateYear").and(Sort.by(Sort.Direction.DESC, "dateMonth")));
//		return list;
		
		return service.getKakeiboAll();
	}
	
//	生活費系関連検索
	@GetMapping("/serch/data")
	public DataTest searchMonth(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
		
//		Iterable<DataTest> list = repository.findByMonthContaining(year, month);
//		DataTest list = repository.findByMonthContaining(year, month);
//		return list;
		
		return service.getKakeiboWithMonth(year, month);
	}
	
//	クレカ検索
	@GetMapping("/serch/credit")
//	public Iterable<CreditData> searchCredit(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
	public CreditData searchCredit(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
		
//		Iterable<CreditData> list = creditRepository.findByMonthContaining(year, month);
//		CreditData list = creditRepository.findByMonthContaining(year, month);
//		return list;
		
		return service.getCreditData(year, month);
	}
	
//	クレカ詳細検索
	@GetMapping("/serch/creditDetail")
	public Iterable<CreditDataDetail> serchCreditDetail(@RequestParam("year") Integer year, @RequestParam("month") Integer month) {
		
//		Iterable<CreditDataDetail> list = creditDetailRepository.findByCreditDetailYearAndCreditDetailMonth(year, month);
//		return list;
		
		return service.getCreditDetail(year, month);
	}
	
//	家計簿登録
	@RequestMapping("/regist")
	public void regist(@RequestBody DataTest dataTest) {
////		該当月の家計簿の情報の検索
//		DataTest list = repository.findByMonthContaining(dataTest.getDateYear(), dataTest.getMonth());
//		
//		if (list == null) {
////			テーブルにデータがない場合
////			データの新規登録
//			repository.saveAndFlush(dataTest);
//		} else {
////			テーブルにデータがある場合
////			データの更新
//			DataTest data = new DataTest();
//			data.setId(list.getid());
//			data.setDateYear(dataTest.getDateYear());
//			data.setMonth(dataTest.getMonth());
//			data.setIncome(dataTest.getIncome());
//			data.setBank(dataTest.getBank());
//			data.setElectricityBill(dataTest.getElectricityBill());
//			data.setGasBill(dataTest.getGasBill());
//			data.setWaterBill(dataTest.getWaterBill());
//			data.setFoodExpense(dataTest.getFoodExpense());
//			data.setRentalCost(dataTest.getRentalCost());
////			即座にデータベースに反映させたい場合はsaveAndFlushを使用する。
//			repository.saveAndFlush(data);
//		}
//		
////		Iterable<DataTest> list = repository.findAll();
////		return list;
		
		service.registKakeibo(dataTest);
	}
	
//	クレカ登録
	@RequestMapping("/regist/credit")
	public void registCredit(@RequestBody CreditData creditData) {
////		該当月のクレジットの合計情報の検索
//		CreditData list = creditRepository.findByMonthContaining(creditData.getCreditYear(), creditData.getCreditMonth());
////		System.out.println(list);
//		
//		if (list == null) {
////			テーブルにデータがない場合
////			データの新規登録
//			creditRepository.saveAndFlush(creditData);
//		} else {
////			テーブルにデータがある場合
////			データの更新
//			CreditData data = new CreditData();
//			data.setId(list.getId());
//			data.setCreditYear(creditData.getCreditYear());
//			data.setCreditMonth(creditData.getCreditMonth());
//			data.setRCreditSum(creditData.getRCreditSum());
//			data.setRCreditPoint(creditData.getRCreditPoint());
//			data.setRCreditSumLast(creditData.getRCreditSumLast());
//			data.setMCreditSum(creditData.getMCreditSum());
//			data.setMCreditPoint(creditData.getMCreditPoint());
//			data.setMCreditSumLast(creditData.getMCreditSumLast());
//			creditRepository.saveAndFlush(data);
//		}
		
		service.registCredit(creditData);
	}
	
//	クレカ詳細登録
	@RequestMapping("/regist/creditDetail")
	public void registCreditDetail(@RequestBody Iterable<CreditDataDetail> creditDetail) {
////		クレカ詳細情報登録
//		creditDetailRepository.saveAndFlush(creditDetail);
//		
////		System.out.println(creditDetail.getCreditDetailYear());
////		System.out.println(creditDetail.getCreditDetailMonth());
//		
////		該当月のクレジットの合計情報の検索
//		CreditData list = creditRepository.findByMonthContaining(creditDetail.getCreditDetailYear(), creditDetail.getCreditDetailMonth());
////		System.out.println(list);
//		
//		if (list == null) {
////			テーブルにデータがない場合
////			System.out.println("null2");
////			データの新規登録
//			CreditData data = new CreditData();
//			data.setCreditYear(creditDetail.getCreditDetailYear());
//			data.setCreditMonth(creditDetail.getCreditDetailMonth());
//			data.setRCreditSum(creditDetail.getAmount());
//			data.setRCreditPoint(0);
//			data.setRCreditSumLast(creditDetail.getAmount());
//			data.setMCreditSum(0);
//			data.setMCreditPoint(0);
//			data.setMCreditSumLast(0);
//			creditRepository.saveAndFlush(data);
//			
////			次月の家計簿の検索
////			int year = creditDetail.getCreditDetailYear();
////			int month = creditDetail.getCreditDetailMonth();
////			if (month == 12) {
////				year = year + 1;
////				month = 1;
////			} else {
////				month = month + 1;
////			}
////			
////			DataTest kakeiboList = repository.findByMonthContaining(year, month);
////			if (kakeiboList == null) {
////				DataTest kakeiboData = new DataTest();
////				kakeiboData.setDateYear(year);
////				kakeiboData.setMonth(month);
////				kakeiboData.setIncome(0);
////				kakeiboData.setBank(0);
////				kakeiboData.setElectricityBill(0);
////				kakeiboData.setGasBill(0);
////				kakeiboData.setWaterBill(0);
////				kakeiboData.setFoodExpense(0);
////				kakeiboData.setRentalCost(86330);
////				repository.saveAndFlush(kakeiboData);
////				System.out.println("家計簿データ作成");
////			}
//		} else {
////			テーブルにデータがある場合
////			System.out.println("データあり");
////			クレカ合計の数値を更新(DBから取得した値 + 新しく入力された値)
//			int sum = list.getRCreditSum() + creditDetail.getAmount();
//			int sumLast = 0;
//			if (list.getRCreditPoint()==null) {
////				楽天ポイントが未登録の場合
//				sumLast = sum - 0;
//			} else {
////				楽天ポイントの登録済みの場合
//				sumLast = sum - list.getRCreditPoint();
//			}
//			
////			データの更新
//			CreditData data = new CreditData();
////			記載しなかった項目はnullで更新されてしまう。
//			data.setId(list.getId());
//			data.setCreditYear(list.getCreditYear());
//			data.setCreditMonth(list.getCreditMonth());
//			data.setRCreditSum(sum);
//			data.setRCreditPoint(list.getRCreditPoint());
//			data.setRCreditSumLast(sumLast);
//			data.setMCreditSum(list.getMCreditSum());
//			data.setMCreditPoint(list.getMCreditPoint());
//			data.setMCreditSumLast(list.getMCreditSumLast());
//			creditRepository.saveAndFlush(data);
//		}
		service.regisCreditDetail(creditDetail);
	}
	
//	クレカ詳細更新
	@RequestMapping("/update/creditDetail")
	public void updateCreditDetail(@RequestBody Iterable<CreditDataDetail> creditDetails) {
//		System.out.println(creditDetails);
//		クレカ詳細更新実施
//		creditDetailRepository.saveAllAndFlush(creditDetails);
		
		service.updateCreditdetail(creditDetails);
	}
	
//	クレカ詳細削除
	@RequestMapping("/delete/creditDetail")
	public void deleteCreditDetail(@RequestBody CreditDataDetail creditDetail) {
		service.daleteCreditdetail(creditDetail);
//		System.out.println(creditDetail.getId());
	}
}
