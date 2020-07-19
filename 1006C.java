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
    int n=f.nextInt();
    int[]arr=new int[n];long sum1=0;long sum3=0;
    for (int i=0;i<n;i++){
        arr[i]=f.nextInt();
        sum1+=arr[i];
    }
    int y=0;
    int x=n-1;
    for(int i=0;i<n;i++){
        if(sum1>sum3){
            sum1-=arr[x];
            sum3+=arr[x];
            x--;
            y++;
        }
        else break;

    }

    int count=0;long sum2=sum3;
    y=n-y;
    
    while(count<=n){
        if(sum1==sum2){
            System.out.println(sum1);
            System.exit(0);
        }

        else if(sum1>sum2){
            count++;
            sum1-=arr[x];
            x--;
        }
        else if(sum2>sum1){
            count++;
            sum2-=arr[y];
            y++;
        }

    }
    System.out.println(0);
}
}


