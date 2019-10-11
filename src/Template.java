import java.util.Scanner;
import java.util.regex.Pattern;


public class Template {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name for replace");
		 Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean check =Pattern.matches("[a-zA-Z]{3,50}$",str);
		if(check==true){
			String greet = "Hello <<UserName>>, How are you";
			String replaceName = greet.replace("<<UserName>>",str);
			System.out.println(replaceName);
			
		}else{
			System.out.println("Invalid input name");
		}
		sc.close();
		
	}

}
