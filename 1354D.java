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



  
public class Main
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
  
        int cint() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long clong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double cdouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String cline() 
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
    static class mycoom implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            return b-a;
        }
    }
    
    
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int n =f.cint();
    int k=f.cint();
    PriorityQueue<Integer> q=new PriorityQueue<Integer>(new mycoom());
    for(int i=0;i<n;i++){
        q.add(f.cint());
    }
    int size=n;int max=q.peek();
    for(int i=0;i<k;i++){
        int query=f.cint();
        if(query>max){
            q.add(query);
            max=q.peek();
            size++;
        }
        else if(query<0 && Math.abs(query)==size){
            size--;
            q.poll();
            if(size!=0){
            max=q.peek();
        }
        }
        else if(query<0 && Math.abs(query)!=size){
            size--;
        }

        }
        if(size==0){
            System.out.println(0);
        }
        else{
            System.out.println(max);
        }
    }
}













   
