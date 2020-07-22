import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
import java.util.StringTokenizer;
 
  
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
  public static void main(String[] args){
    FastReader f=new FastReader();
    int t =f.nextInt();
    while(t>0){
        t--;
        int n= f.nextInt();int count1=0;int count2=0;
        for(int i=0;i<n;i++){
            int k=f.nextInt();
            if(i==0){
                count1=k;
            }
            else if(i==n-1){
                count2=k;
            }
            else continue;
 
        }
        if (count1<count2)System.out.println("Yes");
        else System.out.println("No");
    }
}
}
 
      
