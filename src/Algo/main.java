package Algo;

import java.util.*;
public class main {

	public static void main(String[] args) {
		String m=null;
		ArrayList<Integer> arrList = new ArrayList<>();
		int t=0;
		do {
			Scanner scan = new Scanner(System.in);
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
						System.out.print(" <e>\tDatei einlesen\t\t\t ");
						i=40;
						break;
					case 2:
						System.out.print(" <w>\tDatei schreiben\t\t\t ");
						i=40;
						break;
					case 3:
						System.out.print(" <x>\tExit Menu\t\t\t ");
						i=40;
						break;
					case 4:
						System.out.print(" <a>\tDatei auslesen\t\t\t ");
						i=40;
						break;
					case 5:
						System.out.print(" ");
						break;
					case 6:
						System.out.print(" <b>\tBubble Sort\t\t\t ");
						i=40;
						break;
					case 7:
						System.out.print(" <bb>\tBubble Sort mit Abfrage\t\t ");
						i=40;
						break;
					case 8:
						System.out.print(" <s>\tSimple Sort\t\t\t ");
						i=40;
						break;
					case 9:
						System.out.print(" <m>\tMergeSort\t\t\t ");
						i=40;
						break;
					case 10:
						System.out.print(" <v>\tVergleiche alle\t\t\t ");
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
			//----------------------------------------Datei einlesen------------------------------------------------------------------------
	        case "e":
	        	Einlesen.einlesen(arrList);
	            break;
	        //----------------------------------------Datei schreiben---------------------------------------------------------------------------
	        case "w":
	           Write.write();
	           break;
	        //----------------------------------------Menü verlassen----------------------------------------------------------------------------
	        case "x":
	        	t=1;
	        	break;
	        //----------------------------------------Bubble Sort-------------------------------------------------------------------------------
	        case "b":
	        	final long timeStart = System.nanoTime();
	        	BubbleSort.bubbleSort(arrList);
	        	final long timeEnd = System.nanoTime();
	            System.out.println("Verlaufszeit des Algorithmus: " + (timeEnd - timeStart) + " Nanosek.");
	        	break;
	        //-----------------------------------------Bubble Sort mit Boolean-------------------------------------------------------------------
	        case "bb":
	        	final long timeStart2 = System.nanoTime();
	        	BubbleSort.bubbleSort2(arrList);
	        	final long timeEnd2 = System.nanoTime();
	        	System.out.println("Verlaufszeit des Algorithmus: " + (timeEnd2 - timeStart2) + " Nanosek.");
	        	break;
	        //-----------------------------------------Simple Sort--------------------------------------------------------------------------------
	        case "s":
	        	final long timeStart3 = System.nanoTime();
	        	arrList=SimpleSort.simpleSort(arrList);
	        	final long timeEnd3 = System.nanoTime();
	        	System.out.println("Verlaufszeit des Algorithmus: " + (timeEnd3 - timeStart3) + " Nanosek.");
	        	break;
	        //-----------------------------------------Merge Sort----------------------------------------------------------------------------------
	        case "m":
	        	final long timeStart4 = System.nanoTime();
	        	arrList=MergeSort.mergeSort(arrList);
	        	final long timeEnd4 = System.nanoTime();
	        	System.out.println("Verlaufszeit des Algorithmus: " + (timeEnd4 - timeStart4) + " Nanosek.");
	        	break;
	        //----------------------------------------Vergleiche alle------------------------------------------------------------------------------
	        	case "v":
	        		//--------------------------------Merge Sort------------------------------------------------------------------------------
	        		ArrayList<Integer> vergleich=new ArrayList<>();
	        		vergleich.addAll(arrList);
	        		long timeStartv = System.nanoTime();
	        		vergleich=MergeSort.mergeSort(vergleich);
	        		long timeEndv = System.nanoTime();
	        		System.out.println("Verlaufszeit des MergeSort: \t\t\t" + (timeEndv - timeStartv) + " Nanosek.");
		            //--------------------------------Bubble Sort-----------------------------------------------------------------------------
	        		vergleich.addAll(arrList);
		        	timeStartv = System.nanoTime();
		        	BubbleSort.bubbleSort(vergleich);
		        	timeEndv = System.nanoTime();
		            System.out.println("Verlaufszeit des BubbleSort: \t\t\t" + (timeEndv - timeStartv) + " Nanosek.");
		            vergleich.clear();
		            //--------------------------------Bubble Sort mit Abfrage----------------------------------------------------------------------
		            vergleich.addAll(arrList);
		        	timeStartv = System.nanoTime();
		        	BubbleSort.bubbleSort2(vergleich);
		        	timeEndv = System.nanoTime();
		        	System.out.println("Verlaufszeit des BubbleSort mit Abfrage: \t" + (timeEndv - timeStartv) + " Nanosek.");
		            vergleich.clear();
		            //--------------------------------Simple Sort-----------------------------------------------------------------------------
		        	vergleich.addAll(arrList);
		        	timeStartv = System.nanoTime();
		        	vergleich=SimpleSort.simpleSort(vergleich);
		        	timeEndv = System.nanoTime();
		        	System.out.println("Verlaufszeit des SimpleSort: \t\t\t" + (timeEndv - timeStartv) + " Nanosek.");
		            vergleich.clear();
		            break;
	        //----------------------------------------Array ausgabe-------------------------------------------------------------------------------
	        case "a":
        		for (int j = 0; j < arrList.size(); j++) {
        			System.out.print("["+arrList.get(j)+"]\t");
        			if(j%20==0) {
        				System.out.println();
   					}
				}
        		break;
	        default:
	            System.out.println("Sie müssen ein Menüpunkt wählen");
	            break;
	        }
	    } while(t!=1);
	}

}
