import java.util.Scanner;
public class Free
{
    public static void main(String[] args)
    {
 	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word");
	String s=sc.next();	 
	char[] a;
	a=s.toCharArray();

	int m=(a.length-1)/2;
	for(int i=1;i<a.length;i++)
               {
	 for(int j=0;j<a.length;j++)
                       {
                               System.out.print(" ");
                       }
	
               for(int k=0;k<i;k++)
                       {
                               System.out.print(a[i]);
                       }
                     System.out.println();
               }             
    }
}