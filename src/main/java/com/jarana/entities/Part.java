package com.jarana.entities;
// Generated Feb 21, 2017 10:30:35 PM by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Part generated by hbm2java
 */
@Entity
@Table(name = "Part", catalog = "ecomm")
public class Part implements java.io.Serializable {

	private int paSkuNumber;
	private Vendor vendor;
	private String paPartNumber;
	private String paDescription;
	private BigDecimal paCostAmt;
	private BigDecimal paPriceAmt;
	private Set<Inventory> inventories = new HashSet<Inventory>(0);
	private Set<Sale> sales = new HashSet<Sale>(0);

	public Part() {
	}

	public Part(int paSkuNumber) {
		this.paSkuNumber = paSkuNumber;
	}

	public Part(int paSkuNumber, Vendor vendor, String paPartNumber, String paDescription, BigDecimal paCostAmt,
			BigDecimal paPriceAmt, Set<Inventory> inventories, Set<Sale> sales) {
		this.paSkuNumber = paSkuNumber;
		this.vendor = vendor;
		this.paPartNumber = paPartNumber;
		this.paDescription = paDescription;
		this.paCostAmt = paCostAmt;
		this.paPriceAmt = paPriceAmt;
		this.inventories = inventories;
		this.sales = sales;
	}

	@Id

	@Column(name = "pa_sku_number", unique = true, nullable = false)
	public int getPaSkuNumber() {
		return this.paSkuNumber;
	}

	public void setPaSkuNumber(int paSkuNumber) {
		this.paSkuNumber = paSkuNumber;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pa_vendor_number")
	public Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	@Column(name = "pa_part_number", length = 12)
	public String getPaPartNumber() {
		return this.paPartNumber;
	}

	public void setPaPartNumber(String paPartNumber) {
		this.paPartNumber = paPartNumber;
	}

	@Column(name = "pa_description")
	public String getPaDescription() {
		return this.paDescription;
	}

	public void setPaDescription(String paDescription) {
		this.paDescription = paDescription;
	}

	@Column(name = "pa_cost_amt", precision = 6)
	public BigDecimal getPaCostAmt() {
		return this.paCostAmt;
	}

	public void setPaCostAmt(BigDecimal paCostAmt) {
		this.paCostAmt = paCostAmt;
	}

	@Column(name = "pa_price_amt", precision = 6)
	public BigDecimal getPaPriceAmt() {
		return this.paPriceAmt;
	}

	public void setPaPriceAmt(BigDecimal paPriceAmt) {
		this.paPriceAmt = paPriceAmt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "part")
	public Set<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "part")
	public Set<Sale> getSales() {
		return this.sales;
	}

	public void setSales(Set<Sale> sales) {
		this.sales = sales;
	}

}
