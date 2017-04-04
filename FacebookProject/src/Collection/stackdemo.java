package Collection;

import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("hi");
		s.push(12);
		s.push("lastvalue");
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("hi"));

	}

}
