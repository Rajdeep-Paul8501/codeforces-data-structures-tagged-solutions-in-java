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
    int n =f.nextInt();
    int[]arr=new int[n];long sumx=0;long sumy=0;
    for (int i=0; i<n; i++){
        arr[i]=f.nextInt();
        sumx+=arr[i];
    }
    sumx-=arr[n-1];
    sumy+=arr[n-1];
    int x=n-2;int y=n-1;int count =0;
    while(x>=0){
        
        if (sumx==sumy){
            count++;
            sumx-=arr[x];
            sumy+=arr[x];
            x--;
            y--;
        }
        else{
            sumx-=arr[x];
            sumy+=arr[x];
            x--;
            y--;
        }

    }
    System.out.println(count);
}
}

