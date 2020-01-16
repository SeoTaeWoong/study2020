package class_2;

public class FruitMain {

	public static void main(String[] args) {
		/*Fruit[] f = new Fruit[3];
		new Fruit().display();
		f[0]=new Fruit("사과", 100,80,75);
		f[1]=new Fruit("포도", 30,25,10);
		f[2]=new Fruit("딸기", 25,30,90);
		Fruit.output();*/
		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");
		Fruit[] f = {new Fruit("사과", 100,80,75),new Fruit("포도", 30,25,10),new Fruit("딸기", 25,30,90)};
		for(Fruit data:f) {
			data.calcTot();
			data.display();
		}
		System.out.println("-----------------------------------");
		Fruit.output();
	}
}
