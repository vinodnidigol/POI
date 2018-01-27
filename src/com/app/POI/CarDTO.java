package com.app.POI;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_table")
public class CarDTO extends VehicleDTO {

	@Column(name = "no_of_airbags")
	private int noOfAirbags;
	@Column(name = "boot_space")
	private int bootSpace;

	public int getNoOfAirbags() {
		return noOfAirbags;
	}

	public void setNoOfAirbags(int noOfAirbags) {
		this.noOfAirbags = noOfAirbags;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

}
