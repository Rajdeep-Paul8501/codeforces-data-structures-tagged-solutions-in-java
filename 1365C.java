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
    static void rotate(int []a){
        int []b=new int[a.length];
        for(int i=0; i<a.length; i++){
            if(i<a.length-1)
                b[i+1]=a[i];
            else
                b[0]=a[i];
    }
    for(int i=0; i<a.length; i++){
        a[i]=b[i];
    }
}
    static int getvalue(int []a,int []b){
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]-b[i]==0)count++;
        }
        return count;
    }
    
    
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    HashMap<Integer,Integer>a=new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>b=new HashMap<Integer,Integer>();
    HashMap<Integer,Integer>shifts=new HashMap<Integer,Integer>();
    int n=f.cint();
    for(int i=0;i<n;i++){
        int t=f.cint();
        a.put(t,i+1);
    }
    for(int i=0; i<n;i++){
        int t=f.cint();
        b.put(t,i+1);
    }
    int max=0;
    for(int i=1; i<=n;i++){
        int ia=a.get(i);
        int ib=b.get(i);
        int t;
        if(ia>=ib){
            t=ia-ib;
        }
        else{
            t=n-ib+ia;
        }
        if(shifts.containsKey(t)){
            shifts.replace(t,shifts.get(t)+1);
            if(shifts.get(t)>max){
                max=shifts.get(t);

            }

        }
        else{
            shifts.put(t,1);
            if(shifts.get(t)>max){
                max=shifts.get(t);
        }
    }
}
System.out.println(max);
}
}














   
