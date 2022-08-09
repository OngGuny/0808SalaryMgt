package com.example.libs;

public class Output {//받을 변수 선언
	private Employee[]emps;
	private int count;
	
	public Output(Employee[]emps,int count) {
		this.emps=emps;
		this.count=count;
	}
	public void output() {
		this.printLabel();//클래스 내 메소드 갔다오면 
		//루프 도니까 강화된 for못씀
		for(int i=0;i<count;i++) {
			System.out.println(this.emps[i]); // 함축된것 this.emps[i].toString()  
		}
	}
	
	
	private void printLabel() {
		System.out.println("                            <<<<<부산전산산업진흥원 직원 월급 정보>>>>>");
		System.out.println("사원번호\t사원이름\t부서명\t기본급\t호급수당\t가족수당\t야근수당\t총금액\t실수령액");
		System.out.println("----------------------------------------------------------------");
	}
}
