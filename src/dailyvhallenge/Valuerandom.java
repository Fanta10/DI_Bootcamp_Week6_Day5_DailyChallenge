package dailyvhallenge;

import java.util.Random;
import java.util.Scanner;

public class Valuerandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double userNumber;
		Random rand = new Random();
		int numberComputer = rand.nextInt(100);
		System.out.println("le nombre deviné par léordinateur est : " + numberComputer);
		int score = 100;
		int score2 = 0;
		
		do {
			System.out.print("Deviner un nombre : ");
			
			userNumber = sc.nextDouble();
			
			
			
			
			 if(numberComputer < userNumber) {
				System.out.println("votre nombre est superieur à celui de l'ordinateur");
				score2 += 1;
				break;
			}
			 else if(score2 == 5) {
					System.out.println("echec,votre nombre est inferieur à celui de l'ordinateur.");
					System.out.println("votre score est : " + (score - score2));
					return ;
				}
			 else if(numberComputer == userNumber) {
					System.out.println("Felicitation,vous avez saisi le meme nombre que celui de l'ordinateur.");
					System.out.println("votre score est : " + (score - score2));
					return ;
				}
			 
			 
			else {
				System.out.println("votre nombre est inferieur à celui de l'ordinateur");
				score2 += 1;
				
			}
			 
			
		}while(numberComputer != userNumber);
		
			
		
		
	
	
		
		


	}

}
