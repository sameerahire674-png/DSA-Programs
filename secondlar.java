import java.util.*;
public class secondlar {
public static void main(String[] args) {
    int arr[]={10,20,50,60,90};
    int num1=arr[0];
    int num2=arr[1];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>num1){
            num2=num1;
            num1=arr[i];
        }else if(arr[i]<num2 && arr[i]!=num1){
            num2=arr[i];
            }
        }
        if(num2!=arr[0]){
            System.out.println(num2);
        }

    }

}
    
