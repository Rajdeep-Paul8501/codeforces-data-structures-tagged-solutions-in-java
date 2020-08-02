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
    
    
  public static void main(String[] args)throws Exception{
    FastReader f=new FastReader();
    int t=f.cint();
    Stack<Character> s=new Stack<Character>();
    while(t-->0){
        int n=f.cint();
        String str=f.cline();
        s.clear();
        for(int i=0;i<n;i++){
            if(str.charAt(i)==')'){
                if(s.size()>0&&s.peek()=='('){
                    s.pop();
            }
                else{
                    s.add(str.charAt(i));
                }

        }
            else{
                s.add(str.charAt(i));
            }
        }
        System.out.println(s.size()/2);
    }
}
}
