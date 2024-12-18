package com.example.kakeiboapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.kakeiboapp.CreditData;

public interface CreditDataRepository extends JpaRepository<CreditData, Long> {

	@Query("SELECT d FROM CreditData d WHERE d.creditYear = :year AND d.creditMonth = :month")
	Iterable<CreditData> findByMonthContaining(@Param("year") Integer year, @Param("month") Integer month);
}
