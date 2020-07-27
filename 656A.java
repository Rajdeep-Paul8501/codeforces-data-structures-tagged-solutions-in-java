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



  
public class cf1200A
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
   
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int t=f.nextInt();
    while(t-->0){
        int x=f.nextInt();
        int y=f.nextInt();
        int z=f.nextInt();
        int a;int b;int c;
        if(x==y){
            if(x>=z){
            a=x;
            b=z;
            c=z;
            System.out.println("YES");
            System.out.println(a+" "+ b+" "+ c);
            continue;
        }
        else{
            System.out.println("NO");
            continue;
        }
    }
    else if(y==z){
        if(y>=x){
            c=y;
            a=x;
            b=x;
             System.out.println("YES");
            System.out.println(a+" "+ b+" "+ c);
            continue;
        }
        else{
            System.out.println("NO");
        }

    }
else if(x==z){
        if(x>=y){
            c=y;
            a=y;
            b=x;
             System.out.println("YES");
            System.out.println(a+" "+ b+" "+ c);
            continue;
        }
        else{
            System.out.println("NO");
        }

    }
    else System.out.println("NO");

    
}
}
}


   
