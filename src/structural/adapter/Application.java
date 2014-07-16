package structural.adapter;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[]{34, 2, 4, 12, 1};

		Sorter sorter = new SortListAdapter();
		Integer[] sortedNumbers = sorter.sort(numbers);
		System.out.println("Sorted numbers: "+ Arrays.toString(sortedNumbers));
	}
}
