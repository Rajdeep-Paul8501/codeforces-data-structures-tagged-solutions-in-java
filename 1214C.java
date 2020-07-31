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
    int n=f.cint();
    Stack<Character>s=new Stack<Character>();
    String str=f.cline();

    for(int i=0;i<n;i++){
        char c=str.charAt(i);
        if(c==')'){
            if(s.size()!=0&&s.peek()=='('){
                s.pop();

            }
            else{
                s.add(c);
            }
        }
            else{
                s.add(c);
            }
        
    }
    if(s.size()==0){
        System.out.println("YES");
        System.exit(0);
    }
    if(s.size()==2){
        char c1=s.pop();
        char c2=s.pop();
        if(c1=='('&&c2==')'){
            System.out.println("YES");
            System.exit(0);
        }
    }
    System.out.println("NO");
}
}






   
