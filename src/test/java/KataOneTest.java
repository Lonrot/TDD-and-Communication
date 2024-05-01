import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataOneTest {

    @Test
    @DisplayName("Middle Number Sum")
    void sumMiddleNumbers() {
        KataOne testKataOne = new KataOne();

        int[] arrayTestOne = new int[]{5, 2, 6, 10, 22 };
        int resultOne = 21;
        int[] arrayTestTwo = new int[]{1, 2, 3, 4, 5 };
        int resultTwo = 9;
        int[] arrayTestThree = new int[]{1};
        int resultThree = 0;
        int[] arrayTestFour = new int[]{1,2};
        int resultFour = 0;
        int[] arrayTestFive = new int[]{1,2,3};
        int resultFive = 2;
        int[] arrayTestSix = new int[]{1,3,1,1,2};
        int resultSix = 2;
        int[] arrayTestSeven = new int[]{1,1,1,3,3,3,2,2};
        int resultSeven = 2;
        int[] arrayTestEight = new int[]{};
        int resultEight = 0;


        assertEquals(resultOne,testKataOne.sumMiddleNumbers(arrayTestOne));
        assertEquals(resultTwo,testKataOne.sumMiddleNumbers(arrayTestTwo));
        assertEquals(resultThree,testKataOne.sumMiddleNumbers(arrayTestThree));
        assertEquals(resultFour,testKataOne.sumMiddleNumbers(arrayTestFour));
        assertEquals(resultFive,testKataOne.sumMiddleNumbers(arrayTestFive));
        assertEquals(resultSix,testKataOne.sumMiddleNumbers(arrayTestSix));
        assertEquals(resultSeven,testKataOne.sumMiddleNumbers(arrayTestSeven));
        assertEquals(resultEight,testKataOne.sumMiddleNumbers(arrayTestEight));
    }
}