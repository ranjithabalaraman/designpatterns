package structural.adapter;

import java.util.Collections;
import java.util.List;

public class NumberSorter
{
   public List<Integer> sort(List<Integer> numbers)
   {
      //sort and return
	   Collections.sort(numbers);
      return numbers;
   }

}