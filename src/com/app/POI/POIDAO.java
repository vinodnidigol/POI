package com.app.POI;

import org.hibernate.Session;

import com.Sf.util.SingleTonSessionFactory;

public class POIDAO {

	public static void main(String[] args) {
		
		//create object of super class
		VehicleDTO vehicle=new VehicleDTO();
		vehicle.setChasisNo("4569");
		
		//create objects of subclass
		CarDTO car=new CarDTO();
		car.setNoOfAirbags(6);
		car.setBootSpace(465);
		car.setFuelType("Diesel");
		car.setNoofSeats(5);
		car.setChasisNo("1134");
		
		BikeDTO bike=new BikeDTO();
		bike.setFuelType("Petrol");
		bike.setNoofSeats(2);
		bike.setStandType("sideStand");
		bike.setChasisNo("7845");
		
		//components of hibernate
		Session session=SingleTonSessionFactory.getSF().openSession();
		
		
		session.save(vehicle);
		session.save(car);
		session.save(bike);
		
		
		session.beginTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
	}
}
