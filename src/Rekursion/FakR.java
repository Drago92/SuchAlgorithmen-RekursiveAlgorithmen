package Rekursion;

public class FakR {
	static long z = 0;
	public static long fakR(int f) {
		z=f;
		System.out.println("Aufruf von FakR("+f+")");
		long erg=1;
		if (f==0) {
			System.out.println("Ende von FakR("+z+")");
			return erg;
		} else {
			System.out.println("Ende von fakR("+z+")");
			z-=1;
			System.out.println("Fakultät von " + z +" wird gestartet ");
			return erg=f*fakR(f-1);
		}
	}

}
