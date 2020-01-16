package test;

public class CalcFunction {

	///////////// 더하기////////////
	public int plus(int su1, int su2) {
		return su1 + su2;
	}

	public double plus(double su1, double su2) {
		return su1 + su2;
	}

	///////////// 빼기/////////////
	public int minus(int su1, int su2) {
		return su1 - su2;
	}

	public double minus(double su1, double su2) {
		return su1 - su2;
	}

	//////////// 곱셈//////////////
	public int multiplication(int su1, int su2) {
		return su1 * su2;
	}

	public double multiplication(double su1, double su2) {
		return su1 * su2;
	}

	//////////// 나누기/////////////
	public int division(int su1, int su2) {
		return su1 / su2;
	}

	public double division(double su1, double su2) {
		return su1 / su2;
	}
	
	//나머지
	public int remainder(int su1, int su2) {
		return su1 % su2;
	}
	
	
	 public int decomposition(String ept) {
		// 입력받은 문자열들중 + - * / % 의 위치를 찾는다.
		 int sign = 0; // 부호가 몇개 들어있는지
		 String[] sNum;
		
		 for(int data = 0; data < ept.length();data++) {// ept에입력된 부호들의 갯수를 구하는 반복문
			if(ept.charAt(data) == '+' || ept.charAt(data) == '-' || ept.charAt(data) == '*' ||ept.charAt(data) == '/'||ept.charAt(data) == '%') { 
				if(ept.charAt(data+1) == '+' || ept.charAt(data+1) == '-') {
					
				}else sign++;
			}else if(ept.charAt(data) == '=' ) {
				 break;
			 }
		}
		 sNum = new String[sign+1];
		 
		for(int i=0; i<sNum.length;i++) {
			for(int j = 0 ; j<ept.length(); j++) //부호가 나오면  해당 for문을 빠져나가라
				if(ept.charAt(i) == '+' || ept.charAt(i) == '-' || ept.charAt(i) == '*' ||ept.charAt(i) == '/'||ept.charAt(i) == '%')
					break;
				else sNum[i] = sNum[i]+ept.charAt(j); //부호가 나오기 전까지의 값을 sNum에 저장
		}
		 
		 
		
		return 0;
	}

}
