package ca.bytetube._17_strings;

public class CountSubString {
    public static void main(String[] args) {
        String text = "bbaaa  aacca";
        String pattern = "aa";

        System.out.println(countSubString(text,pattern));
    }





    public static int[] indexOf(String text, String pattern){
        if (text == null || pattern == null || text.length() == 0 || pattern.length() == 0) return null;
        int[] array = new int[text.length()];
        int index = 0;
        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            if (pattern.equals(text.substring(i, i + pattern.length()))) {
                array[index++] = i;
            }
        }

        int firstZeroIndex = findFirstZero(array);
        int[] newArray = new int[firstZeroIndex];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }


        return newArray;
    }


    private static int findFirstZero(int[] arr){

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == 0) return i;

        }

        return -1;

    }




    public static int countSubString(String text, String pattern) {
        if (text == null || pattern == null || text.length() == 0 || pattern.length()== 0) return 0;
        if (text.length() < pattern.length()) return 0;
        int index = -1;
        int count = 0;
        while ((index = text.indexOf(pattern)) != -1){
            count ++;
            text = text.substring(index + 1);
        }


        return count;
    }

    public static int CountSubString(String text, String pattern) {
        int count = 0;
        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            if (pattern.equals(text.substring(i, i + pattern.length()))) {
                count++;
            }

        }
        return count;
    }

//    public static int countSubString(String text, String pattern){
//
//        int count = 0;
//        //String patternWord = pattern;
//
//
//        while (text.length() >= pattern.length()){
//
//            if (text.contains(pattern)){
//                count++;
//                text = text.substring(text.lastIndexOf(pattern), text.length());
//            }
//        }
//        return count;
//
//
//    }
}
