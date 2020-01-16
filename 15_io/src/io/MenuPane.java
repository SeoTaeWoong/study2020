package io;

import java.awt.Container;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPane extends JMenuBar{
	private JMenu fileM, editM, viewM, altC,altX,altV;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM;
	public MenuPane() {
		//	����		����		����
		//  JMenuItem
		fileM = new JMenu("����");	editM = new JMenu("����");	viewM = new JMenu("����");
		newM = new JMenuItem("���θ����");	openM = new JMenuItem("����");
		saveM = new JMenuItem("����");		exitM = new JMenuItem("����");
		
		cutM = new JMenuItem("�߶󳻱�");		copyM = new JMenuItem("����");	pasteM = new JMenuItem("�ٿ��ֱ�");
		cutM.setMnemonic('x');				copyM.setMnemonic('c');			pasteM.setMnemonic('v');
		
		
		fileM.add(newM);	fileM.add(openM);	fileM.add(saveM);	fileM.add(exitM);
		editM.add(cutM);	editM.add(copyM);	editM.add(pasteM);
		
		
	
		add(fileM);
		add(editM);
		add(viewM);
	}
	
	public JMenuItem getNewM() {
		return newM;
	}
	public JMenuItem getExitM() {
		return exitM;
	}
	public JMenuItem getOpenM() {
		return openM;
	}
	public JMenuItem getSaveM() {
		return saveM;
	}
	public JMenuItem getCutM() {
		return cutM;
	}
	public JMenuItem getCopyM() {
		return copyM;
	}
	public JMenuItem getPasteM() {
		return pasteM;
	}
	public JMenu getAltC() {
		return altC;
	}
	public JMenu getAltX() {
		return altX;
	}
	public JMenu getAltV() {
		return altV;
	}
	
}