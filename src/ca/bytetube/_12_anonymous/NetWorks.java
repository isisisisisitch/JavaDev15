package ca.bytetube._12_anonymous;

public class NetWorks {

    public interface PageBean{
        void success(Object response);
        void failure();
    }


    public static void get(String url,PageBean pb){
        //1.通过异步发送请求

        //2.请求完毕后，返回pb
        //....
        boolean res = true;
        if (res) {
            Object resp = null;
            pb.success(resp);
        }else {
            pb.failure();
        }

    }

}
