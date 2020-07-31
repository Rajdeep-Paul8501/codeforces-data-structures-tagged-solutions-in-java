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
    int t=f.cint();
    while(t-->0){
        int n=f.cint();
        int k=f.cint();
        int z=f.cint();
        int ans=0;
        int mx=0;
        int s=0;
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=f.cint();
        }
        for(int i=0;i<z+1;i++){
            int pos=k-2*t;
            if(pos<0)continue;
            mx=0;
            s=0;
            for(int j=0;j<pos+1;j++){
                if(j<n-1){
                    mx=Math.max(mx,a[j]+a[j+1]);
                }
                s+=a[i];
            }
            ans=Math.max(ans,s+mx*t);
        }
    System.out.println(ans);


        
    }
}
}












   
