package modifiers;

public class privateaccessmodifier {
		private void method() {
			System.out.println("I am private access modifier");
		}
		protected void method2() {
			System.out.println("I am protected access modifier");
		}
		public static void main(String[] args) {
			privateaccessmodifier p = new privateaccessmodifier();
			p.method();
		}

	}


