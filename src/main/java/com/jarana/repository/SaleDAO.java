package com.jarana.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Sale;

@Repository("saleDAO")
public interface SaleDAO extends JpaRepository<Sale, Integer> {

	 //List<Sale> findBy-ReplaceFIELD(TYPE FIELD);
	
	@Query("Select s1 FROM Sale s1 INNER JOIN FETCH s1.customer INNER JOIN FETCH s1.part p inner join fetch p.vendor INNER JOIN FETCH s1.tax WHERE s1.saInvoiceNumber = :id")
	Sale findOneSale(@Param("id") Integer id);
}
