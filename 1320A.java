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
    static void print(Object obj){
        System.out.println(obj);
    }
    static long[] forloop(int n,FastReader f){

        long []arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=f.clong();
        } 
        return arr;

    }
    
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int n=f.cint();
    long []arr=new long [n];long max=0;
    long []arr1=new long[n];
    HashMap<Long,Long> h=new HashMap<Long,Long>();
    arr=forloop(n,f);
    for(int i=0;i<n;i++){
        arr1[i]=arr[i]-(long)i-1;
        if(h.containsKey(arr1[i])){
            h.replace(arr1[i],h.get(arr1[i])+arr[i]);
            if(h.get(arr1[i])>max){
                max = h.get(arr1[i]);
            }
        }
        else{
            h.put(arr1[i],arr[i]);
            if(h.get(arr1[i])>max){
                max=h.get(arr1[i]);
            }
        }
    }
    print(max);

    
}
}



        



   
