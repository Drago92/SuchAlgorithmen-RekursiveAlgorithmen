package Rekursion;


public class FakI{
	public static int fakI(int f) {
		int erg=1;
		for(int i=1;i<=f;i++) {
			erg*=i;
		}
		return erg;
	}
}