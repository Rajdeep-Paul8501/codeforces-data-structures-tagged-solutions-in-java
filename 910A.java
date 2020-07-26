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
   FastReader r=new FastReader();
   int n=r.nextInt(); 
   int j=r.nextInt();
   int []arr=new int[n];
   String rr=r.next();
   HashSet<Integer> h=new HashSet<Integer>();
   for(int i=0;i<n;i++){
    arr[i]=Integer.parseInt(String.valueOf(rr.charAt(i)));
    if (arr[i]==1){
        h.add(i);
    }
   }
   int now=0;int curr=j;int jumps=0;
   while(now!=n-1){
    if(curr==now){
        System.out.println(-1);
        System.exit(0);

    }
    if(!h.contains(curr)){
        curr--;
    }
    else{
        jumps++;
        now=curr;
        curr=now+j;
    }
   }
   System.out.println(jumps);
}
}
