package level2;

import java.util.Scanner;

public class ReverseTheSentence {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str="prq.mno";//sc.next();
		int n =str.length()-1;
	String result="";
;	   for(int i=n;i>-1;i--)
	   {
		   int endIndex=i;
		   int j=i;
		   while(str.charAt(j)!='.'&&j>0)
		   {
			   
			   j--;
		   }
		   if(str.charAt(j)=='.') {
			   j++;
		   }
		   System.out.println(j+" "+endIndex);
		   for(int k=j;k<=endIndex;k++)
		   {
			 result=result+str.charAt(k);  
		   }
		   if(j!=0)
		   {
		   result=result+'.';
		   }
		   System.out.println(result);
		   i=j-1;
	   }

	}

}
