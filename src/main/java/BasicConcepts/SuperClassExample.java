package BasicConcepts;

 class A {
	 public A() {
			System.out.println("A");
		}
	 public void function1() {
			System.out.println("parent function1");
		}
	 public void function2() {
			System.out.println("parent function2");
		}

}
	class B extends A{
		public B() {
//			super(); This method will be implicitly called, if not defined
			System.out.println("B");
//			super(); This statement will give compile time error "Constructor call must be the first statement in a constructor"
			super.function1();
			super.function1();
		}
		
		 public void fun1() {
				System.out.println(" child function1");
				super.function1();
				super.function2();

			}

	}
	
	public class Test6 {

public static void main(String arg[]) {
	System.out.println("Main method execution started");
	B obj = new B();
	System.out.println("Main method - Child class initialised");
	obj.fun1();
	System.out.println("Main method execution end");

}

}

// output:

// Main method execution started
// A
// B
// parent function1
// parent function1
// Main method - Child class initialised
//  child function1
// parent function1
// parent function2
// Main method execution end
