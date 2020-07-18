/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
	    HashSet<Integer>hset = new HashSet<Integer>();
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    //int[] p1 = new int[x];
	    int c;
	    for(int i=0;i<x;i++){
	        c=sc.nextInt();
	        hset.add(c);
	    }
	    int y = sc.nextInt();
	    //int[] p2 = new int[y];
	    for(int i=0;i<y;i++){
	        c=sc.nextInt();
	        hset.add(c);
	    }
	    int k = hset.size();
	    if(k==n){
	        System.out.println("I become the guy.");
	    }
	    else{
	        System.out.println("Oh, my keyboard!");
	    }
	        
	    
