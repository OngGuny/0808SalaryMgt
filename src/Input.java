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
			System.out.println("사원번호 : "); String empno = this.sc.nextLine();
			System.out.println("사원이름 : "); String name = this.sc.nextLine();
			this.sc.nextLine();
			System.out.println("기본급 : "); int base = this.sc.nextInt();
			System.out.println("야근시간 : ");int night = this.sc.nextInt();
			System.out.println("가족수 : "); int fam = this.sc.nextInt();
			this.emps[count++]=new Employee(empno, name, base, night, fam);
			System.out.println("Again(Y/N)? : ");
			y_n = this.sc.next();
		}while (y_n.equals("Y")||y_n.equals("y"));
			return count;
	}
	
}
