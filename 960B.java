import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
import java.util.StringTokenizer;
import java.io.DataInputStream; 
import java.io.FileInputStream;
import java.io.File;
import java.lang.*;
import java.net.*;



  
public class Main
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int cint() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long clong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double cdouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String cline() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
    static class mycoom implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            return b-a;
        }
    }
    
    
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int n=f.cint();
   int k1=f.cint();
   int k2=f.cint();
   int []a=new int[n];
   PriorityQueue<Integer> q=new PriorityQueue<Integer>(new mycoom());
   for(int i=0;i<n;i++){
    a[i]=f.cint();
   }
   for(int i=0;i<n;i++){
    a[i]-=f.cint();
    if(Math.abs(a[i])>0){
    q.add(Math.abs(a[i]));}
   }
   int value=k1+k2;
   
   while(value>0&&q.size()>0){
    int t=q.poll();
    t--;
    value--;
    if(t>0){
        q.add(t);
    }

   }
   long sum=0;
   if(q.size()>0){
    Iterator<Integer> it=q.iterator();
    while(it.hasNext()){
        sum+=Math.pow(it.next(),2);
    }
    System.out.println(sum);
   }
   else{
    if(value%2==0){
        System.out.println(0);
    }
    else{
        System.out.println(1);
    }
   }
}
}






   
