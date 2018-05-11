package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateInArray {

	public boolean duplicate(int[] a) {
		boolean haveDuplicate=false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!map.containsKey(a[i])) {
				map.put(a[i], 1);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}

		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println("The duplicate in the array : " + e.getKey());
				haveDuplicate=true;
			}
		}
		return haveDuplicate;
	}

	public static void main(String[] args) {

		int[] a = { 1,2,3,4,5 };
		DuplicateInArray duplicate = new DuplicateInArray();
		boolean havDuplicate=duplicate.duplicate(a);
		if(havDuplicate==true) {
			System.out.println("It contains");
		}
		else {
			System.out.println("It doesn't contain");
		}
	}

}
