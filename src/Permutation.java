import java.util.Scanner;

public class Permutation { 
    
    static void recursive(String str, String ans) { 
      
        if (str.length() == 0) { 
            System.out.print(ans + " "); 

        } 
        for (int i = 0; i < str.length(); i++) { 
          
            char ch = str.charAt(i); 
          
            String ros = str.substring(0, i)+ str.substring(i + 1); 

            recursive(ros, ans + ch); 
        } 
    } 
    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String");
    	
        String str = sc.nextLine();
        
        recursive(str, ""); 
       
        sc.close();
    } 
}