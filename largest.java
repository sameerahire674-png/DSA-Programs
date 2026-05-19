//import java.util.*;
public class largest{
    public static void main(String[] args){
        int arr[]={10,54,20,65,45};
        int small=arr[0];
        int big=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
            if(arr[i]>big){
                big=arr[i];
            }
        }
        System.out.println("Smallest Number"+small);
        System.out.println("Largest NUmber:"+big);
    }
}