package nested;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {//익명 이너 클래스
			@Override
			public void setName(String name) {
				this.name = name;
				
			}
		}; 
		InterA aa = new InterA() {
			//인터페이스는 new - X, 안에 후원자를 new
			public void aa() {}
			public void bb() {}
		};
		AbstractExam ae = new AbstractExam() {
			//선택적
			public void cc() {}
			public void dd() {}
		};
		
	}

}
