package class_1;

public class SungJukMain1 {
	public static void main(String[] args) {
		SungJuk aa = new SungJuk(); //��ü ����
		aa.setName("ȫ�浿");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		aa.calc();//���� ��� ���
		System.out.println(aa.getName()+"\t"+aa.getKor()+"\t"+aa.getEng()+"\t"+aa.getMath()+"\t"+aa.getTot()+"\t"+aa.getAvg()+"\t"+aa.getGrade());
		SungJuk bb = new SungJuk();
		bb.setName("�����");
		bb.setKor(95);
		bb.setEng(85);
		bb.setMath(97);
		bb.calc();//���� ��� ���
		System.out.println(bb.getName()+"\t"+bb.getKor()+"\t"+bb.getEng()+"\t"+bb.getMath()+"\t"+bb.getTot()+"\t"+bb.getAvg()+"\t"+bb.getGrade());
		SungJuk cc = new SungJuk();
		cc.setName("zz");
		cc.setKor(85);
		cc.setEng(96);
		cc.setMath(92);
		cc.calc();//���� ��� ���
		System.out.println(cc.getName()+"\t"+cc.getKor()+"\t"+cc.getEng()+"\t"+cc.getMath()+"\t"+cc.getTot()+"\t"+cc.getAvg()+"\t"+cc.getGrade());
		
	}
}
