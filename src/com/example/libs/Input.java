package com.example.libs; // com 안에 example 안에 libs 가 있다는것.  길어지니까 . 으로 구분함 
import java.util.Scanner;

public class Input {
	private Employee[] emps;
	private Scanner sc; 
	int count=0;
	
	
	public Input(Employee[] emps) {
		this.emps = emps;
		this.sc = new Scanner(System.in);
		this.count=0;
}
	public int input() {
		String y_n=null;
		do {
			System.out.print("사원번호 : "); String empno = this.sc.nextLine();
			System.out.print("사원이름 : "); String name = this.sc.nextLine();
			System.out.print("기본급 : "); int base = this.sc.nextInt();
			System.out.print("야근시간 : ");int night = this.sc.nextInt();
			System.out.print("가족수 : "); int fam = this.sc.nextInt();
			this.sc.nextLine();//버퍼 날리기. 인트 다음에 스트링 나올때 버퍼 날리기. 다시 처음부터 다른사원 입력하니까. 
			this.emps[count++]=new Employee(empno, name, base, night, fam);
			System.out.println("Again(Y/N)? : ");
			y_n = this.sc.next();
			this.sc.nextLine();//버퍼 날리기. 인트 다음에 스트링 나올때 버퍼 날리기. 다시 처음부터 다른사원 입력하니까. 
		}while (y_n.equals("Y")||y_n.equals("y"));
			return count;
	}
	
}
