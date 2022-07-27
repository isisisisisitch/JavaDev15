package ca.bytetube._12_anonymous;


public class Test {

    public static void main(String[] args) {
      /*1.code pass

        写一个工具类：统计某一段代码的执行时间
        */

//        Times.calDuration(new Times.Task() {
//
//            @Override
//            public void execute() {
//                test1();
//            }
//        });
//        long begin = System.currentTimeMillis();
//
//        int count = 100000;
//        String str = "";
//        for (int i = 0; i < count; i++) {
//            str += i;
//        }
//
//        long end = System.currentTimeMillis();
//
//        double duration = (end - begin)/1000;
//        System.out.println(duration);

        test2();
    }

    public static void test3() {
        Files.getAllFilesName("/Users/dalluo/Desktop/javadev/new_slides", new Files.Filter() {
            @Override
            public boolean accept(String fileName) {
                return fileName.contains("static");
            }
        });

    }

    public static void test2() {

        NetWorks.get("https://www.bytetube.ca?productName=code&category=it", new NetWorks.PageBean() {
            @Override
            public void success(Object response) {
                System.out.println("request successfully ");
            }

            @Override
            public void failure() {
                System.out.println("request failed ");
            }
        });

    }
    public static void test1() {
        int count = 100000;
        String str = "";
        for (int i = 0; i < count; i++) {
            str += i;
        }
    }
}
