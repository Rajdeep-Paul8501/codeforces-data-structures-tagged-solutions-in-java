import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*; 
import java.util.StringTokenizer;
import java.io.DataInputStream; 
import java.io.FileInputStream;
import java.io.File;
import java.lang.*;



  
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
    static class mycomaparator implements Comparator<Integer>{
        public int compare(Integer a,Integer b){
            return a-b;
        }
    }
  public static void main(String[] args){
   FastReader f=new FastReader();
   int n =f.nextInt();long tc=0;
   long capacity=f.nextLong();
   long []arr=new long[n];
   int []cost=new int [n];
   for (int i=0;i<n;i++){
    long t=f.nextLong();
    arr[i]=t;
   }
   long plus=f.nextLong();
   for (int i=0;i<n;i++){
    cost[i]=f.nextInt();
   }
   PriorityQueue<Integer>q=new PriorityQueue<Integer>(new mycomaparator());
   for (int i=0;i<n;i++){
    q.add(cost[i]);
    if(arr[i]>capacity){
        Double t=Math.ceil((double)(arr[i]-capacity)/plus);
        if(q.size()<t){
            System.out.println(-1);
            System.exit(0);

        }
        else{
            for (int j=0;j<t;j++){
                tc+=q.poll();

            }
            capacity+=t*plus;
        }
    }

    else{
        continue;
    }
}
   
   System.out.println(tc);
}
}
