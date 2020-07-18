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
   while(t-->0){
    int n=f.nextInt();
    int k =f.nextInt();
    int front=-1;int behind=0,length;
    int sum=0;
    int []arr=new int [n];
    for(int i=0;i<n;i++){
        arr[i]=f.nextInt();
        sum+=arr[i];


    }
    if (sum%k!=0){
        System.out.println(n);
    }
    else{
    for(int i=0;i<n;i++){
        if(arr[i]%k!=0){
            front=i;
            break;
        }
    }
    for(int i=n-1;i>-1;i--){
        if(arr[i]%k!=0){
            behind=i;
            break;
        }
    }
    length=n-Math.min(front+1,n-behind);
    if(length==n)System.out.println(-1);
    else System.out.println(length);
}
}
}
}

   
