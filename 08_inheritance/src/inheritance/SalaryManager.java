package inheritance;

import java.util.Scanner;

public class SalaryManager {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		EmployeeDTO[] eDTO = new EmployeeDTO[5];
		while (true) {
			System.out.println("*************************");
			System.out.println("\t1.등록");
			System.out.println("\t2.출력");
			System.out.println("\t3.수정");
			System.out.println("\t4.검색");
			System.out.println("\t5.종료");
			System.out.println("*************************");
			System.out.print("  >> ");
			switch(sc.nextInt()) {
			case 1:
				cnt = input(sc,eDTO,cnt);
				break;
			case 2:
				output(eDTO,cnt);
				break;
			case 3:
				update(sc,eDTO,cnt);
				break;
			case 4:
				search(sc,eDTO,cnt);
				break;
			case 5:
				return;
			default :
				System.out.println("**입력값이 바르지 않습니다.**");
			}
			System.out.println();
		}
	}
	public int input(Scanner sc, EmployeeDTO[] eDTO,int cnt) {
		eDTO[cnt] = new EmployeeDTO();
		System.out.print("이름 입력: ");
		eDTO[cnt].setName(sc.next());
		System.out.print("직급 입력: ");
		eDTO[cnt].setRank(sc.next());
		System.out.print("기본급 입력: ");
		eDTO[cnt].setPay(sc.nextInt());
		System.out.print("수당 입력: ");
		eDTO[cnt].setExtraPay(sc.nextInt());
		
		return ++cnt;
		
	}
	public void output(EmployeeDTO[] eDTO, int cnt) {
		System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
		if(cnt == 0) {
			System.out.println("등록된 직원이 없습니다.");
			return;
		} 
		for(int i = 0; i<cnt; i++) {
			System.out.println(eDTO[i].getName()+"\t"+eDTO[i].getRank()+"\t"+eDTO[i].getPay()+"\t"+eDTO[i].getExtraPay()+"\t"+eDTO[i].getTax()+"\t"+eDTO[i].getSalary());
		}
	}
	public void update(Scanner sc,EmployeeDTO[] eDTO,int cnt) {
		System.out.println("이름 입력: ");
		String check= sc.next();
		for(int i = 0; i<cnt; i++) {
			if(check.equals(eDTO[i].getName())) {
				System.out.print("수정할 직급 입력: ");
				eDTO[i].setRank(sc.next());
				System.out.print("수정할 기본급 입력: ");
				eDTO[i].setPay(sc.nextInt());
				System.out.print("수정할 수당 입력: ");
				eDTO[i].setExtraPay(sc.nextInt());
			}
		}
	}
	public void search(Scanner sc,EmployeeDTO[] eDTO, int cnt) {
		System.out.println("이름 입력: ");
		String check= sc.next();
		if(cnt == 0) {
			System.out.println("등록된 직원이 없습니다.");
			return;
		} 
		for(int i = 0; i<cnt; i++) {
			if(check.equals(eDTO[i].getName())) {
				System.out.println("이름\t직급\t기본급\t수당\t세율\t월급");
				System.out.println(eDTO[i].getName()+"\t"+eDTO[i].getRank()+"\t"+eDTO[i].getPay()+"\t"+eDTO[i].getExtraPay()+"\t"+eDTO[i].getTax()+"\t"+eDTO[i].getSalary());
				return;
			}
		}
		System.out.println("찾으시는 직원은 없는 직원입니다.");
	}
}
