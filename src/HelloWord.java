import java.util.List;
import java.util.ArrayList;


public class HelloWord {
	 public static void main(String[] args){
		 
		 String frase = "Hello World!";
		 List<Character> newFrase = new ArrayList<>();
		 
		 for ( int i = 0 ; i < frase.length(); i++) {
			 newFrase.add(0,frase.charAt(i));
			 System.out.println(frase.charAt(i));
		 }

		 String maisUmaFrase = "";
		 for (Character umaLetra : newFrase) {
			 maisUmaFrase = maisUmaFrase + umaLetra;
		 }
	        
		 	System.out.println(frase);
		 	System.out.println(newFrase);
		 	System.out.println(maisUmaFrase);
	        
	    }
}
