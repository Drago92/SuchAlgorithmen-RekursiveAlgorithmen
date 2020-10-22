package Algo;

import java.util.*;

public class MergeSort {

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> arrList) {
		ArrayList<Integer> band1 = new ArrayList<>();
		ArrayList<Integer> band2 = new ArrayList<>();
		boolean check = true;
		while (check) {
			boolean band = true;
			band1.clear();
			band2.clear();
			for (int i = 0; i < arrList.size(); i++) {
				if (band) {
					if (band1.size() == 0) {
						band1.add(arrList.get(0));
					} else if (arrList.get(i) >= band1.get(band1.size() - 1)) {
						band1.add(arrList.get(i));
					} else {
						band = false;
						band2.add(arrList.get(i));
					}
				} else {
					if (arrList.get(i) > band2.get(band2.size()-1 )) {
						band2.add(arrList.get(i));
					} else {
						band = true;
						band1.add(arrList.get(i));
					}
				}
			}
			arrList.clear();
			if(band2.size()==0) {
				check=false;
			}
			int i = 0;
			int j = 0;
			int length= band1.size() + band2.size();
			for (int k = 0; k <length; k++) {
				if (i==band1.size()) {
					band1.add(Integer.MAX_VALUE);
				}else if(j==band2.size()) {
					band2.add(Integer.MAX_VALUE);
				}
				if (band1.get(i) < band2.get(j)) {
					arrList.add(band1.get(i));
					i++;
				} else {
					arrList.add(band2.get(j));
					j++;
				}
					
			}
		} 
		return arrList;

	}
}
