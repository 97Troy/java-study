

public class ComprehensiveExercise4 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,1};
        int[] newArr = copyArr(arr);
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

    }

    public static int[] copyArr(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;

    }

}
