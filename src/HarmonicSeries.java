import java.util.Scanner;
		

public class HarmonicSeries {
		public static double Harmonic(int n){
			double sum =0;
			if(n>0){
				for(double i=1;i<=n;i++){
					sum+=(1/i);
				}
			}else{
				System.out.println("INVALID USER INPUT");
			}
			return sum;
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		System.out.println(Harmonic(n));
		sc.close();
	}

}
