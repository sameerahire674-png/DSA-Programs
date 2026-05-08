import java.util.*;

public class sortarraycheck {
public static void main(String[] args) {
    int arr[]={10,20,30,40};
    int i;
    for(i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            System.out.println("Not Sorted");
            break;
        }
        }
        if(i==arr.length-1){
            System.out.println("Sorted Array");
        }

    }
}
    