package com.example.libs;

public class Sort {
	//먼저 받아야 하는 변수들 지정해준다 .
	private Employee[] emps;
	private int count;
	// 생성자로 초기화 
	public Sort(Employee[] emps, int count) {
		this.emps = emps;
		this.count = count;
	}
	// 소트하는 메소드 생성
	public void selectionSort() {
		for(int i =0;i<this.count;i++) {// 왜 count? 사원 이 몇명인가부터 출발하니까. 
			for(int j = i+1;j<this.count;j++) {// 문자열비교하는 api 사용. public int compareTo​(String anotherString) 맨마지막줄 메커니즘 설명되있음 앞뒤 글자의 유니코드 를 - 해서 양수.음수.0의 결과값을 나타냄
				if(this.emps[i].getEmpno().compareTo(this.emps[j].getEmpno())>0) { //i번째의 사원 번호를 가져와서 j번째의 사원 번호와 비교해서 양수가 나오면 자리를 바꾸고 아니면 가만히 둠 -> 오름차순이니까. 
					swap(i,j);
				}
			}
		}
		
	}
	// 스왑하는것도 빼도 된다. 보기좋게 
	private void swap(int front, int back) {
		Employee temp = this.emps[front];
		this.emps[front]=this.emps[back];
		this.emps[back]=temp;
	}
	
}
