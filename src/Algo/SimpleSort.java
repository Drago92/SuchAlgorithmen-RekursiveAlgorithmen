package Algo;

import java.util.*;

public class SimpleSort {
	public static ArrayList<Integer> simpleSort(ArrayList<Integer> arrList) {
		ArrayList<Integer> simple=new ArrayList<>();
		for (Integer integer : arrList) {
			simple.add(integer);
			for (int i = simple.size()-1; i >= 0 ; i--) {
				if(i==0) {
					simple.set(0, integer);
					break;
				}
				else if (integer < simple.get(i-1)) {
					simple.set(i, simple.get(i-1));
				}else {
					simple.set(i, integer);
					break;
				}
			}
		}
		return simple;
		
	}
}
