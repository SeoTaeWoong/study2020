package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();;
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		int num=0;
		while(true) {
			System.out.println();
			System.out.println("************");
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.검색");
			System.out.println("4.삭제");
			System.out.println("5.정렬");
			System.out.println("6.끝");
			System.out.println("************");
			System.out.print("번호 : ");
			num = sc.nextInt();
			if (num == 6) break;
			
			if(num==1) insertArticle();
			else if(num==2) printArticle();
			else if(num==3) searchArticle();
			else if(num==4) deleteArticle();
			else if(num==5) sortArticle();
			else {
				System.out.println("1~6중에 선택하세요");
			}
		}//while
	
	}
	private void insertArticle() {
		SungJukDTO sjd = new SungJukDTO();
		
		System.out.print("번호 입력 : ");
		sjd.setKey(sc.nextInt());
		System.out.print("이름 입력 : ");
		sjd.setName(sc.next());
		System.out.print("국어 입력 : ");
		sjd.setKor(sc.nextInt());
		System.out.print("영어 입력 : ");
		sjd.setEng(sc.nextInt());		
		System.out.print("수학 입력 : ");
		sjd.setMath(sc.nextInt());
		
		//sjd.calc();
		list.add(sjd);
		System.out.println("입력 완료");

	}
	
	private void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO dto : list) {
			dto.calc();
//			System.out.println(dto.getKey()+"\t"+ dto.getName()+"\t"+dto.getKor()+"\t"+dto.getEng()+"\t"+dto.getMath()+"\t"+dto.getTot()
//			+"\t"+dto.getAvg());
			System.out.println(dto);
		}
	}

	private void searchArticle() {
		
		System.out.print("찾는 이름 입력 : ");
		String name = sc.next();
		int cnt = 0;
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(dto);
				cnt++;
			}
		}
		if(cnt==0)System.out.println("찾는 회원이 없습니다.");

	}
	private void deleteArticle() {
		System.out.println("삭제할 회원 이름 입력 : ");
		String name = sc.next();
		int cnt=0;
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next();
		
			if(dto.getName().equals(name))  {
				it.remove();
				cnt++;
			}
		}if(cnt==0) {
			System.out.println("찾는 회원이 없습니다.");
		}else System.out.println(name+"삭제되었습니다");
	}
	
	
	private void sortArticle() {
		int num =0;
		while(true) {
			System.out.println("1.이름으로 오름차순");
			System.out.println("2.총점으로 오름차순");
			System.out.println("3.이전메뉴");
			System.out.println("번호 입력 : ");
			num = sc.nextInt();
			if(num==3) break;
			if(num==1) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
					@Override
					public int compare(SungJukDTO dto1, SungJukDTO dto2) {
						return dto1.getName().compareTo(dto2.getName());
					}
					
				};
				Collections.sort(list,com);
				printArticle();
				
			}
			else if(num==2){
				Collections.sort(list);
				printArticle();
			}
		}
			
	}
	
}

	


