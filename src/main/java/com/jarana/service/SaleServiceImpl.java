package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Part;
import com.jarana.entities.Sale;
import com.jarana.repository.SaleDAO;

@Transactional
@Service("saleService")
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleDAO saleDAO;

	public List<Sale> findAll() {
		List<Sale> listSale = saleDAO.findAll();		
		return listSale;
	}

	public Sale findOne(int sa_invoice_number) {
		
		final Sale sale= saleDAO.findOne(sa_invoice_number);
		Part part = sale.getPart();
		part.toString();
		return sale;
	}

//	public List<Sale> findBy-ReplaceFIELD(TYPE FIELD) {
//		return saleDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (Sale sale) {
		saleDAO.save(sale);
	}

	public void update (Sale sale) {
		saleDAO.save(sale);
	}

	public void delete (Sale sale) {
		saleDAO.delete(sale);
	}

}
