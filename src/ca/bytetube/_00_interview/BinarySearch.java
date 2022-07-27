package ca.bytetube._00_interview;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {2,4, 8, 8,8,12,14};
        //System.out.println(indexOfByRecursion(arr, 4));
        System.out.println(search(arr,1));
        System.out.println(search(arr,15));
        System.out.println(search(arr,8));
    }

    public static int indexOf(int[] arr, int v) {
        if (arr == null || arr.length == 0) return -1;
        int begin = 0;
        int end = arr.length;

        while (begin < end) {
            int mid = (begin + end) >> 1;
            if (arr[mid] < v) {
                begin = mid + 1;
            } else if (arr[mid] > v) {
                end = mid;
            } else {
                return mid;
            }

        }

        return -1;

    }

    /**
     *
     *通过二分查找查询v在数组中的索引
     */
    public static int indexOfByRecursion(int[] arr, int v) {
        if (arr == null || arr.length == 0) return -1;

       return indexOfByRecursion(arr,0,arr.length,v);
    }

    /**
     *在[begin,end)区间内通过二分查找查询v在数组中的索引
     */
    private static int indexOfByRecursion(int[] arr, int begin, int end, int v) {

        if (begin <= end && begin < arr.length) {
            int mid =(begin + end) >> 1;

            if (arr[mid] == v) return mid;

            if (arr[mid] > v)   return indexOfByRecursion(arr,begin,mid - 1, v);

           else return indexOfByRecursion(arr,mid + 1,end, v);

        }

        return -1;



    }

    public static int search(int[] arr, int v) {
        if (arr == null || arr.length == 0) return -1;
        int begin = 0;
        int end = arr.length;
        while (begin < end){
            int mid = (begin + end) >> 1;
            if (v < arr[mid]) {
                end  = mid;
            }else {
                begin = mid + 1;
            }
        }

        return begin;
    }

}
