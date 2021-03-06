package jana60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Sessione 2: Antonio Esposito,Davide Verrengia,Giuseppe Maresca, Alessio Calzetti, Federica Cetroni;
		
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		String conferma;
		
		List<String> listaDiDesideri = new ArrayList<String>(3);
		
		do {
			
			System.out.print("Inserisci il tuo desiderio: ");
			listaDiDesideri.add(scan.nextLine());
			System.out.println("La lista ora contiene " + listaDiDesideri.size() + " desideri.");
			
			if(listaDiDesideri.size() == 3)
				flag =true;
			else {
			
				do {
					
					System.out.print("Vuoi inserire un nuovo desiderio? ");
					conferma = scan.nextLine();
				
					if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
					System.out.println("Rispondi solo Si o No.");
				
				}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
				
				if(conferma.equalsIgnoreCase("no"))
					flag = true;
				
			}
			
			
		}while(!flag);

		Collections.sort(listaDiDesideri);
		
		System.out.println("La tua lista di desideri ordinata ?: ");
		System.out.println(listaDiDesideri);
		
		
	}

}