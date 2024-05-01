import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.parallelSort;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.collections4.ListUtils;


public class KataOne {

    public int sumMiddleNumbers(int[] intArray){
       ArrayList<Integer> intList = new ArrayList<>();// Create List
        int total = 0;
        //{1,1,1,2,3};

        for (int number : intArray) {
            if(!intList.contains(number)) {
                intList.add(number);
            }
        }


        if (intList.size() >= 3) {

            Collections.sort(intList);

            int lastPosition = intList.size() - 1;

            intList.remove(lastPosition);
            intList.remove(0);

            for (Integer number : intList) {
                total += number;
            }
        }

      //  System.out.println(intList.toString());
        return total;
    }

}
