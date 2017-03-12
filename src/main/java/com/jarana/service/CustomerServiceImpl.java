package com.jarana.service;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Customer;
import com.jarana.entities.Part;
import com.jarana.entities.Sale;
import com.jarana.entities.Tax;
import com.jarana.repository.CustomerDAO;

@Transactional
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;

	public List<Customer> findAll() {
		List<Customer> listCustomer = customerDAO.findAll();
		
		if(listCustomer != null){
			//customer.getTax().toString();
				
				for(Customer customer : listCustomer){
					customer.getSales();
					if(customer.getSales() != null){
						for(Sale sale : customer.getSales()){
							sale.getPart().getPaPartNumber();
	
						}
					}
				}
		}
		
		return listCustomer;
	}

	public Customer findOne(Long cuCustomerId) {
		final Customer customer = customerDAO.findOne(cuCustomerId);
		//Tax tax = customer.getTax();
		//tax.toString();
		Set<Sale> sales=customer.getSales();
		if(sales != null){
			for(Sale sale : sales){
				sale.getPart().getPaPartNumber();
				

			}
		}
		sales.toString();
		return customer;
	}

	public List<Customer> findBycuFirstName(String cuFirstName) {
		return customerDAO.findBycuFirstName(cuFirstName);
	}
	
	public List<Customer> findBycuLastName(String cuLastName) {
		return customerDAO.findBycuLastName(cuLastName);
	}

	public void create (Customer customer) {
		customerDAO.save(customer);
	}

	public void update (Customer customer) {
		customerDAO.save(customer);
	}

	public void delete (Customer customer) {
		customerDAO.delete(customer);
	}

}
