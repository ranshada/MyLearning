package Mycode;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample extends Object {
	
	public static void main(String[] args) {
		
	
	
	Predicate<Integer> isEven= i ->i % 2 == 0;
	
 System.out.println("s the number is even"+ isEven.test(61));
 
 Predicate<Integer> isGreater= i ->i > 50;
	
 System.out.println("s the number is even"+ isGreater.test(61));
 
 System.out.println("one AND two"+ isGreater.and(isEven).test(61));

 System.out.println("one OR two"+ isGreater.or(isEven).test(61));

 System.out.println("Negate"+ isGreater.negate().test(61));

 
 List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
 List<Integer> collect=list.stream().filter(isEven).collect(Collectors.toList());
System.out.println("list of even numbers  "+collect);
Predicate<String> checkEquality=Predicate.isEqual("Easy Bytes");
System.out.println("Is the input equal ?:"+checkEquality.test("Easy Bytes"));
	
	
	
	
	}
}