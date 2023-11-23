package d4prob;

public class H5 {
    //### H5
    //
    //int[]을 두개 받아,
    //두 배열이 합쳐진 배열을 반환하는 메서드를 작성하시오.
    //

        public static int[] mergeArrays(int[] arr1, int[] arr2) {
            int[] mergedArray = new int[arr1.length + arr2.length];

            for (int i = 0; i < arr1.length; i++) {
                mergedArray[i] = arr1[i];
            }

            for (int i = 0; i < arr2.length; i++) {
                mergedArray[i + arr1.length] = arr2[i];
            }

            return mergedArray;
        }
    }
