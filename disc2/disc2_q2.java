package disc2;

public class disc2_q2 {


    /**
     * This function return the index that has smallest value after index k
     */
    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;

        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
                }
            index = index + 1;
            }
        return answer;
    }


    /**
     * This function sort the array it gets as parameter
     */
    public static void mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
            }
        }


    public static void main(String[] args) {

        int[] arr = {3, 0, 4, 6, 7};
        mystery2(arr);
        System.out.println(arr);

    }
}
