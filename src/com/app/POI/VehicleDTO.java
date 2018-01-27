package com.app.POI;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_table")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class VehicleDTO implements Serializable {
	@Column(name = "no_of_seats")
	private int noofSeats;
	@Column(name = "fuel_type")
	private String FuelType;
	@Id
	@Column(name = "chasis_no")
	private String chasisNo;

	public int getNoofSeats() {
		return noofSeats;
	}

	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}

	public String getFuelType() {
		return FuelType;
	}

	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

}
