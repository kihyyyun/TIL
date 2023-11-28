package d4prob;

public class H4 {
    //### H4
    //
    //int[]을 인자로 받아,
    //
    //1. 배열의 값들 중 최댓값의 위치를 반환하는 "maxWhere"
    //2. 배열의 값들 중 최솟값의 위치를 반환하는 "minWhere"
    //3. 배열의 값들 중 최댓값과 최솟값의 차이를 반환하는 "maxDiff"
    //
    //메서드를 각각 작성하시오.
    //

    public static int maxDiff(int[] numbers){
        int maxIdx = maxWhere(numbers);
        int minIdx = minWhere(numbers);
        return numbers[maxIdx] -numbers[minIdx];
    }


    public static int maxWhere(int[] numbers){
        //numbers.lenght > 0 검증이 있으면 더 좋음
        //초기 비교 대상
        int max = numbers[0];
        // 위치
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            //더 큰애 발견
            if(numbers[i] > max){
                //정보 갱신
                max = numbers[i];
                index = i;
            }
        }
        //반복이 끝나면 index가 최대값의 위치
        return index;
    }

    public static int minWhere(int[] numbers){
        //numbers.lenght > 0 검증이 있으면 더 좋음
        //초기 비교 대상
        int min = numbers[0];
        // 위치
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            //더 큰애 발견
            if(numbers[i] < min){
                //정보 갱신
                min = numbers[i];
                index = i;
            }
        }
        //반복이 끝나면 index가 최대값의 위치
        return index;
    }

    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6};
        System.out.println(maxWhere((numbers)));
        System.out.println(minWhere((numbers)));
        System.out.println(maxDiff(numbers));
    }



















//    public static int maxWhere(int[] arr) {
//        int maxIndex = 0; // 최대값의 위치를 저장할 변수
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i; // 더 큰 수를 찾으면 그 위치를 maxIndex에 저장
//            }
//        }
//        return maxIndex; // 최대값의 위치 반환
//    }
//
//    public static int minWhere(int[] arr){
//        int min = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<arr[min]){
//                min =i;
//            }
//        }
//        return min;
//    }
//
//    public static int maxDiff(int[] arr){
//        int min = arr[minWhere(arr)];
//        int max = arr[maxWhere(arr)];
//        return max-min;
//    }
//    public static void main(String[] args) {
//        int[] arr ={10,20,30,40,50};
//        System.out.println(maxWhere(arr));
//        System.out.println(minWhere(arr));
//        System.out.println(maxDiff(arr));
//    }
}
