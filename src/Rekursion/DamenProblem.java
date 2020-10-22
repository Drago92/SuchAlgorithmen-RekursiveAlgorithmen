package Rekursion;

public class DamenProblem {
	
	public static void reset(int[][] schachbrett) {
		for (int i = 0; i < schachbrett.length; i++) {
			for (int j = 0; j < schachbrett.length; j++) {
					schachbrett[i][j]=0;
				}
			}
		}
	
	private static boolean istOk(int[][] schachbrett,int zeile,int spalte){
		for (int i=1;i<8;i++){
			if(schachbrett[zeile][(spalte+i)%8]==1){
				return false;
			}
		}
		for (int i=1; zeile+i<8 && spalte+i<8; i++){
			if(schachbrett[zeile+i][(spalte+i)]==1){
				return false;
			}
		}
		for (int i=1; zeile-i>=0 && spalte-i>=0; i++){
			if(schachbrett[zeile-i][(spalte-i)]==1){
				return false;
			}
		}
		for (int i=1; zeile-i>=0 && spalte+i<8; i++){
			if(schachbrett[zeile-i][(spalte+i)]==1){
				return false;
			}
		}
		for (int i=1; zeile+i<8 && spalte-i>=0; i++){
			if(schachbrett[zeile+i][(spalte-i)]==1){
				return false;
			}
		}
		return true;
	}

    public static int[][] loese(int zeile, int spalte)
    {
        int[][] schachbrett = new int[8][8];
        reset(schachbrett);
        schachbrett[zeile][spalte] = 1;
        damenProblem(schachbrett, 1, 1);
        return schachbrett;
    }
    
    
	public static boolean damenProblem(int[][] schachbrett, int zeile, int spalte) {
		if(zeile>7) {
			return false;
		}
		boolean ok = istOk(schachbrett, zeile, spalte);
		if(ok) {
			schachbrett[zeile][spalte]=1;
			if(spalte==7) {
				for (int[] is : schachbrett) {
					for (int is2 : is) {
						System.out.print(is2+"  ");
					}
					System.out.println();
				}
				return true;
			}else {
				boolean found = damenProblem(schachbrett, 1, spalte+1);
				if(found) {
					return true;
				}
				schachbrett[zeile][spalte]=0;
			}
		}
		return damenProblem(schachbrett, zeile+1, spalte);
	}		
}

