package Collection;

public class class2 {

	public static void main(String[] args) {
		class1 t=class1.getInstance();
		t.a=11;
		System.out.println(t);
		class1 t2=class1.getInstance();
		System.out.println(t2);
		class1 t1=class1.getInstance();
		System.out.println(t1);


	}

}
