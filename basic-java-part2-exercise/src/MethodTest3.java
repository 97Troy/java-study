public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,23,23,43,6,7,87,64,123,4312,231,2131};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
