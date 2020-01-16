package constructor;

import java.util.Scanner;

public class MemberMain {
	// 생성자 사용
	MemberDTO[] mDTO = new MemberDTO[5];

	public void menu() {
		Scanner sc = new Scanner(System.in);
		String choice;
		int count = 0;
		
		
		LOOP: while (true) {
			System.out.println("***********");
			System.out.println("  1. 가입");
			System.out.println("  2. 출력");
			System.out.println("  3. 수정");
			System.out.println("  4. 탈퇴");
			System.out.println("  5. 끝내기");
			System.out.println("***********");
			System.out.print(" 번호 : ");
			choice = sc.next();

			switch (choice) {
			case "1":
				count = insert(count,sc);
				break;
			case "2":
				list();
				break;
			case "3":
				update(sc);
				break;
			case "4":
				count = delete(count,sc);
				break;
			case "5":
				sc.close();
				System.out.println("프로그램 종료");
				break LOOP;
			default:
				System.out.println("입력이 바르지 않습니다.");
			}
		}
		
	}
	public int insert(int count,Scanner sc) {
		int i = 0;
		for(; i<mDTO.length; i++) { //빈공간 찾기
			if(mDTO[i] == null) break;
		}
		if (i >= 5) {
			System.out.println("5명의 정원이 꽉 찼습니다...");
			
		}else {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			System.out.print("나이 입력 : ");
			String age = sc.next();
			System.out.print("핸드폰 입력 : ");
			String phon = sc.next();
			System.out.print("주소 입력 : ");
			String addr = sc.next();
			mDTO[i] = new MemberDTO(name, age, phon, addr);
			
			System.out.println("1 row created");
			System.out.println(mDTO.length-++count+"자리 남았습니다");
		}
		return count;
	}

	public void list() {
		
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for(int i = 0; i<mDTO.length; i++) {
			if(mDTO[i] != null)
			System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
					"\t" +mDTO[i].getPhon() + "\t"+ mDTO[i].getAddr());
		}
		System.out.println();
	}

	public void update(Scanner sc) {

		System.out.println("핸드폰 번호 입력: ");
		String check_phon = sc.next();
		for (int i = 0; i < mDTO.length; i++) {
			if (mDTO[i] != null && check_phon.equals(mDTO[i].getPhon())) {
				System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
						"\t" + mDTO[i].getPhon() + "\t"	+ mDTO[i].getAddr());
				System.out.print("수정 할 이름 입력: ");
				String name = sc.next();
				System.out.print("수정 할 나이 입력: ");
				String age = sc.next();
				System.out.print("수정 할 핸드폰 입력: ");
				String phon = sc.next();
				System.out.print("수정 할 주소 입력: ");
				String addr = sc.next();
				mDTO[i] = new MemberDTO(name, age, phon, addr);
				System.out.println("1 row(s) updated");
				return;
			}
		}
		System.out.println("찾는 회원이 없습니다.");
	}

	public int delete(int count,Scanner sc) {
		System.out.print("핸드폰 번호 입력: ");
		String check_phon = sc.next();
		for (int i = 0; i < mDTO.length; i++) {
			if (mDTO[i] != null && check_phon.equals(mDTO[i].getPhon())) {
				System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
						"\t" + mDTO[i].getPhon() + "\t\t"	+ mDTO[i].getAddr());
				System.out.println("1 row deleted");
				mDTO[i] = null;
				count--;
				return count;
			}
		}
		System.out.println("찾는 회원이 없습니다.");
		return count;
	}

	

	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.menu();
	}
	
//------------------ set을 사용하며 필드에 MemberDTO안쓰고 풀어보기 ----------------
/*		int cnt = 0; //몇명의 사용자가 가입되어있는지 확인하는 변수
		public void menu() {
		MemberDTO[] mDTO = new MemberDTO[5];
		
		Scanner sc = new Scanner(System.in);
		String choice;
		for(;;) {
			System.out.println("***********");
			System.out.println("  1. 가입");
			System.out.println("  2. 출력");
			System.out.println("  3. 수정");
			System.out.println("  4. 탈퇴");
			System.out.println("  5. 끝내기");
			System.out.println("***********");

			System.out.print(" 번호 : ");
			choice = sc.next();
			
			if(choice.equals("1")) {
				insert(mDTO,sc);
			}else if(choice.equals("2")) {
				list(mDTO);
			}else if(choice.equals("3")) {
				update(mDTO,sc);
			}else if(choice.equals("4")) {
				delete(mDTO,sc);
			}else if(choice.equals("5")) {
				sc.close();
				System.out.println("프로그램 종료");
				break;
			}else {
				
			}
		}
	}  
		public void insert(MemberDTO[] mDTO,Scanner sc) {
			if(cnt == 5) {
				System.out.println("5명의 정원이 꽉 찼습니다...");
			}else {
				mDTO[cnt] = new MemberDTO();
				System.out.print("이름 입력: ");
				mDTO[cnt].setName(sc.next()); 
				System.out.print("나이 입력: ");
				mDTO[cnt].setAge(sc.next()); 
				System.out.print("핸드폰 입력: ");
				mDTO[cnt].setPhon(sc.next()); 
				System.out.print("주소 입력: ");
				mDTO[cnt].setAddr(sc.next());
				System.out.println("1 row created");
				cnt++;
				System.out.println(mDTO.length-cnt+"자리 남았습니다");
			}
		}
		public void list(MemberDTO[] mDTO) {
			System.out.println("이름\t나이\t핸드폰\t\t주소");
			for(int i = 0; i<cnt;i++) {
				System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
						"\t" +mDTO[i].getPhon() + "\t"+ mDTO[i].getAddr());
			}
		}
		public void update(MemberDTO[] mDTO, Scanner sc) {
			System.out.print("핸드폰 번호 입력: ");
			String check_phon = sc.next();
			for(int i = 0; i<cnt; i++) {
				if(check_phon.equals(mDTO[i].getPhon())) {
					System.out.println(mDTO[i].getName() + "\t" + mDTO[i].getAge() +
							"\t" + mDTO[i].getPhon() + "\t"+ mDTO[i].getAddr());
					System.out.print("수정 할 이름 입력: ");
					mDTO[i].setName(sc.next());
					System.out.print("수정 할 나이 입력: ");
					mDTO[i].setAge(sc.next());
					System.out.print("수정 할 핸드폰 입력: ");
					mDTO[i].setPhon(sc.next());
					System.out.print("수정 할 주소 입력: ");
					mDTO[i].setAddr(sc.next());
					
					System.out.println("1 row(s) updated");
					break;
				}else if(i == cnt-1) {
					System.out.println("찾는 회원이 없습니다.");
				}
			}
		}
		
		public void delete(MemberDTO[] mDTO, Scanner sc) {

			System.out.print("핸드폰 번호 입력: ");
			String check_phon = sc.next();
			for(int i = 0; i<cnt; i++) {
				if(check_phon.equals(mDTO[i].getPhon())) { //입력값이랑 일치하는 핸드폰번호가 있으면
					mDTO[i] = null;
					System.out.println("1 row(s) delete");
					for(int n = i; n< cnt; n++) { 
						if(n<4)	mDTO[n] = mDTO[n+1];
					}
					cnt--;
					break;
				}else if(i == cnt-1) {
					System.out.println("찾는 회원이 없습니다.");
				}
			}
		}*/
}
