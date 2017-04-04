package practice;

public class ClassX {
  protected int a=10;
  protected int b=20;
  protected void add(){
	  System.out.println(a+b);
  }
	public static void main(String[] args) {
		ClassX obj=new ClassX();
		obj.add();
		System.out.println(obj.b);

	}

}
