package com.app.POI;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bike_table")
public class BikeDTO extends VehicleDTO {

	@Column(name = "stand_type")
	private String standType;

	public String getStandType() {
		return standType;
	}

	public void setStandType(String standType) {
		this.standType = standType;
	}

}
