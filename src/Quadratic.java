import java.util.Scanner;


public class Quadratic {
		public static double delta(int a,int b,int c){
			double delta=0;
			
			delta = b*b - 4*a*c;
			
			return delta;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a , b, c values from the equation");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Delta value "+delta(a,b,c));
		double delta = delta(a,b,c);
		
		double x1 = (-b+Math.sqrt(delta))/2*a;
		double x2 = (-b-Math.sqrt(delta))/2*a;
		
		System.out.println("First root "+x1 );
		System.out.println("Second root "+x2 );
		
		sc.close();
	}

}
