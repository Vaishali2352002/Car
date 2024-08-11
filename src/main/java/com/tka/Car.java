package com.tka;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	int CId;
	String CarOwener;
	String CompanyName;
	int Cost;

	public Car(String carOwener, String companyName, int cost) {
		super();
		CarOwener = carOwener;
		CompanyName = companyName;
		Cost = cost;
	}

	public Car() {
		super();
	}

	public Car(int cId, String carOwener, String companyName, int cost) {
		super();
		CId = cId;
		CarOwener = carOwener;
		CompanyName = companyName;
		Cost = cost;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getCarOwener() {
		return CarOwener;
	}

	public void setCarOwener(String carOwener) {
		CarOwener = carOwener;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	@Override
	public String toString() {
		return "Car [CId=" + CId + ", CarOwener=" + CarOwener + ", CompanyName=" + CompanyName + ", Cost=" + Cost + "]";
	}

}
