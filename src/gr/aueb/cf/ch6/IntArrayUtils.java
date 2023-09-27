package gr.aueb.cf.ch6;

public class IntArrayUtils {
    public static void main(String[] args) {
        int[] array = {11,8,16,3,3,9,7};

        printArray(array,0, 6);
        System.out.println("The maximum value is "
                            + array[ getMaxPosition(array,0,6) ] );

        System.out.println("The second minimum value is "
                + array[ get2ndMinPosition(array,0,6) ] );
    }

    /**
     * Returns the position of the maximum value in a source array
     * @param arr the source array
     * @param low starting position in the array
     * @param high ending position in the array
     * @return the position of the array containing the maximum value
     */
    public static int getMaxPosition(int[] arr, int low, int high){
        int maxPosition = low;
        int maxValue;

        if ( (low < 0) || (high > arr.length - 1) || (low > high) ){
            return -1;
        }

        maxValue = arr[low];

        for (int i = low; i <= high; i++){
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }

    /**
     * Returns the position of the minimum value in a source array
     * @param arr the source array
     * @param low starting position in the array
     * @param high ending position in the array
     * @return the position of the array containing the minimum value
     */
    public static int getMinPosition(int[] arr, int low, int high){
        int minPosition = low;
        int minValue;

        if ( (low < 0) || (high > arr.length - 1) || (low > high) ){
            return -1;
        }

        minValue = arr[low];

        for (int i = low; i <= high; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }

    /**
     * Returns the position of the second minimum value in a source array
     * @param arr the source array
     * @param low starting position in the array
     * @param high ending position in the array
     * @return the position of the array containing the second minimum value
     */
    public static int get2ndMinPosition(int[] arr, int low, int high){
        int minPosition;
        int minValue;
        int min2ndPosition;
        int min2ndValue;

        minPosition = getMinPosition(arr, low, high);
        if (minPosition == -1){
            return -1;
        }

        minValue = arr[minPosition];

        min2ndPosition = low;
        min2ndValue = arr[low];

        for (int i = low; i <= high; i++){
            if (arr[i] > minValue && arr[i] < min2ndValue){
                min2ndPosition = i;
                min2ndValue = arr[i];
            }
        }

        return min2ndPosition;
    }

    public static void printArray(int[] arr, int low, int high){
        if ( (low < 0) || (high > arr.length - 1) || (low > high) ) return;

        System.out.println();

        for (int i = low; i <= high; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
