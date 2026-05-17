import java.util.*;
public class pairs {
    public static void pairsarr(int arr[]){
        int totalpairs=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+", "+arr[j]+")");
                 totalpairs++;
            }
           
            System.out.println();
        }
        System.out.println("The total pairs of the array number is :"+totalpairs);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        pairsarr(arr);
        
        
    }
}
