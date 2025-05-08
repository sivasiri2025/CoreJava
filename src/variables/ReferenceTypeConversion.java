package variables;

public class ReferenceTypeConversion {
	
	public static void main(String[] args) {
		
//		So we can store - As below
//		A class object reference in Object class referenced variable. 
//		B class object reference in A or Object class reference variable. 
//		C class object reference in B or A or Object class reference variable. 
//
//		D class object reference in Object class reference variable. 

		
		Object obj1 = new Object();
		Object obj2 = new A();
		Object obj3 = new B();
		Object obj4 = new C(); //Upcasting
		
		Object obj5 = new D();
		
		//<Class name>
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		//A a4 = new D();
		
		B b1 = new B();
		//B b2 = new A();
		
		A a = new B();//upcasting
		B b = (B) a;
		
		//class cast exception
		A a11 = new A();
		//D d = (D) a;
		
		Object obj6 = new A();
		//D d1 = (D) obj6; //Class cast exception
		
		//how to overcome the class cast exception
		if(obj6 instanceof D) {// checks obj6 object reference has is-a relation with D or not. 
			System.out.println("In instance of");
			D d1 = (D) obj6;
		}
	}

}

class A {}
class B extends A{} // right side is super class and left side is subclass.
class C extends B{}
class D {}

