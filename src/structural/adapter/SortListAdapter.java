package structural.adapter;

import java.util.Arrays;
import java.util.List;

public class SortListAdapter implements Sorter
{

   @Override
   public Integer[] sort(Integer[] numbers)
   {
      //convert the array to a List
      List<Integer> numberList = Arrays.asList(numbers);
      
      //call the adapter 
      NumberSorter sorter = new NumberSorter();
      numberList = sorter.sort(numberList);
      
      //convert the list back to an array and return 
      Integer[] sortedNumbers = (Integer[]) numberList.toArray();
      return sortedNumbers;
   }
   
}