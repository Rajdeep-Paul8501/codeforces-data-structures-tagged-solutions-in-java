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
        int n=f.cint();
     
        String str="";
        for(int i=0;i<100;i++){
            str+="a";
        }
        System.out.println(str);
        for (int i=0;i<n;i++){
            String ans ="";
            int l=f.cint();
            ans+=str.substring(0,l);
            if(str.charAt(l)=='a'){
            for (int j=0;j<100-l;j++){
                ans+="b";
            }
        }
            else{
                for (int j=0;j<100-l;j++){
                ans+="a";
            }
        }

            System.out.println(ans);
            str=ans;


        }
    }
}
}
