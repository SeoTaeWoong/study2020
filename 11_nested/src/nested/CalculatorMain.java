package nested;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CalculatorMain extends JFrame {
   private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
   private JButton btn10,btnSum,btnAdd,btnSub,btnMul,btnDiv,btnBc,btnReset;
   private JLabel jl1,jl2;
   
   public CalculatorMain() {
      setLayout(null);
      
      //숫자 버튼
      btn0 = new JButton("0");
      btn1 = new JButton("1");
      btn2 = new JButton("2");
      btn3 = new JButton("3");
      btn4 = new JButton("4");
      btn5 = new JButton("5");
      btn6 = new JButton("6");
      btn7 = new JButton("7");
      btn8 = new JButton("8");
      btn9 = new JButton("9");
      
      //기호 버튼
      btn10 = new JButton(".");
      btnSum = new JButton("=");
      btnAdd = new JButton("+");
      btnSub = new JButton("-");
      btnMul = new JButton("X");
      btnDiv = new JButton("/");
      
      //←,C 버튼
      btnBc = new JButton("←");
      btnReset = new JButton("C");

      //라벨
      jl1 = new JLabel("0", JLabel.RIGHT); 
      jl1.setBackground(Color.WHITE);
      jl1.setOpaque(true);
      jl1.setBounds(9,70,375,50);
      
      jl2 = new JLabel("", JLabel.RIGHT); 
      jl2.setBackground(Color.WHITE);
      jl2.setOpaque(true);
      jl2.setBounds(9,10,375,50);
      
      btnReset.setBounds(199,130,185,50);
      btnBc.setBounds(9,130,185,50);
      
      btnDiv.setBounds(294,190,90,50);
      btn9.setBounds(199,190,90,50);
      btn8.setBounds(104,190,90,50);
      btn7.setBounds(9,190,90,50);
      
      btnMul.setBounds(294,250,90,50);
      btn6.setBounds(199,250,90,50);
      btn5.setBounds(104,250,90,50);
      btn4.setBounds(9,250,90,50);
      
      btnSub.setBounds(294,310,90,50);
      btn3.setBounds(199,310,90,50);
      btn2.setBounds(104,310,90,50);
      btn1.setBounds(9,310,90,50);
      
      btnAdd.setBounds(294,370,90,50);
      btnSum.setBounds(199,370,90,50);
      btn0.setBounds(104,370,90,50);
      btn10.setBounds(9,370,90,50);
      
      add(jl2);
      add(jl1);
      
      add(btnReset);
      add(btnBc);
      add(btnDiv);
      add(btnMul);
      add(btnSub);
      add(btnAdd);
      add(btnSum);
      add(btn10);
      add(btn9);
      add(btn8);
      add(btn7);
      add(btn6);
      add(btn5);
      add(btn4);
      add(btn3);
      add(btn2);
      add(btn1);
      add(btn0);
      
      setTitle("계산기");
      setBounds(800,300,400,460);
      setResizable(false);//창고정
      setVisible(true);

   }

   public static void main(String[] args) {
      new CalculatorMain();

   }
}