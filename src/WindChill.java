import java.util.Scanner;


public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temprature in farneheight ");
		int t = sc.nextInt();
		System.out.println("Enter the speed of wind");
		int v = sc.nextInt();
	
		if(Math.abs(t)>50){
			System.out.println("greater than 50 absolute value");
		}else{
			if(v<3||v>120){
				System.out.println("Value of v is not in range");
			}else{
				double w = 35.74 + 0.6215*t +(0.4275*t-35.75)*Math.pow(v, 0.16);
				System.out.println(w+"Wind ");
			}	
		}
		

		
	}

}
