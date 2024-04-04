package com.eb.pojo;

public class Student {
	private int sId;
	private String sName;
	private String studentPhone;
	private String studentCity;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", studentPhone=" + studentPhone + ", studentCity="
				+ studentCity + ", getsId()=" + getsId() + ", getsName()=" + getsName() + ", getStudentPhone()="
				+ getStudentPhone() + ", getStudentCity()=" + getStudentCity() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String sName, String studentPhone, String studentCity) {
		super();
		
		this.sName = sName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
}
