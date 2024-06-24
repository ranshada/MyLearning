package Mycode;

public class Lambda {
	
	public static void main(String[] args) {
		voidMethod();
	}
	
	public static void voidMethod(){
		
		//VoidMethodWithNoParams method1=(input) ->System.out.println(input);
		
		//method.printHello();
		//method1.printInput("Hello");
		
		VoidMethodWithNoParams voidMethod=(a) -> {
			return ( a.toUpperCase());
		};
		
		
		System.out.println(voidMethod.performOperation(""));
		System.out.println(divide.calculate(10, 5));
		System.out.println(multiply.calculate(10,5));;
		
		
		}
		

	
	

	
}
