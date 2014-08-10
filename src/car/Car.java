package car;

//classの先頭は大文字
//キャメルケース：単語が変わったら大文字
public class Car {
	
	private String name;
	private int speed; //現在のスピード
	
	//コンストラクタ(引数の何もないコンストラクタ。デフォルトで持っている)
	public Car(){
		System.out.println("コンストラクタが呼ばれました");
	}
	
	//自分で何かをやらせたいときは自分で作る。
	public Car(String name){
		this.name = name;
		//System.out.println("この車の名前は" + name +"です。");
	}
	
	//methodの先頭は小文字
	public void showName(){
		System.out.println("この車の名前は" + name +"です。");	
		
	}
	
	public void showSpeed(){
		System.out.println("現在のスピードは 時速"+ speed + "kmです。");
	}
	
	//加速
	public void accelarate(){
		speed += 20;
		System.out.println("加速しました");
	}
	
	
	public void brake(){
		speed -= 20;
		System.out.println("減速しました");
	}
}
