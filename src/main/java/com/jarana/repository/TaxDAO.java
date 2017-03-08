package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Tax;

@Repository("taxDAO")
public interface TaxDAO extends JpaRepository<Tax, String> {

	 //List<Tax> findBy-ReplaceFIELD(TYPE FIELD);
}
