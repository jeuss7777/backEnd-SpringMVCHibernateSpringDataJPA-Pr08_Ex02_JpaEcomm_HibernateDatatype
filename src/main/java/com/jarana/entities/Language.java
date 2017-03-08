package com.jarana.entities;
// Generated Feb 21, 2017 10:30:35 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Language generated by hbm2java
 */
@Entity
@Table(name = "language", catalog = "ecomm")
public class Language implements java.io.Serializable {

	private int languageId;
	private String languageName;

	public Language() {
	}

	public Language(int languageId, String languageName) {
		this.languageId = languageId;
		this.languageName = languageName;
	}

	@Id

	@Column(name = "languageId", unique = true, nullable = false)
	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	@Column(name = "languageName", nullable = false, length = 20)
	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

}
