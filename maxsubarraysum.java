public class maxsubarraysum {
    public static void  maxarraysum(int arr[]){
        int curr=0;
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr+=arr[k];
                }
             System.out.println(curr);
                if(maxnum<curr){
                    maxnum=curr;
                }
            }
        }
        System.out.println("The Subarray max number is ="+maxnum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxarraysum(arr);

    }
}
