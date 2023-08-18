package calculator;

import java.util.Scanner;

public class calculator {
		
		  public static void main(String[] args) {
			  
			  	  int number1, number2, calculate, again;
			  	  boolean loop;
			
			  	  Scanner sc = new Scanner (System.in);
			  	  
			  	  do {
			  	  
			  	  System.out.println("Bitte geben Sie die erste Zahl ein: ");
			  	  number1=sc.nextInt();
			  	  
			  	  System.out.println("Bitte geben Sie die zweite Zahl ein: ");
			  	  number2=sc.nextInt();
			  	
			  	  System.out.println("Bitte geben Sie die Rechnungsart (1.Addition, 2.Subtraktion, 3. Multiplikation, 4. Division) ein: ");
			  	  calculate=sc.nextInt();
			  	  
			  	  switch (calculate) {
			  	  case 1: System.out.println("Das Ergbnis ist:"+ (number1 + number2)); break;
			  	  case 2: System.out.println("Das Ergbnis ist:"+ (number1 - number2)); break;
			  	  case 3: System.out.println("Das Ergbnis ist:"+ (number1 * number2)); break;
			  	  case 4: System.out.println("Das Ergbnis ist:"+ (number1 / number2)); break;
			  	  default: System.out.println("falsche Eingabe");
			  	  }
			  	   
			  	  
			  	  
			  	  System.out.println("Moechten Sie eine erneute Rechnung durchfuehren? (1 fuer Ja , 0 fuer Nein)");
			  		  again=sc.nextInt();
			  		  
			  		  if (again ==1) {
			  			  loop = true;}
			  		  
			  		  else if (again == 0) {
			  			  loop = false;
			  			  System.out.println("Das Programm ist beendet.");}
			  		  
			  		  else {
			  			  System.out.println("Falsche Eingabe");
			  			  loop = false;
			  		  }
			  		 
			  	  
		  		} while (loop == true);
			  	  
			  
		  }
		  
}
			  	  	