
    import java.util.*;
import java.lang.*;
import java.io.*;
class searchelement{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
		// your code goes here
		int num=scan.nextInt();
		int num1=scan.nextInt();
		int  num2[]={7, 3,2 ,1};
		//for(int i=0;i<num2.length;i++){
		    //num=scan.nextInt();
		    //num1=scan.nextInt();
		boolean found1=false;
		boolean found2=false;
		for( int i=0;i<num2.length;i++){
		    if(num2[i]==num){
		        found1=true;
		    }
		    if(num2[i]==num1){
		        found2=true;
		    }
		}
		
		    if(found1 && found2){
		        System.out.println("Yes");
		    }else{
		        System.out.println("NO");
		    }
		}

	}

