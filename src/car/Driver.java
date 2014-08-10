package car;

public class Driver {

	public static void main(String[] args) {
		Car car = new Car();
		car.accelarate();
		car.brake();
		
		//同じメソッドだけど違うものになる
		System.out.println("-------------------------------");
		Car note = new Car("note");
		note.showName();
		note.accelarate();
		note.accelarate();
		note.showSpeed();
		
		System.out.println("-------------------------------");
		Car priuss = new Car("priuss");
		priuss.showName();
		priuss.accelarate();
		priuss.showSpeed();
		priuss.brake();
		priuss.showSpeed();
	}
}
