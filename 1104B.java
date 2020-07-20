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
    String str=f.next();
    Character[]arr=new Character[str.length()];
    for(int i=0;i<str.length();i++){
        arr[i]=str.charAt(i);
    }
    Stack<Character> stack=new Stack<Character>();
    char c;int count=0;

    for (int i=0;i<arr.length;i++){
        if(!stack.empty()&&arr[i]==stack.peek()){
            c=stack.pop();
            count++;
        }
        else{
            stack.push(arr[i]);
        }
    }
    if(count%2==0){
    System.out.println("No");
}
else{
    System.out.println("Yes");
}
}
}
