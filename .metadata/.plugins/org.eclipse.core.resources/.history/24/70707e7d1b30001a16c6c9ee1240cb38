package test;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Panel;

public class CalcMenu implements ActionListener {
	Button[] b = new Button[17];
	Label dap, disp;
	int count = 0;
	int zero_count = 0;
	double temp = 0;
	int sosujum = 0;
	String symbol = "";
	String s_temp = "0";
	String num = "";
	String num1 = "";
	String re_sTemp = "";
	String re_Symbol = "";

	public void view() {
		Font font = new Font("궁서", Font.BOLD, 40);
		Frame f = new Frame("계산기");
		dap = new Label("0");
		disp = new Label("");

		Label l2 = new Label();

		for (int i = 0; i < b.length; i++) {
			b[i] = new Button();
		}
		Choice ch = new Choice();
		ch.setSize(100, 150);
		ch.setLocation(60, 70);
		f.setBounds(700, 300, 300, 530);

		b[0].setLabel("C");
		b[0].setBounds(30, 200, 50, 50);
		b[1].setLabel("/");
		b[1].setBounds(90, 200, 50, 50);
		b[2].setLabel("*");
		b[2].setBounds(150, 200, 50, 50);
		b[3].setLabel("-");
		b[3].setBounds(210, 200, 50, 50);

		b[4].setLabel("7");
		b[4].setBounds(30, 260, 50, 50);
		b[5].setLabel("8");
		b[5].setBounds(90, 260, 50, 50);
		b[6].setLabel("9");
		b[6].setBounds(150, 260, 50, 50);
		b[7].setLabel("+");
		b[7].setBounds(210, 260, 50, 110);

		b[8].setLabel("4");
		b[8].setBounds(30, 320, 50, 50);
		b[9].setLabel("5");
		b[9].setBounds(90, 320, 50, 50);
		b[10].setLabel("6");
		b[10].setBounds(150, 320, 50, 50);

		b[11].setLabel("1");
		b[11].setBounds(30, 380, 50, 50);
		b[12].setLabel("2");
		b[12].setBounds(90, 380, 50, 50);
		b[13].setLabel("3");
		b[13].setBounds(150, 380, 50, 50);
		b[14].setLabel("Enter");
		b[14].setBounds(210, 380, 50, 110);

		b[15].setLabel("0");
		b[15].setBounds(30, 440, 110, 50);
		b[16].setLabel(".");
		b[16].setBounds(150, 440, 50, 50);

		for (int i = 0; i < b.length; i++) {
			f.add(b[i]);
		}

		disp.setBounds(40, 20, 50, 220);
		dap.setBounds(50, 50, 200, 220);
		dap.setFont(font);
		disp.setFont(new Font("궁서", Font.BOLD, 15));
		f.add(dap);
		f.add("North", disp);
		f.add(l2);
		f.setVisible(true);

		b[0].addActionListener(this);
		b[1].addActionListener(this);
		b[2].addActionListener(this);
		b[3].addActionListener(this);
		b[4].addActionListener(this);
		b[5].addActionListener(this);
		b[6].addActionListener(this);
		b[7].addActionListener(this);
		b[8].addActionListener(this);
		b[9].addActionListener(this);
		b[10].addActionListener(this);
		b[11].addActionListener(this);
		b[12].addActionListener(this);
		b[13].addActionListener(this);
		b[14].addActionListener(this);
		b[15].addActionListener(this);
		b[16].addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DecimalFormat df = new DecimalFormat("###,###.###");
		if(e.getSource() == b[14] && symbol.equals("=")) {
			num =df.format(temp)+re_Symbol+re_sTemp+"=";
			disp.setText(num);
			switch(re_Symbol) {
			case "/":
				temp = new CalcFunction().division(temp, Double.parseDouble(re_sTemp));
				break;
			case "*":
				temp = new CalcFunction().multiplication(temp, Double.parseDouble(re_sTemp));
				break;
			case "-":
				temp = new CalcFunction().minus(temp, Double.parseDouble(re_sTemp));
				break;
			case "+":
				temp = new CalcFunction().plus(temp, Double.parseDouble(re_sTemp));
				break;
			}
			dap.setText(df.format(temp)+"");
			s_temp = df.format(temp);
			symbol = "=";
			count = 0;
		}else if(e.getSource() == b[0]) {
			disp.setText("");
			num = "";
			num1 = "";
			symbol = "";
			s_temp = "0";
			temp = 0;
			count = 0;
			zero_count = 0;
			sosujum=0;
			dap.setText("0");
		} else if (e.getSource() == b[1]) { // 나누기
			
			if (count == 0) {
				temp = Double.parseDouble(s_temp);
				num = df.format(temp)+"/";
				disp.setText(num);
				s_temp = "0";
				symbol = "/";
				count++;
				// 만약 잘못 연산 기호를 입력했다면 바꿀기회가 사라지네..
			}else if(count == 1) {
				//잘못 연산기호를 입력했을때를 대비해서..
				num = df.format(temp)+"/";
				disp.setText(num);
				symbol = "/";
			}else  if(count >= 2){
				//카운트가 1이면 이미 한번 연산자가 들어왔다가 나간겁니다.
				//카운트가 2이면 두번째 값을 입력받은것입니다.
				//연산을 할수있게 만들어줍니다.
				//temp에는 무엇인가 값이 입력되있을것이고 그 값과 이전에 입력됬을 연산부를 찾아 계산해주면 됩니다
				num = num+"/";
				disp.setText(num);
				switch(symbol) {
				case "/":
					temp = new CalcFunction().division(temp, Double.parseDouble(s_temp));
					break;
				case "*":
					temp = new CalcFunction().multiplication(temp, Double.parseDouble(s_temp));
					break;
				case "-":
					temp = new CalcFunction().minus(temp, Double.parseDouble(s_temp));
					break;
				case "+":
					temp = new CalcFunction().plus(temp, Double.parseDouble(s_temp));
					break;
				}
				dap.setText(df.format(temp)+"");
				s_temp = "0";
				symbol = "/";
				count = 1;
			}
			sosujum=0;
			num1=num;
			zero_count = 0;
		} else if (e.getSource() == b[2]) { // 곱하기
			if (count == 0) {
				temp = Double.parseDouble(s_temp);
				num = df.format(temp)+"*";
				disp.setText(num);
				s_temp = "0";
				symbol = "*";
				count++;
			}else if(count == 1) {
				//잘못 연산기호를 입력했을때를 대비해서..
				num = df.format(temp)+"*";
				disp.setText(num);
				symbol = "*";
			}else if(count >= 2){
				//카운트가 1이면 이미 한번 연산자가 들어왔다가 나간겁니다.
				//카운트가 2이면 두번째 값을 입력받은것입니다.
				//연산을 할수있게 만들어줍니다.
				//temp에는 무엇인가 값이 입력되있을것이고 그 값과 이전에 입력됬을 연산부를 찾아 계산해주면 됩니다
				num = num+"*";
				disp.setText(num);
				switch(symbol) {
				case "/":
					temp = new CalcFunction().division(temp, Double.parseDouble(s_temp));
					break;
				case "*":
					temp = new CalcFunction().multiplication(temp, Double.parseDouble(s_temp));
					break;
				case "-":
					temp = new CalcFunction().minus(temp, Double.parseDouble(s_temp));
					break;
				case "+":
					temp = new CalcFunction().plus(temp, Double.parseDouble(s_temp));
					break;
				}
				dap.setText(df.format(temp)+"");
				s_temp = "0";
				symbol = "*";
				count = 1;
			}
			sosujum=0;
			num1=num;
			zero_count = 0;
		} else if (e.getSource() == b[3]) { // 빼기 0일때 입력가능 숫자후에 입력가능
			if (count == 0) {
				temp = Double.parseDouble(s_temp);
				num = df.format(temp)+"-";
				disp.setText(num);
				s_temp = "0";
				symbol = "-";
				count++;
			}else if(count == 1) {
				//잘못 연산기호를 입력했을때를 대비해서..
				num = df.format(temp)+"-";
				disp.setText(num);
				symbol = "-";
			}else if(count >= 2){
				//카운트가 1이면 이미 한번 연산자가 들어왔다가 나간겁니다.
				//카운트가 2이면 두번째 값을 입력받은것입니다.
				//연산을 할수있게 만들어줍니다.
				//temp에는 무엇인가 값이 입력되있을것이고 그 값과 이전에 입력됬을 연산부를 찾아 계산해주면 됩니다
				num = num+"-";
				disp.setText(num);
				switch(symbol) {
				case "/":
					temp = new CalcFunction().division(temp, Double.parseDouble(s_temp));
					break;
				case "*":
					temp = new CalcFunction().multiplication(temp, Double.parseDouble(s_temp));
					break;
				case "-":
					temp = new CalcFunction().minus(temp, Double.parseDouble(s_temp));
					break;
				case "+":
					temp = new CalcFunction().plus(temp, Double.parseDouble(s_temp));
					break;
				}
				dap.setText(df.format(temp)+"");
				s_temp = "0";
				symbol = "-";
				count = 1;
			}
			sosujum=0;
			num1=num;
			zero_count = 0;
		} else if (e.getSource() == b[4]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "7";
					disp.setText(num);
					s_temp = "7";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "7";
					disp.setText(num);
					s_temp = s_temp + "7";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "7";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "7";
					disp.setText(num);
					s_temp = s_temp + "7";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[5]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "8";
					disp.setText(num);
					s_temp = "8";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "8";
					disp.setText(num);
					s_temp = s_temp + "8";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "8";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "8";
					disp.setText(num);
					s_temp = s_temp + "8";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[6]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "9";
					disp.setText(num);
					s_temp = "9";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "9";
					disp.setText(num);
					s_temp = s_temp + "9";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "9";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "9";
					disp.setText(num);
					s_temp = s_temp + "9";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[7]) { // 더하기
			if (count == 0) {
				temp = Double.parseDouble(s_temp);
				num = df.format(temp)+"+";
				disp.setText(num);
				s_temp = "0";
				symbol = "+";
				count++;
			}else if(count == 1) {
				//잘못 연산기호를 입력했을때를 대비해서..
				num = df.format(temp)+"+";
				disp.setText(num);
				symbol = "+";
			}else if(count >= 2){
				//카운트가 1이면 이미 한번 연산자가 들어왔다가 나간겁니다.
				//카운트가 2이면 두번째 값을 입력받은것입니다.
				//연산을 할수있게 만들어줍니다.
				//temp에는 무엇인가 값이 입력되있을것이고 그 값과 이전에 입력됬을 연산부를 찾아 계산해주면 됩니다
				num = num+"+";
				disp.setText(num);
				switch(symbol) {
				case "/":
					temp = new CalcFunction().division(temp, Double.parseDouble(s_temp));
					break;
				case "*":
					temp = new CalcFunction().multiplication(temp, Double.parseDouble(s_temp));
					break;
				case "-":
					temp = new CalcFunction().minus(temp, Double.parseDouble(s_temp));
					break;
				case "+":
					temp = new CalcFunction().plus(temp, Double.parseDouble(s_temp));
					break;
				}
				dap.setText(df.format(temp)+"");
				s_temp = "0";
				symbol = "+";
				count = 1;
			}
			sosujum=0;
			num1=num;
			zero_count = 0;
		} else if (e.getSource() == b[8]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "4";
					disp.setText(num);
					s_temp = "4";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "4";
					disp.setText(num);
					s_temp = s_temp + "4";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "4";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "4";
					disp.setText(num);
					s_temp = s_temp + "4";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[9]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "5";
					disp.setText(num);
					s_temp = "5";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "5";
					disp.setText(num);
					s_temp = s_temp + "5";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "5";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "5";
					disp.setText(num);
					s_temp = s_temp + "5";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[10]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "6";
					disp.setText(num);
					s_temp = "6";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "6";
					disp.setText(num);
					s_temp = s_temp + "6";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "6";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "6";
					disp.setText(num);
					s_temp = s_temp + "6";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[11]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "1";
					disp.setText(num);
					s_temp = "1";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "1";
					disp.setText(num);
					s_temp = s_temp + "1";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "1";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "1";
					disp.setText(num);
					s_temp = s_temp + "1";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[12]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "2";
					disp.setText(num);
					s_temp = "2";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "2";
					disp.setText(num);
					s_temp = s_temp + "2";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "2";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "2";
					disp.setText(num);
					s_temp = s_temp + "2";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[13]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0");
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				if(zero_count == 1 || zero_count == 0) {
					num = "3";
					disp.setText(num);
					s_temp = "3";
					dap.setText(s_temp);
					zero_count=2;
				}else {
					num = num + "3";
					disp.setText(num);
					s_temp = s_temp + "3";
					dap.setText(s_temp);
					zero_count=2;
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 1|| zero_count == 0) {
					s_temp = "3";
					num = num1 + Integer.parseInt(s_temp);
					disp.setText(num);
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}else {
					num = num + "3";
					disp.setText(num);
					s_temp = s_temp + "3";
					dap.setText(s_temp);
					count++;
					zero_count=2;
				}
			}
		} else if (e.getSource() == b[14]) { // 결과
			
			if (count == 0) {
				temp = Double.parseDouble(s_temp);
				num = df.format(temp)+"=";
				disp.setText(num);
				s_temp = "0";
				symbol = "=";
				count++;
			}else if(count == 1) {
				//잘못 연산기호를 입력했을때를 대비해서..
				num = df.format(temp)+"=";
				disp.setText(num);
				symbol = "=";
			}else if(count >= 2){
				//카운트가 1이면 이미 한번 연산자가 들어왔다가 나간겁니다.
				//카운트가 2이면 두번째 값을 입력받은것입니다.
				//연산을 할수있게 만들어줍니다.
				//temp에는 무엇인가 값이 입력되있을것이고 그 값과 이전에 입력됬을 연산부를 찾아 계산해주면 됩니다
				num = num+"=";
				disp.setText(num);
				switch(symbol) {
				case "/":
					temp = new CalcFunction().division(temp, Double.parseDouble(s_temp));
					break;
				case "*":
					temp = new CalcFunction().multiplication(temp, Double.parseDouble(s_temp));
					break;
				case "-":
					temp = new CalcFunction().minus(temp, Double.parseDouble(s_temp));
					break;
				case "+":
					temp = new CalcFunction().plus(temp, Double.parseDouble(s_temp));
					break;
				}
				re_sTemp = s_temp;
				re_Symbol = symbol;
				dap.setText(df.format(temp)+"");
				s_temp = df.format(temp);
				symbol = "=";
				count = 0;
			}
			zero_count = 0;
		} else if (e.getSource() == b[15]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0"); 
			}
			if(count == 0) {
				// 카운트가 0인경우는 temp의 값이 0이거나 아직 수를 입력중인 상태이다.
				// 영카운트는 한번만 사용가능하거나  앞에 숫자가 입력됬을경우에만 연속 사용이 가능하다.
				if(zero_count == 0) {
					//단독으로 사용할경우
					num = "0";
					disp.setText(num);
					s_temp = "0";
					dap.setText(s_temp);
					zero_count++;
				}else if(zero_count == 2) {
					//앞에 숫자가 입력된 경우
					num = num + "0";
					disp.setText(num);
					s_temp = s_temp + "0";
					dap.setText(s_temp);
				}
			}else if(count >= 1) {
				//카운트가 1인경우 이미 temp에 값이 들어있는경우이다.
				if(zero_count == 0 && count == 1) {
					num1 = num;
					num = num + "0";
					disp.setText(num);
					s_temp = s_temp + "0";
					dap.setText(s_temp);
					zero_count++;
					count++;
				}else if(zero_count == 2){
					num = num + "0";
					disp.setText(num);
					s_temp = s_temp + "0";
					dap.setText(s_temp);
					count++;
				}
			}
		} else if (e.getSource() == b[16]) {
			if(symbol.equals("=")) {
				disp.setText(""); num = ""; num1 = ""; symbol = ""; s_temp = "0"; 
				temp = 0; count = 0; zero_count = 0; dap.setText("0"); 
			}
			if (zero_count == 0 || zero_count == 1 && sosujum == 0) {
				num = df.format(temp)+".";
				disp.setText(num);
				s_temp = s_temp + ".";
				dap.setText(s_temp);
				zero_count=2;
				sosujum++;
			}else if(sosujum == 0) {
				num = num+".";
				disp.setText(num);
				s_temp = s_temp + ".";
				dap.setText(s_temp);
				zero_count=2;
				sosujum++;
			}
		}
	}
}
