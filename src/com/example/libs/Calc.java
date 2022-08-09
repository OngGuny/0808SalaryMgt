package com.example.libs;

public class Calc {
	// 넘어오는 변수들 선언해준다.
	private Employee[] emps;
	private int count;

	// 생성자가 초기화하게 한다.
	public Calc(Employee[] emps, int count) {
		this.emps = emps;
		this.count = count;
	}

	// 변수를 받아서 어떻게 처리할껀지
	public void clac() {
		for (int i = 0; i < count; i++) {
			Employee emp = this.emps[i]; // i번째
			String empno = emp.getEmpno();// A522, A512 , C122
			String dpart = this.getDpart(empno.charAt(0));
			emp.setDpart(dpart); // 부서명 지정
			
			
			char code = empno.charAt(1); // 사원 번호 받아서 그 두번째 글자를 가져온다. 근데 숫자로 받아들임. 스트링으로
			// 바꾸려면. 스트링이랑 더하기 해주면됨 ""+empno.charat(1) 해주면 공백이랑 더해져서 스트링이 됨
			 int codeint = Integer.parseInt(String.valueOf(empno.charAt(1))); // 코드로 하는 방법도
			// 있음 api 가서 String클래스의 valueOf 사용
			// 구지 두번 바꿔야하나?
			//int codeint = empno.charAt(1);// 사원번호에 2번째 글짜 따옴
			int hopay = this.getHopay(codeint);// 호급수당 지정
			emp.setHopay(hopay);
			
			int nightpay = this.getNightpay(emp.getNight());// 바로넣기
			emp.setNightpay(nightpay);// 야간수당 지정

			int base = emp.getBase(); // 빼서 넣기
			int basePay = this.getBase(base);
			emp.setBase(basePay);// 기본급 지정

			int family = emp.getFam();
			int fampay = 7000 * family;
			emp.setFampay(fampay); // 가족수당 지정

			int total = hopay + nightpay + fampay + basePay;
			emp.setTotal(total);

			int tax = (int) (hopay * .1);

			int salary = total - tax;
			emp.setSalay(salary);// 실수령액 지정

		}
	}

	// Calc 안에서만 쓸꺼기 때문에 private도 ㄱㅊ
	// tot계산식을 얻기 전에 부품먼저 만듦.

	// 호급 수당 얻기 위한 메소드
	private int getHopay(int code) {
		int[] hopays = { 900000, 400000, 600000, 800000, 300000, 800000, 800000 };
		return hopays[code - 1]; // switch, 2중for문보다 훨씬간단;
	}

	private int getBase(int base) {
		int[] bases = { 15000, 25000, 35000, 45000 };
		return bases[base - 1];
	}

	// 사원번호로 부서명 얻기위한 메소드
	private String getDpart(char code) {
		String[] dparts = { "영업부", "업무부", "홍보부", "인사부", "경리부", "판촉부", "총무부" };
		return dparts[code - 65]; // 2항연산자 나오면 걍 int로 바꿈.

	}

	// 야간시간 받아서 야간수당 구하는 메소드
	// 3항연산자 사용
	private int getNightpay(int night) {
		return (night == 1) ? 1500 : (night == 2) ? 2500 : (night == 3) ? 3500 : 4500; // switch 쓰면 복잡하긴 하나 다른거 입력했을때
																						// 그런호봉은 없습니다. 표시 가능;
	}
	// private int getNightpay(int night) {
//		int[]nights = {1500,2500,3500,4500};
//		return nights[night-1];
//	}
//	

}
