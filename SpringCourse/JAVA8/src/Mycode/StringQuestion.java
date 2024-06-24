package Mycode;

import java.util.Objects;

/**
 * @author ranjithkumarshada
 *
 */
public class StringQuestion extends SQSuperClass {
	
	String name;
	String type;
	
	
	
	
	public void A() {
		System.out.println("B");
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringQuestion other = (StringQuestion) obj;
		return Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}

	public static void main(String[] args) {
		StringQuestion sq= new StringQuestion;
		sq.A();
	}
	
	

}
