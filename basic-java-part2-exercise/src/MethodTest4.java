public class MethodTest4 {
    public static void main(String[] args) {
        int[] arr = {1,12,421,32,3,4,56,7,1,23,4,55,67,89,6,5,4,32,3,4,21};
        int index = getIndex(arr,6);
        System.out.println(index);

    }

    public  static int getIndex(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
