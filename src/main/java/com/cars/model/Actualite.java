package com.cars.model;
// Generated 15 juin 2018 16:18:35 by Hibernate Tools 4.3.5.Final

import java.sql.Blob;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Actualite generated by hbm2java
 */
@Entity
@Table(name = "ACTUALITE")
public class Actualite implements java.io.Serializable {

	private long actCode;
	private Date actDate;
	private String actLiblt;
	private String actLibltEn;
	private String actText;
	private String actTextEn;
	private Blob img;
	private long versionNumber;

	public Actualite() {
	}

	public Actualite(long actCode) {
		this.actCode = actCode;
	}

	public Actualite(long actCode, Date actDate, String actLiblt, String actLibltEn, String actText, String actTextEn,
			Blob img, long versionNumber) {
		this.actCode = actCode;
		this.actDate = actDate;
		this.actLiblt = actLiblt;
		this.actLibltEn = actLibltEn;
		this.actText = actText;
		this.actTextEn = actTextEn;
		this.img = img;
		this.versionNumber = versionNumber;
	}

	@Id

	@Column(name = "ACT_CODE", unique = true, nullable = false, precision = 5, scale = 0)
	public long getActCode() {
		return this.actCode;
	}

	public void setActCode(long actCode) {
		this.actCode = actCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ACT_DATE", length = 7)
	public Date getActDate() {
		return this.actDate;
	}

	public void setActDate(Date actDate) {
		this.actDate = actDate;
	}

	@Column(name = "ACT_LIBLT", length = 4000)
	public String getActLiblt() {
		return this.actLiblt;
	}

	public void setActLiblt(String actLiblt) {
		this.actLiblt = actLiblt;
	}

	@Column(name = "ACT_LIBLT_EN", length = 4000)
	public String getActLibltEn() {
		return this.actLibltEn;
	}

	public void setActLibltEn(String actLibltEn) {
		this.actLibltEn = actLibltEn;
	}

	@Column(name = "ACT_TEXT", length = 4000)
	public String getActText() {
		return this.actText;
	}

	public void setActText(String actText) {
		this.actText = actText;
	}

	@Column(name = "ACT_TEXT_EN", length = 4000)
	public String getActTextEn() {
		return this.actTextEn;
	}

	public void setActTextEn(String actTextEn) {
		this.actTextEn = actTextEn;
	}

	@Column(name = "IMG")
	public Blob getImg() {
		return this.img;
	}

	public void setImg(Blob img) {
		this.img = img;
	}

	@Column(name = "VERSION_NUMBER", scale = 0)
	public long getVersionNumber() {
		return this.versionNumber;
	}

	public void setVersionNumber(long versionNumber) {
		this.versionNumber = versionNumber;
	}

}