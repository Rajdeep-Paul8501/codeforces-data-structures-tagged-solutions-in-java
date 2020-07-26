import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
import java.util.StringTokenizer;
import java.io.DataInputStream; 
import java.io.FileInputStream;
import java.io.File;



  
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
  public static void main(String[] args)throws Exception{
   FastReader f=new FastReader();
   int n =f.nextInt();long sum=0;int count=0;int count2=0;
   for(int i=0;i<n;i++){
    int t=f.nextInt();
    if(t<0){
        sum+=-1-t;
        count++;
    }
    else if(t>0){
        sum+=t-1;
    }
    else{
        sum++;
        count2++;
    }
   }
   if(count%2==0||(count%2==1&&count2>0)){
    System.out.println(sum);
   }
   else{
    System.out.println(sum+2);
   }
}
}

   
