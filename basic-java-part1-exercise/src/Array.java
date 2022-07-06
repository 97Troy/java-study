public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        double[] arr1 = new double[]{1.1,123,12.3,44.3};
        System.out.println(arr[0]);

       double[] arr2 = new double[10];
       arr2[0] = 1;
       System.out.println(arr2[0]);

       int[] ageArr = new int[]{19,20,21,22,24};
       int[] ageArr1 = {12,24,44,23,12};

       String[] nameArr = new String[]{"lay","toy","gray"};
       String[] nameArr1 = {"lay","toy","gray"};

       double[] heightArr = new double[]{1.81,1.55,1.67};
       double[] heightArr1 = {1.88,1.51,1.66};

       int[] arr3 = {1,3,2,4,2};
       System.out.println(arr3);

       double[] arr4 = {1,1.2,3.3};
        System.out.println(arr4);


        int a = 123;
        String s = "" + a;
        String[] s1 = s.split("");
        System.out.println(s1[1]);



    }
}
