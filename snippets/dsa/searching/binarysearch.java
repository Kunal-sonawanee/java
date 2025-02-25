package snippets.dsa.searching;
public class binarysearch{
    public static int binarySearch(int[] arr,int target){
        int s = 0,e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}