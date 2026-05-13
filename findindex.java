import java.util.*;
public class findindex {
    public static int array(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
     int key=10;
    int arr[]={1,5,4,6,78,9,72,10};
    int index=array(arr,key);
        if(index==-1){
            System.out.println("NOT Found Elements..");
        }else{
            System.out.println("This elements is found at index :"+index);
        }        
    }
}

