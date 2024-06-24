package Mycode;

public class AnonymousInnerClass {
	int first=10, second=6;
	AnonymousInnerClass oldsum=new AnonymousInnerClass() {
		
		@Override
		public int performOperation(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	};

}
