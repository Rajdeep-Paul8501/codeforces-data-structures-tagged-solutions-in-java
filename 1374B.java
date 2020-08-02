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
    
    
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int t=f.cint();
    while(t-->0){
        int n=f.cint();int count=0;int is=0;
        if(n%3!=0&&n!=1){
            System.out.println(-1);
            continue;
        }
        while(n!=1){
            if(n%3!=0){
                System.out.println(-1);
                is++;
                break;
            }
            if(n%6!=0){
                n=n*2;
                count++;
            }
            else{
                n=n/6;
                count++;
            }
        }
        if(is==1)continue;
        System.out.println(count);
    }
}
}
