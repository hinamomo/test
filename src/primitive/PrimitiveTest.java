package primitive;

public class PrimitiveTest {
	
	// プリミティブ(初期値に何か入るのでぬるぽしない)
	// 整数
	int i;
	byte b;
	short s;
	long l;
	
	//文字(unicode1文字を表す)
	//初期値は空文字(nullではない。unicode0000番)
	char c;
	
	//実数
	float f;
	double d;
	
	//論理
	boolean bool;
	

	public static void main(String[] args) {
		PrimitiveTest prim = new PrimitiveTest();
		
		System.out.println("i=" + prim.i);
		System.out.println("b=" + prim.b);
		System.out.println("s="+prim.s);
		System.out.println("l="+prim.l);
		System.out.println("c="+prim.c);
		System.out.println("f="+prim.f);
		System.out.println("d="+ prim.d);
		System.out.println("bool="+prim.bool);
	}
}
