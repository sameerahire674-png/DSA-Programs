import java.util.*;

public class occurance {

    public static void main(String[] args) {
        int arr[]={10,20,30,40,10,20,10};
        int key=10;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println("The "+key+" number is occurance at "+count+" times..");
    }
}
