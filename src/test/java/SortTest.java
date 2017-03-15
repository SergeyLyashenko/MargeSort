import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SortTest {



    @Test
    public void shouldSortArray() {
        Random random = new Random();
        int[] myArray = new int[200000];
        int[] testArray = new int[200000];
        for (int i = 0; i < myArray.length; i++) {
            testArray[i] = myArray[i] = random.nextInt(500000);
        }
        Sort.sort(myArray);
        Arrays.sort(testArray);

        for (int i = 0; i < myArray.length; i++) {

            int expectedResult = testArray[i];
            int actualValue = myArray[i];
            Assert.assertEquals(expectedResult, actualValue);
        }
    }

}
