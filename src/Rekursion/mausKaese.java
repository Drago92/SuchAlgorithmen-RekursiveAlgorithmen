package Rekursion;

import java.util.Scanner;

public class mausKaese {
	private static int count=1;
	private static boolean weiter=true;
	
	public static void draw(int[][] feld) {
		for (int i = 0; i <= feld.length; i++) {
			for (int j = 0; j <= feld.length; j++) {
				if(i==0||i==feld.length) {
					System.out.print("* ");
				}else if(j==0||j==feld.length) {
					System.out.print("*");
				}else if(feld[i][j]==-1) {
					System.out.print("M ");
				}else if(feld[i][j]==-2) {
					System.out.print("K ");
				}else if(feld[i][j]>0) {
					if(feld[i][j]<10) {
						System.out.print(feld[i][j]+" ");
					}else {
						System.out.print(feld[i][j]);						
					}
				}else if(feld[i][j]==-5) {
					System.out.print("X ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void loese(int[][] feld, int i, int j) {
		int rowLimit = feld.length - 1;
	    int columnLimit = feld[0].length - 1;
		for (int x = Math.max(0, i - 1); x <= Math.min(i + 1, rowLimit); x++) {
			for (int y = Math.max(0, j - 1); y <= Math.min(j + 1, columnLimit); y++) {
				if(feld[x][y]==-2&&(i==x||j==y)) {
					System.out.println("Käse befindet sich im Feld: "+x+" "+y+"! Man Braucht "+ count +" Schritte");
					
					weiter=false;
					return;
				}
				else if(feld[x][y]==0&&(i==x||j==y)) {
					feld[x][y]=count;
				}
			}
		}					
		
	}
	
	
	
	public static void mK() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Wie breit soll das Feld werden?");
		int x= scan.nextInt();
		System.out.println("Wie hoch soll das Feld werden?");
		int y= scan.nextInt();
		System.out.println("Wo soll die Maus hin?");
		System.out.println("x=");
		int m1 = scan.nextInt();
		System.out.println("y=");
		int m2=scan.nextInt();
		System.out.println("Wo soll der Käse hin?");
		System.out.println("x=");
		int k1 = scan.nextInt();
		System.out.println("y=");
		int k2=scan.nextInt();
		int[][] feld= new int[x][y];
		feld[m1][m2]=-1;
		feld[k1][k2]=-2;
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld.length; j++) {
				int rnd = (int)(Math.random()*10)+1;
				if(feld[i][j]==0&&rnd>8) {
					feld[i][j]=-5;
				}
			}
		}
		draw(feld);
		loese(feld,m1,m2);
		
		while(weiter) {
			draw(feld);
			System.out.println("Weiter? true/false");
			weiter=scan.nextBoolean();
			count++;
			for (int i = 0; i < feld.length; i++) {
				for (int j = 0; j < feld.length; j++) {
					if(feld[i][j]==count-1) {
						loese(feld,i,j);
			
					}
				}
			}
		}
		
			
	}
}
