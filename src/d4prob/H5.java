package d4prob;

public class H5 {
    //### H5
    //
    //int[]을 두개 받아,
    //두 배열이 합쳐진 배열을 반환하는 메서드를 작성하시오.
    //



    public static int[] concatArray(int[] front, int[] back){
        int[] result = new int[front.length+back.length];

        //1 외부에 result 원소 순서용 변수 만등러서 for 두번

        int idx = 0;
        for(int i = 0; i< front.length; i++){
            result[idx] =front[i];
            idx++;
        }
        for (int i = 0; i < back.length; i++) {
            result[idx] =back[i];
            idx++;
        }
        return result;

        //2 fori를 두번 돌되 , 두번째(back) 할때는 위치 + front.lenght
        //3. 그냥 한번에 하겠다.
    }


    public static void main(String[] args) {
        int[] front = {1,2,3};
        int[] back = {4,5,6};
        int[] result =concatArray(front,back);
        for(int num: result){
            System.out.println(num);
        }
    }


























//        public static int[] mergeArrays(int[] arr1, int[] arr2) {
//            int[] mergedArray = new int[arr1.length + arr2.length];
//
//            for (int i = 0; i < arr1.length; i++) {
//                mergedArray[i] = arr1[i];
//            }
//
//            for (int i = 0; i < arr2.length; i++) {
//                mergedArray[i + arr1.length] = arr2[i];
//            }
//
//            return mergedArray;
//        }
    }
