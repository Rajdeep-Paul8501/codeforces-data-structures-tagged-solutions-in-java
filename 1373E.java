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
public static int getsum(int n,int k){
    int sum=0;
    int t=(int)Math.ceil(((double)n/10))*10;
    System.out.println(t);

    if(t<=n+k){
        int value=0;int value1=0;
        String[] str=String.valueOf(n).split("");
        for(String s:str){
            value1+=Integer.parseInt(s);
        }
        value=value1;int value2=value1;
        for(int i=n+1;i<=t-1;i++){
            value1++;
            value+=value1;
        }
        value1=0;
        str=String.valueOf(t).split("");
        for(String s:str){
            value1+=Integer.parseInt(s);
        }
        for(int i=t;i<=n+k;i++){
            value+=(value1);
            value1++;
        }
        return value;
    }
    else{
        int value=0;int value1=0;
        String[] str=String.valueOf(n).split("");
        for(String s:str){
            value1+=Integer.parseInt(s);
        }
        value=value1;
        for(int i=n+1;i<=n+k;i++){
            value1++;
            value+=value1;
        }
        System.out.println(value);
        return value;
    }
    }

 
    
    
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int t=f.cint();
    
    while(t-->0){
        int n=f.cint();int count=0;
        int k=f.cint();
        for (int i=0;i<n;i++){

            if(getsum(i,k)==n){
                System.out.println(i);count++;
                break;
            }
            
        }
        if(count==0){
            System.out.println(-1);

        }
    }
}
}

