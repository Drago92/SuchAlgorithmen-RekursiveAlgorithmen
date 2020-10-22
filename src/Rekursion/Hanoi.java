package Rekursion;

public class Hanoi {
	public static void hanoi(int h, int s, int z) {
		int zw = 6-s-z;
		if(h==1) {
			System.out.println("Verschiebe Scheibe " + h + " von Stab " + s + " nach Stab " +z);
		}else if(h>1) {
			hanoi(h-1, s, zw);
			System.out.println("Verschiebe Scheibe " + h + " von Stab " + s + " nach Stab " +z);
			hanoi(h-1, zw, z);
		}else {
			return;
		}
	}
}
