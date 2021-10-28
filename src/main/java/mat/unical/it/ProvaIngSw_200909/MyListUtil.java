package mat.unical.it.ProvaIngSw_200909;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {

	public List<Integer> numbers = new ArrayList<Integer>();
	
	public List<Integer> sort(List<Integer> list, int order) {
		List<Integer> sortedNumbers = new ArrayList<Integer>();
		List<Integer> temp = list;
		int size = list.size();
		switch (order) {
		case 0:
			for (int i = 0; i < size; i++) {
				Integer min = Integer.MAX_VALUE;
				for (int j = 0; j < temp.size(); j++) {
					if (temp.get(j) < min)
						min = temp.get(j);
				}
				sortedNumbers.add(min);
				temp.remove(min);
			}
				
			break;
		case 1:
			for (int i = 0; i < size; i++) {
				Integer max = Integer.MIN_VALUE;
				for (int j = 0; j < temp.size(); j++) {
					if (temp.get(j) > max)
						max = temp.get(j);
				}
				sortedNumbers.add(max);
				temp.remove(max);
			}
			break;

		default:
			break;
		}
		
		return sortedNumbers;
	}
	
	public static void main(String[] args) {
		MyListUtil list = new MyListUtil();
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(6);
		numbers.add(8);
		numbers.add(2);
		numbers.add(1);
		
		List<Integer> crescente = list.sort(numbers, 0);
		List<Integer> decrescente = list.sort(numbers, 1);
	}
}
