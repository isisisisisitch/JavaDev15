package ca.bytetube._0_practice;

public class Practice {
    public static void main(String[] args) {

//        int[] reverseArray = reverseArray(new int[]{1, 2, 7, 3, 5});
//        for (int element : reverseArray) {
//            System.out.print(element + " ");
//        }

//        swap(10,100);

        System.out.println(reverseString("bytetube"));
    }

    //1.Convert a positive decimal number to binary number.
    public static void decimalNumberToBinaryNumber(long decimalNumber) {

    }

    //2.Convert a positive binary number to decimal number.
    public static void binaryNumberToDecimalNumber(long binaryNumber) {

    }



    //3.1 Reverse a array
    //[1,2,7,3,5]--->[5,3,7,2,1]
    public static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        if (arr.length == 1)  return arr;
        int i = 0,j = arr.length - 1;
        while (i < j){
           swap(arr,i, j);
            i++;
            j--;

        }
       return arr;
    }

    private static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverseArray1(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        if (arr.length == 1)  return arr;
        int[] reverseArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i != -1; i--,j++) {
            reverseArr[j] = arr[i];
        }
        return reverseArr;
    }



    //3.2 Reverse a string
    //abcd---> dcba
    public static String reverseString(String str) {
        if (str == null || str.length() == 0) return null;
        if (str.length() == 1) return str;

        char[] chars = str.toCharArray();
        int i = 0,j = chars.length - 1;
        while (i < j){
            swap(chars,i, j);
            i++;
            j--;

        }

        return  String.valueOf(chars);

    }

    private static void swap(char[] arr,int i ,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public  void sortColors(int[] nums) {

        sortColors(nums,1);
    }


    private  void sortColors(int[] arr, int num) {
        int cur = 0, right = arr.length, left = -1;
        while (cur < right) {
            if (arr[cur] > num) {
                swap(arr, cur, --right);
            } else if (arr[cur] < num) {
                swap(arr, ++left, cur++);
            } else {
                cur++;
            }
        }

    }



}
