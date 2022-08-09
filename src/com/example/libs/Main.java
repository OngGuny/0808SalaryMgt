package com.example.libs;

public class Main {
public static void main(String[] args) {
	Employee[] emps=new Employee[10]; //40byte의 배열의 주소를 알고있따. 지정되면못바꿈 
	//input부터 호출하면된다. 
	Input input = new Input(emps);
	int count = input.input();
	
	//calc 생성자가 만들어졌으니 
	Calc calc = new Calc(emps, count);
	// calc 메소드 불러주면된다. 
	calc.clac(); 
	
	//sort 클래스 받아서 생성자 만들어줌 
	Sort sort= new Sort(emps, count);
	// sort 클래스 안에는 뭐가있니 소트 기능 있으니 불러줌 
	sort.selectionSort();
	
	//output을 풀로 받아서 
	Output output = new Output(emps, count);
	// 아웃풋 클래스의 아웃풋 메소드를 실행시켜줌 
	output.output();
	
}
}
