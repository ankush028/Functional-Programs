import java.util.Scanner;

public class Gambler { 

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stake");
        int stake  = sc.nextInt(); 
        System.out.println("Enter the Goal");
        int goal = sc.nextInt();
        System.out.println("Trials");
        int trials = sc.nextInt();
    	
        int bets = 0;        
        int wins = 0;        

     
        for (int t = 0; t < trials; t++) {

            
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5)
                	cash++;     
                else                
                	cash--;    
            }
            if (cash == goal) wins++;               
        }

       
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
       
    }
    

}