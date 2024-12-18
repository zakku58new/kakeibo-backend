package com.example.kakeiboapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kakeiboapp.CreditDataDetail;

@Repository
public interface CreditDataDetailRepository extends JpaRepository<CreditDataDetail, Long> {

	public List<CreditDataDetail> findByCreditDetailYearAndCreditDetailMonth(Integer year, Integer month);
}
