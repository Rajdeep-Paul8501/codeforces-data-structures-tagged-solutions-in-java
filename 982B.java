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
    TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>();
    Stack<Integer>q=new Stack<Integer>();
    for(int i=0;i<n;i++){
        int t=f.nextInt();
        map.put(t,i+1);
    }
    String str=f.next();
    for(int i=0;i<2*n;i++){
        if(str.charAt(i)=='0'){
            System.out.print(map.get(map.firstKey())+" ");
            q.add(map.get(map.firstKey()));
            map.remove(map.firstKey());
        }
        else{
            System.out.print(q.pop()+" ");

        }

    }
}
}
