package mat.unical.it.ProvaIngSw_200909;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {

	public List<Integer> numbers = new ArrayList<Integer>();
	
	public List<Integer> sort(List<Integer> list, int order) {
		List<Integer> sortedNumbers = new ArrayList<Integer>();
		int size = list.size();
		switch (order) {
		case 0:
			for (int i = 0; i < size; i++) {
				Integer min = Integer.MAX_VALUE;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) < min)
						min = list.get(j);
				}
				sortedNumbers.add(min);
				list.remove(min);
			}
				
			break;
		case 1:
			for (int i = 0; i < size; i++) {
				Integer max = Integer.MIN_VALUE;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j) > max)
						max = list.get(j);
				}
				sortedNumbers.add(max);
				list.remove(max);
			}
			break;

		default:
			break;
		}
		
		return sortedNumbers;
	}
	
	public static void main(String[] args) {
		
	}
}
