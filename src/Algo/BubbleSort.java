package Algo;
import java.util.*;

public class BubbleSort {
	
	
	public static void bubbleSort(ArrayList<Integer> arrList ) {
		int tmp=0;
		for (int i = 0; arrList.size() > i; i++) {
			for (int j = i+1;arrList.size() > j; j++) {
				if(arrList.get(i)>arrList.get(j)) {
					tmp=arrList.get(i);
					arrList.set(i, arrList.get(j));
					arrList.set(j, tmp);
				}
			}
		}
	}
	
	public static void bubbleSort2(ArrayList<Integer> arrList ) {
		for (int i = 0; arrList.size() > i; i++) {
			int tmp=0;
			for (int j = i+1;arrList.size() > j; j++) {
				if(arrList.get(i)>arrList.get(j)) {
					tmp=arrList.get(i);
					arrList.set(i, arrList.get(j));
					arrList.set(j, tmp);
				}
				if(tmp==0&&j==arrList.size()-1) {
					return;
				}
			}
		}
	}
}
