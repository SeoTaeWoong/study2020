package abstract_01;

import java.util.Calendar;
import java.util.Scanner;

/*
	[문제1]
	클래스명 : CalendarTest
	
	년도 입력 : 2002
	월 입력 : 10	
	
	일	월	화	수	목	금	토
			1	2	3	4	5
	6	7	8	9	10	11	12
	13	14	15	16	17	18	19
	20	21	22	23	24	25	26
	27	28	29	30	31
	
	기본생성자 - 년도, 월 입력
	calculator()
	display()
*/
class CalendarTest{
	private int year, month, week, lastDay;
	
	public CalendarTest() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
	}

	public void calculator() {
		//기준이 없으면 시스템 날짜 2020-01-03
		//기준을 바꾼다
		Calendar cal = Calendar.getInstance();
//		cal.set(cal.YEAR, year);
//		cal.set(cal.MONTH, month-1);
//		cal.set(cal.DAY_OF_MONTH, 1);
		
		cal.set(year,month-1,1);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		
	}
	
	public void display() {
		System.out.println("-------"+year+"년"+" "+month+"월"+"-------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}//for i
			for(int i=1; i<=lastDay; i++){
				System.out.print(i+"\t");
				if(week%7==0) System.out.println();
				week++;
			}
			 System.out.println("\n----------------------");
		}
}

public class CalendarMain {

	public static void main(String[] args) {
		CalendarTest calendarTest = new CalendarTest();
		calendarTest.calculator();
		calendarTest.display();
		
	}

}
