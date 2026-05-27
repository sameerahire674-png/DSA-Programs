public class CountLastWord {

    public static void main(String[] args) {
        String str="Hello World!";
        int result=Length1(str);
        System.out.println(result);
    }
     public static int Length1(String s){
            String str=s.trim();
            int count=0;
            for(int i=str.length()-1;i>=0;i--){
                if(str.charAt(i)!=' '){
                    count++;
                }else{
                    break;
                }
            }
            return count;

        }
    }
