package constructor;

public class constructortypes {
		double x;

			
		constructortypes(){
				
			}
		constructortypes (int a){
				x=a*a;
			}
		constructortypes  (int b,int c){
				x=b*c;
			}
		constructortypes (float d){
				
				x=3.14*(d*d);
			}
			void area(){
				System.out.println("area is"+x );
				}
			
			void display(int a,int b){
				x=(a*b)/2;
				System.out.println("area of traingle" +x);
			}
			void display(float a,float b){
				x=(a*b)/2;
				System.out.println("area of rhombus" +x);
			}
			public static void main(String[] args){
				constructortypes square=new constructortypes (5);
				constructortypes rectangle=new constructortypes (5,6);
				constructortypes circle=new constructortypes(7f);
				
				square.area();
				rectangle.area();
				circle.area();
				new constructortypes().display(5,6);
				new constructortypes().display(3f,5f);

	}

}
