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
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
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
    static class urlReader{
        URL url;
        BufferedReader br; 
        StringTokenizer st; 

        public urlReader(URL url1){
            url = url1;
            try{
            br = new BufferedReader(new InputStreamReader(url.openStream()));
        }
        catch (IOException  e){
            System.out.println("GIVEN URL INVALID: " + url);
        }

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
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
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
    public static int count(String s){
        String str="abacaba";int cnt=0;


        for(int i=0; i<s.length()-6;i++){
            boolean ok =true;
            for(int j=0; j<7; j++){
                if(s.charAt(i+j)!=str.charAt(j)){
                    ok=false;

                }
            }
            if(ok==true)cnt++;
        }
        return cnt;
    }
    

  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int t=f.nextInt();String str="abacaba";
    while(t-->0){
        boolean fl=false;
        int n=f.nextInt();
        String s=f.nextLine();
        for(int i=0;i<=n-7;i++){
            StringBuilder ss=new StringBuilder(s);boolean ok=true;
            for (int j=0;j<7;j++){
                if(ss.charAt(i+j)!='?'&&ss.charAt(i+j)!=str.charAt(j)){
                    ok=false;
                    break;
                }
                else{
                    ss.replace(i+j,i+j+1,String.valueOf(str.charAt(j)));
                }
            }
            if(ok==true&&count(ss.toString())==1){
                for(int j=0;j<ss.length();j++)
                {
                    if(ss.charAt(j)=='?'){
                        ss.replace(j,j+1,"z");
                    }
                }
                fl=true;
                System.out.println("yes");
                System.out.println(ss.toString());
                break;
            }


        }
        if(!fl){
            System.out.println("no");
        }
    }
}
}
