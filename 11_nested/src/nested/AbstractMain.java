package nested;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {//�͸� �̳� Ŭ����
			@Override
			public void setName(String name) {
				this.name = name;
				
			}
		}; 
		InterA aa = new InterA() {
			//�������̽��� new - X, �ȿ� �Ŀ��ڸ� new
			public void aa() {}
			public void bb() {}
		};
		AbstractExam ae = new AbstractExam() {
			//������
			public void cc() {}
			public void dd() {}
		};
		
	}

}
