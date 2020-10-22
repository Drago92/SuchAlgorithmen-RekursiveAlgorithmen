package Rekursion;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String m=null;
		int t=0;
		int zahl=0;
		Scanner scan = new Scanner(System.in);
		do {
//---------------------------------------------------------Menü-------------------------------------------------------------------------------
			System.out.println();
			for (int j = 0; j <= 11; j++) {
				System.out.print("*");
				for (int i = 0; i < 40; i++) {
					switch(j) {
					case 0:
						System.out.print("*");
						break;
					case 1:
						System.out.print(" -----------------Wähle---------------- ");
						i=40;
						break;
					case 2:
						System.out.print(" <fi>\tFibounacci Iterativ\t\t ");
						i=40;
						break;
					case 3:
						System.out.print(" <fr>\tFibounacci Rekursiv\t\t ");
						i=40;
						break;
					case 4:
						System.out.print(" <fai>\tFakultät Iterativ\t\t ");
						i=40;
						break;
					case 5:
						System.out.print(" <far>\tFakultät Rekursiv\t\t ");
						i=40;
						break;
					case 6:
						System.out.print(" <h>\tHanoi\t\t\t\t ");
						i=40;
						break;
					case 7:
						System.out.print(" <D>\t8 Damen Problem\t\t\t ");
						i=40;
						break;
					case 8:
						System.out.print(" <mk>\tMaus Käse\t\t\t ");
						i=40;
						break;
					case 9:
						System.out.print(" ");
						break;
					case 10:
						System.out.print(" <x>\tExit Menu\t\t\t ");
						i=40;
						break;
					case 11:
						System.out.print("*");
						break;
					}
						
				}
				System.out.print("*");
				System.out.println();
			}
//------------------------------------------------------Wählen------------------------------------------------------------------------------
			
			m=scan.nextLine();
			switch(m){
			//----------------------------------------Fibounacci Iterativ--------------------------------------------------------------------
	        case "fi":
	        	
	            break;
	        //----------------------------------------Fibounacci Rekursiv--------------------------------------------------------------------
	        case "fr":
	    		System.out.println("Die wievielte Fibounacci Zahl wollen Sie?");
	    		scan= new java.util.Scanner(System.in);
	    		zahl = scan.nextInt();
	    		System.out.println("Rekursiv:\n Ergebnis = "+FibounacciRekursiv.fibuR(zahl));
	           break;
	        //----------------------------------------Fakultät Iterativ----------------------------------------------------------------------------
	        case "fai":
	    		System.out.println("Von welcher Zahl wollen sie die Fakultät berechnen?");
	    		scan= new java.util.Scanner(System.in);
	    		zahl = scan.nextInt();
	    		System.out.println("Iterativ "+FakI.fakI(zahl));
	        	break;
	        //----------------------------------------Fakultät Rekursiv-------------------------------------------------------------------------------
	        case "far":
	    		System.out.println("Von welcher Zahl wollen sie die Fakultät berechnen?");
	    		scan= new java.util.Scanner(System.in);
	    		zahl = scan.nextInt();
	    		System.out.println("Rekursiv "+ FakR.fakR(zahl));
	        	break;
	        //----------------------------------------Hanoi-------------------------------------------------------------------------------
	        case "h":
	    		System.out.println("Wie hoch?");
	    		scan= new java.util.Scanner(System.in);
	    		int h = scan.nextInt();
	    		System.out.println("Von?");
	    		int v = scan.nextInt();
	    		System.out.println("Nach?");
	    		int n = scan.nextInt();
	    		Hanoi.hanoi(h, v, n);
	    		break;
	        //-----------------------------------------8 Damen Problem----------------------------------------------------------------------------
	        case "D":
	        	DamenProblem.loese(0,0);
	        	break;
	        	//-----------------------------------------8 Damen Problem----------------------------------------------------------------------------
	        case "mk":
	        	mausKaese.mK();
	        	break;
	        //-----------------------------------------Menü verlassen----------------------------------------------------------------------------
	        case "x":
	        	t=1;
	        	System.out.println("Beendet!");
	        	break;
	        //-----------------------------------------Simple Sort--------------------------------------------------------------------------------
	        default:
	            System.out.println("Sie müssen ein Menüpunkt wählen");
	            break;
	        }
	    } while(t!=1);
		scan.close();
	}

}
