
public class Sort {


    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);

    }

    private static void sort(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;

            sort(array, firstIndex, middleIndex);
            sort(array, middleIndex + 1, lastIndex);
            marge(array, firstIndex, middleIndex, lastIndex);
        }
    }

    private static void marge(int[] array, int firstIndex, int middleIndex, int lastIndex) {
        int[] tempArray = new int[lastIndex - firstIndex + 1];
        int leftPartIndex = firstIndex;
        int rightPartIndex = middleIndex + 1;

        for (int i = 0; i < tempArray.length; i++) {
            if (array[leftPartIndex] > array[rightPartIndex]) {
                tempArray[i] = array[rightPartIndex++];
                if (rightPartIndex > lastIndex) {
                    for (i++; i < tempArray.length; i++) {
                        tempArray[i] = array[leftPartIndex++];
                    }
                }
            } else {
                tempArray[i] = array[leftPartIndex++];
                if (leftPartIndex > middleIndex) {
                    for (i++; i < tempArray.length; i++) {
                        tempArray[i] = array[rightPartIndex++];
                    }
                }
            }
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[firstIndex++] = tempArray[i];
        }
    }
}
