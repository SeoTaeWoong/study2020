package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class MultiArray6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] name;
		int cnt = 0;
		int subjectCnt = 0;
		String[][] subject = null;
		double[][] jumsu = null;
		int sum[];
		double avg[];
		
		System.out.print("인원수: ");
		cnt = Integer.parseInt(br.readLine());
		name = new String[cnt];
		sum = new int[cnt];
		avg = new double[cnt];
		subject = new String[cnt][]; // 과목명
		jumsu = new double[cnt][]; // 과목점수
		for (int i = 0; i < cnt; i++) {
			System.out.println();
			System.out.print("이름 입력: ");
			name[i] = br.readLine();
			System.out.print("과목수 입력 : ");
			subjectCnt = Integer.parseInt(br.readLine()); //과목수
			subject[i] = new String[subjectCnt];
			jumsu[i] = new double[subjectCnt+2];
			
			for (int j = 0; j < subject[i].length; j++) {				
				System.out.print("과목명 입력 : ");
				subject[i][j] = br.readLine();
				
			}
			for(int j = 0; j<subjectCnt; j++) {
				System.out.print(subject[i][j]+" 점수 입력: ");
				jumsu[i][j] = Double.parseDouble(br.readLine());
				jumsu[i][subjectCnt] += jumsu[i][j]; 
			}
			jumsu[i][subjectCnt+1] =jumsu[i][subjectCnt]/subjectCnt; 
		}
		for(int i = 0; i< cnt; i++) {
			System.out.print("이름\t");
			for(int j=0;j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("총점\t평균");
			
			System.out.print(name[i]+"\t");
			for(int j =0; j<jumsu[i].length-1;j++) {
				System.out.print((int)jumsu[i][j]+"\t");
			}
			
			System.out.println(String.format("%.2f \t", jumsu[i][jumsu[i].length-1]));
			System.out.println();
		}
		
	}
}
//가변길이
/* 인원수:2(cnt)
* 
* 이름입력: 홍길동(name)
* 과목수 입력 :2 (subjectCnt)
* 과목명 입력 : 국어(subject)
* 과목명 입력: 영어
* 국어 점수 입력:95 (jumsu)
* 영어 점수 입력 : 100
* -------------
* 이름입력: 강백(name)
* 과목수 입력 :3 (subjectCnt)
* 과목명 입력 : 국어(subject)
* 과목명 입력 : 영어
* 과목명 입력 : 과학
* 국어 점수 입력:95 (jumsu)
* 영어 점수 입력 : 100
* 과학 점수 입력 : 78
* 
* 
* 
* 이름	국어	영어	총점	평균
* 홍길동	95	100	xxx	xx.xx

* 
* 홍길동	95	100	80	xxx xx.xx
*/