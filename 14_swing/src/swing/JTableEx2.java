package swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 extends JFrame implements ActionListener{
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton addBtn, deleteBtn;
	private JPanel bpL;
	
	
	public JTableEx2() {
		
		
		list = new ArrayList<PersonDTO>();
//		list.add(new PersonDTO("hong","ȫ�浿","1111","010-123-1234"));
//		list.add(new PersonDTO("ryan","���̾�","1234","010-123-1234"));
		
		vector = new Vector<String>();
		vector.addElement("���̵�");
		vector.addElement("�̸�");
		vector.add("��й�ȣ");
		vector.add("�ڵ���");
		
		model = new DefaultTableModel(vector,0) {
			@Override
			public boolean isCellEditable(int r, int c) {
				return (c!=0) ? true:false;
			
			}
		};//�� ���� ���� ����
		
		//������
		for(PersonDTO dto : list) {
			Vector<String> v = new Vector<String>();
			v.add(dto.getId());
			v.add(dto.getName());
			v.add(dto.getPwd());
			v.add(dto.getTel());
			
			model.addRow(v);
			//String name = JOptionPane.show.showInputDialog(this."�̸�")
			//���� - delete() �̸��� �Է¹޾Ƽ� ���� �Ȱ��� �̸� ��λ���
	
		}
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		addBtn = new JButton("�߰�");
		deleteBtn = new JButton("����");
		
		
		
		bpL = new JPanel();		

	
		add(addBtn);
		add(deleteBtn);
		addBtn.setBounds(340,320,60,30);
		deleteBtn.setBounds(410,320,60,30);

		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		add("Center", scroll);
		setBounds(200,200,500,400);		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void insert() {
		
		String id = JOptionPane.showInputDialog(this,"���̵� �Է��Ͻÿ�");
		if(id==null) return;
		for(int i=0; i<model.getRowCount();i++) {
			if(id.equals(model.getValueAt(i, 0))) {
				JOptionPane.showMessageDialog(this, "������� ���̵� �Դϴ�.");
				return;
			}
			
		}
		
		
		String name = JOptionPane.showInputDialog(this,"�̸��� �Է��Ͻÿ�");
		if(name==null) {
			JOptionPane.showMessageDialog(this, "�̸��Է¾��ؼ� ����"); 
			return;
			}
		String pwd = JOptionPane.showInputDialog(this,"��й�ȣ �Է��Ͻÿ�");
		if(pwd==null) return;
		String tel = JOptionPane.showInputDialog(this,"��ȭ��ȣ�� �Է��Ͻÿ�");
		if(tel==null) return;
		
		Vector<String> v = new Vector<String>();
		v.add(id);
		v.add(name);
		v.add(pwd);
		v.add(tel);
		
		model.addRow(v);
		JOptionPane.showMessageDialog(this, "��ϿϷ�");

	}
	
	public static void main(String[] args) {
		new JTableEx2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addBtn) {
			insert();
		}else if(e.getSource()==deleteBtn) {
			return;
		}
		
	}

	private void delete() {
		String name = JOptionPane.showInputDialog(this,"�̸��� �Է��Ͻÿ�");
		int sw = 0;
		
		for(int i=0; i<model.getRowCount(); i++) {
			if(name.equals(model.getValueAt(i, 1))) {
				model.removeRow(i);
				i--;
				sw=1;
			}
		}
		if(sw==0)
			JOptionPane.showMessageDialog(this, "���� �̸��� �Դϴ�");
		
	}
}