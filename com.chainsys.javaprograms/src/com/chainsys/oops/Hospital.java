package com.chainsys.oops;

public class Hospital 
{
	String nameofhospital;
	String locationofhospital;
	int doctorscount;
	int patientscount;
	int nursecount;
	double totalincome;
	double totalpayments;
	public String getNameofhospital() {
		return nameofhospital;
	}
	public void setNameofhospital(String nameofhospital) {
		this.nameofhospital = nameofhospital;
	}
	public String getLocationofhospital() {
		return locationofhospital;
	}
	public void setLocationofhospital(String locationofhospital) {
		this.locationofhospital = locationofhospital;
	}
	public int getDoctorscount() {
		return doctorscount;
	}
	public void setDoctorscount(int doctorscount) {
		this.doctorscount = doctorscount;
	}
	public int getPatientscount() {
		return patientscount;
	}
	public void setPatientscount(int patientscount) {
		this.patientscount = patientscount;
	}
	public int getNursecount() {
		return nursecount;
	}
	public void setNursecount(int nursecount) {
		this.nursecount = nursecount;
	}
	public double getTotalincome() {
		return totalincome;
	}
	public void setTotalincome(double totalincome) {
		this.totalincome = totalincome;
	}
	public double getTotalpayments() {
		return totalpayments;
	}
	public void setTotalpayments(double totalpayments) {
		this.totalpayments = totalpayments;
	}
	@Override
	public String toString() {
		return "Hospital [nameofhospital=" + nameofhospital + ", locationofhospital=" + locationofhospital
				+ ", doctorscount=" + doctorscount + ", patientscount=" + patientscount + ", nursecount=" + nursecount
				+ ", totalincome=" + totalincome + ", totalpayments=" + totalpayments + "]";
	}
	

}
