package com.TrainReservation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Train {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Train_id;
    private String Train_name;
    private String Departure;
    private String Arrival;
    private String Time;
    
	public Train(int train_id, String train_name, String departure, String arrival, String time) {
		super();
		this.Train_id=train_id;
		this.Train_name = train_name;
		this.Departure = departure;
		this.Arrival = arrival;
		this.Time = time;
	}

	public int getTrain_id() {
		return Train_id;
	}
	public void setTrain_id(int train_id) {
		this.Train_id = train_id;
	}
	public String getTrain_name() {
		return Train_name == null ? "" : Train_name;
	}
	public void setTrain_name(String train_name) {
		this.Train_name = train_name;
	}
	public String getDeparture() {
		return Departure;
	}

	public void setDeparture(String departure) {
		this.Departure = departure;
	}

	public String getArrival() {
		return Arrival;
	}

	public void setArrival(String arrival) {
		this.Arrival= arrival;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		this.Time = time;
	}

	public Train() {
		super();
	}
}
