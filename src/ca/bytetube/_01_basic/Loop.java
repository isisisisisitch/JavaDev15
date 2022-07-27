package ca.bytetube._01_basic;

public class Loop {
    public static void main(String[] args) {

//        for (int i = 0; i < 7; i++) {//完成换行
//            for (int j = 0; j <= i; j++) {//完成每一层*的打印
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }
        int i = 1;
        while (i < 10){
            int j = 1;
           while (j < 10){
               System.out.print(i+ " * " + j+  " = " + i * j + ", ");
               j++;
           }
            i++;
            System.out.println();

        }


//       while (true){
//            System.out.println("dead");
//        }

//        for (int i = 0; i < 10; i++) {
//            if (i == 5)  continue;
//
//            System.out.print(i+" ");
//        }

//        int i = 2;
//        do{
//            System.out.println("hello");
//            i++;
//        }while (i > 3);

//        int i = 1;
//        while (i < 10){
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }

//        for (int i = 1; i < 10 ; i++) {
//            if (i  % 2 == 0) {
//
//                if (i < 9) {
//                    System.out.print(i +",");
//                }else {
//                    System.out.print(i );
//                }
//            }
//
//        }

        }



}
