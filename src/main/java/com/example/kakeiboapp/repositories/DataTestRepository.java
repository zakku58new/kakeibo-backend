package com.example.kakeiboapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.kakeiboapp.DataTest;


//※すべてのリポジトリは「JpaRepository」を継承する
//↓データアクセルのためのものであることを示す
@Repository
public interface DataTestRepository extends JpaRepository<DataTest, Long> {

	@Query("SELECT d FROM DataTest d WHERE d.dateYear = :year AND d.dateMonth = :month")
	Iterable<DataTest> findByMonthContaining(@Param("year") Integer year, @Param("month") Integer month);
}
