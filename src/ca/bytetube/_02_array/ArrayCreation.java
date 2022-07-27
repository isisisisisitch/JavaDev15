package ca.bytetube._02_array;

import java.util.Random;

public class ArrayCreation {

    public static void main(String[] args) {
//        int i = 10;
//        int[] arr = new int[5];
//        System.out.println(arr);
//        int[] arr2 = {10,20,30,90};

//        int[] arr = new int[]{10,20,30,90};
////        int length =  arr.length;
////        System.out.println(arr[length - 1 ]);
//        arr[1] = 100;
//        System.out.println(arr[1]);

//
//        int[] arr = new int[]{10,20,30,90};
//        for (int i = arr.length - 1; i != -1; i--) {
//            System.out.print(arr[i]+" ");
//        }


//        int i = arr.length - 1;
//        while (i != -1){
//            System.out.print(arr[i]+" ");
//            i-=2;
//        }

//        for (int ele : arr) {
//            System.out.print(ele+" ");
//        }

//
//        int[] arr1 = new int[10];
//        arr1[1] = 10;
//
//
//        Random random = new Random();
//        for (int i = 0; i < arr1.length; i++) {
//            int randNum = random.nextInt(100);//[0,100)
//            arr1[i] = randNum;
//            System.out.print(arr1[i] + " ");
//        }
//
//
//        int[] arr2 = new int[5];
//
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = arr1[i];
//        }
//
//        arr1 = arr2;//[I@610455d6
//        System.out.println();
//
//
//        arr1[arr1.length - 1] = 100;
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }


        //int 0
        // double 0.0
        //char 0x0000
        //boolean false
//        arr[1] = 0;
//        String[] strings = new String[10];
//        strings[1] = "bytetube";
//        strings[1] = null;


//        int[][] gids2 = {{1,2,3},{10,11,12},{21,22,23}};
//        int[][] gids3 = new int[][] {{1,2,3},{10,11,12},{21,22,23}};
//
//        int[][] gids = new int[3][];
//        gids[0] = new int[4];
//        gids[1] = new int[10];
//        gids[2] = new int[2];
//
////        gids[0][1] = 100;
//        Random random = new Random();
//        for (int i = 0; i < gids.length; i++) {
//            for (int j = 0; j < gids[i].length; j++) {
//                int randNum = random.nextInt(100);
//                gids[i][j] = randNum;
//                System.out.print(gids[i][j] + "\t");
//            }
//
//            System.out.println();
//        }

//        System.out.println(gids);
//        System.out.println(gids[0] );
//        System.out.println(gids[0][2]);
        int[] array = getArray(10);
        array = assignArray(array, 1000);
        printArray(array);

        sum(10,20,30,40,50,1);
    }

    public static int[] getArray(int size){
        int defaultSize = 15;
        if (size  <= 0) {
            int[] arr = new int[defaultSize];
            return arr;
        }

        int[] arr = new int[size];//hard code
        return arr;
    }


    public static int[] assignArray(int[] arr, int bound){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randNum = random.nextInt(bound);
            arr[i] = randNum;
        }

        return arr;



    }

    public static void printArray(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int sum(int num1 , int num2){

        return num1 + num2;
    }

    public static int sum(int num1 , int num2, int num3){

        return num1 + num2 + num3;
    }

    public static int sum(double d , int... nums){
       int res = 0;
        for (int num : nums) {
            res += num;
        }

        return res;
    }



}
