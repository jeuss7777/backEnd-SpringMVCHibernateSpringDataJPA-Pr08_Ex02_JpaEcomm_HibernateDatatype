package com.jarana.entities;
// Generated Feb 21, 2017 10:30:35 PM by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Sale generated by hbm2java
 */
@Entity
@Table(name = "Sale", catalog = "ecomm")
public class Sale implements java.io.Serializable {

	private int saInvoiceNumber;
	private Customer customer;
	private Part part;
	private Integer saQuantitySold;
	private BigDecimal saPriceAmount;
	private Tax tax;

	public Sale() {
	}

	public Sale(int saInvoiceNumber) {
		this.saInvoiceNumber = saInvoiceNumber;
	}

	public Sale(int saInvoiceNumber, Customer customer, Part part, Integer saQuantitySold, BigDecimal saPriceAmount,
			Tax tax) {
		this.saInvoiceNumber = saInvoiceNumber;
		this.customer = customer;
		this.part = part;
		this.saQuantitySold = saQuantitySold;
		this.saPriceAmount = saPriceAmount;
		this.tax = tax;
	}

	@Id

	@Column(name = "sa_invoice_number", unique = true, nullable = false)
	public int getSaInvoiceNumber() {
		return this.saInvoiceNumber;
	}

	public void setSaInvoiceNumber(int saInvoiceNumber) {
		this.saInvoiceNumber = saInvoiceNumber;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sa_customer_id")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sa_sku_number")
	public Part getPart() {
		return this.part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	@Column(name = "sa_quantity_sold")
	public Integer getSaQuantitySold() {
		return this.saQuantitySold;
	}

	public void setSaQuantitySold(Integer saQuantitySold) {
		this.saQuantitySold = saQuantitySold;
	}

	@Column(name = "sa_price_amount", precision = 6)
	public BigDecimal getSaPriceAmount() {
		return this.saPriceAmount;
	}

	public void setSaPriceAmount(BigDecimal saPriceAmount) {
		this.saPriceAmount = saPriceAmount;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sa_tax_id")
	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

}
