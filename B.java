package AccessModifiDemo;

public class B {

	public static void main(String[] args) {
		Center c=new Center();
		System.out.println("center name is:"+c.name);
		PublicDemo p=new PublicDemo();
		System.out.println(p.x);
		p.test();
	}

}
