package Rekursion;

public class FibounacciRekursiv {
	public static long fibuR(int z) {
		if(z<3) {

			return 1;
		}else {
			return fibuR(z-1)+fibuR(z-2);
		}
	}
}
