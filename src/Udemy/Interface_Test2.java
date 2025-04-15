package Udemy;

class Test1 implements Interface_Test1
{
	@Override
	public void m4() {
		System.out.println("m4");
	}

	@Override
	public void m5() {
		System.out.println("m5");
		
	}
	
}

public class Interface_Test2 {

	public static void main(String[] args) {
		Interface_Test1 tst = new Test1();
		tst.m4();
		tst.m5();
		Interface_Test1.m2();
		Interface_Test1.m3();
		String v=Interface_Test1.name;
		System.out.println(v);

	}

}
