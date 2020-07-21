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
    int[] sher=new int[n];
    int[]mori=new int[n];
    String str=f.next();
    for(int i=0;i<n;i++){
        sher[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    
    str=f.next();

    for(int i=0;i<n;i++){mori[i]=Integer.parseInt(String.valueOf(str.charAt(i)));}


    Arrays.sort(sher);
    Arrays.sort(mori);int count1=0;int count2=0;
    int x=0;int y=0;
    while(y<n){
        if(sher[x]>mori[y]){
            y++;
        }
        else{
            x++;
            y++;
        }
    }
    count1=n-x;
       
    x=n-1;y=n-1;
    while(x>=0){
        if(mori[y]<=sher[x]){
            x--;
        }
        else{
            y--;
            count2++;
            x--;

        }
    }
    System.out.println(count1);
    System.out.println(count2);
}
}
