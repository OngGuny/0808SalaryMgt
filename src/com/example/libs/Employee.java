package com.example.libs;

public class Employee {
	private String empno,name,dpart;
	private int base, night, fam,hopay,fampay,nightpay,total,salay;
	
	public Employee() {// 기본 생성자 
	}

	public Employee(String empno, String name, int base, int night, int fam) {
		this.empno = empno;  //사원번호
		this.name = name;	//이름
		this.base = base;	//기본급
		this.night = night;	//야근시간
		this.fam = fam;		//가족수 
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDpart() {
		return dpart;
	}

	public void setDpart(String dpart) {
		this.dpart = dpart;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getNight() {
		return night;
	}

	public void setNight(int night) {
		this.night = night;
	}

	public int getFam() {
		return fam;
	}

	public void setFam(int fam) {
		this.fam = fam;
	}

	public int getHopay() {
		return hopay;
	}

	public void setHopay(int hopay) {
		this.hopay = hopay;
	}

	public int getFampay() {
		return fampay;
	}

	public void setFampay(int fampay) {
		this.fampay = fampay;
	}

	public int getNightpay() {
		return nightpay;
	}

	public void setNightpay(int nightpay) {
		this.nightpay = nightpay;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}

	@Override
	public String toString() {
		return String.format(
				"%-5s %5s %5s %5d %,10d %,7d %,7d %,10d %,10d", // %,넣어주면 3자리마다 , 찍어줌 
				empno, name, dpart, base, hopay, fampay, nightpay, total, salay);
	}// 변수 지정. 기본 생성자 만들고,  받는 변수 생성자 만들고 겟터셋터 셋팅하고  tostring 만듦 

	
	

}
