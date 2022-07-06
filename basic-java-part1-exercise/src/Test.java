public class Test {

    public static void main(String[] args) {
        int x = 12345432;
        boolean flag = true;
        int count = 0;
        String s = x + "";
        String[] arr = s.split("");
        String[] compare = new String[128];
        for (int i = arr.length - 1; i >= 0; i--) {
            compare[i] = arr[count];
            count++;
        }
        for(int i =0;i < arr.length;i++){
            if (!arr[i].equals(compare[i])){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
