import java.util.*;
public class ArrayArgument{
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30};
        update();
        for(int i-0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}