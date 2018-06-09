package com.cars.model;
// Generated 6 juin 2018 18:04:52 by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Gadget generated by hbm2java
 */
@Entity
@Table(name = "GADGET")
public class Gadget implements java.io.Serializable {

	private BigDecimal gadgetId;
	private String gadType;
	private Set<Booking> bookings = new HashSet<Booking>(0);

	public Gadget() {
	}

	public Gadget(BigDecimal gadgetId, String gadType) {
		this.gadgetId = gadgetId;
		this.gadType = gadType;
	}

	public Gadget(BigDecimal gadgetId, String gadType, Set<Booking> bookings) {
		this.gadgetId = gadgetId;
		this.gadType = gadType;
		this.bookings = bookings;
	}

	@Id

	@Column(name = "GADGET_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getGadgetId() {
		return this.gadgetId;
	}

	public void setGadgetId(BigDecimal gadgetId) {
		this.gadgetId = gadgetId;
	}

	@Column(name = "GAD_TYPE", nullable = false, length = 45)
	public String getGadType() {
		return this.gadType;
	}

	public void setGadType(String gadType) {
		this.gadType = gadType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gadget")
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

}
